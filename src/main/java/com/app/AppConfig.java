
package com.app;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.app.model.Developer;
import com.app.model.Document;
import com.app.model.Employee;
import com.app.model.Item;
import com.app.model.Order;
import com.app.model.Project;
import com.app.model.UOM;
import com.app.model.WhUserType;

@Configuration
@ComponentScan(basePackages = "com.app")
@EnableWebMvc
@EnableTransactionManagement
@PropertySource("classpath:app.properties")
public class AppConfig {
	@Autowired
	private Environment env;
//	 private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB


	@Bean
	public BasicDataSource dsobj() {
		BasicDataSource b = new BasicDataSource();

		b.setDriverClassName(env.getProperty("dc"));
		b.setUrl(env.getProperty("url"));
		b.setUsername(env.getProperty("un"));
		b.setPassword(env.getProperty("pwd"));

		b.setInitialSize(5);
		b.setMaxIdle(5);
		b.setMinIdle(3);
		b.setMaxTotal(5);
		return b;

	}

	// 2. SessionFactory Bean
	@Bean // => creating Object
	public LocalSessionFactoryBean sfObj() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(dsobj());
		sf.setAnnotatedClasses(Document.class,Employee.class,Item.class,UOM.class,Developer.class,Project.class,Order.class,WhUserType.class);
		sf.setHibernateProperties(props());
		return sf;
	}

	/* Hibernate Properties */
	private Properties props() {
		Properties p = new Properties();
		p.put("hibernate.dialect", env.getProperty("dialect"));
		p.put("hibernate.show_sql", env.getProperty("showsql"));
		p.put("hibernate.format_sql", env.getProperty("frtsql"));
		p.put("hibernate.hbm2ddl.auto", env.getProperty("hbddl"));
		return p;
	}

	// 3. HibernateTemplate Bean
	@Bean
	public HibernateTemplate htObj() {
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(sfObj().getObject());
		return ht;
	}

	// 4. HibernateTxManager Bean
	@Bean
	public HibernateTransactionManager htxm() {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sfObj().getObject());
		return htm;
	}

	// 5. ViewResolver Bean
	@Bean
	public InternalResourceViewResolver ivr() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix(env.getProperty("mvc.prefix"));
		vr.setSuffix(env.getProperty("mvc.suffix"));
		return vr;
	}
	
	 @Bean
	    public CommonsMultipartResolver multipartResolver() {

	        CommonsMultipartResolver cmr = new CommonsMultipartResolver();
	       // cmr.setMaxUploadSize(maxUploadSizeInMb * 2);
	        //cmr.setMaxUploadSizePerFile(maxUploadSizeInMb); //bytes
	        return cmr;
	 }

}
