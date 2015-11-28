package com.azan.app.config.web;


public class MultiHttpSecurityConfig {
	
	
	/*@Configuration
	@Order(1)
	public static class FormLoginWebSecurityConfigurerAdapter extends
			WebSecurityConfigurerAdapter {

		@Autowired
		private RestAuthenticationEntryPoint authenticationEntryPoint;

		@Override
		public void configure(WebSecurity web) throws Exception {
			web.ignoring().antMatchers("/resources/**");
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
					.authorizeRequests()
					.antMatchers("/**").permitAll()
					.and()
					.sessionManagement()
					.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
					.and().httpBasic()
					.authenticationEntryPoint(authenticationEntryPoint).realmName("Protected API");
		}
		
		
	}

	@Configuration
	@Order(2)
	public static class ApiWebSecurityConfigurationAdapter extends
			WebSecurityConfigurerAdapter {

		@Autowired
		private RestAuthenticationEntryPoint authenticationEntryPoint;

		@Autowired
		private WebAppAuthFilter authFilter;

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests().antMatchers("/api/**").hasRole("USER")
					.anyRequest().authenticated().and().httpBasic()
					.authenticationEntryPoint(authenticationEntryPoint)
					.realmName("Protected API").and()
					.addFilterBefore(authFilter, ChannelProcessingFilter.class)
					.sessionManagement()
					.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		}
	}*/

}
