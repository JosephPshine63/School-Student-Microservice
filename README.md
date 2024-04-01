# School-Student-Microservice  

**This microservice applications** is based on various components like  

**1. Gateway**  
this intercepts all the requests and send them to the correct service, be it *"/schools"* or  *"/students"*  

**2. School **  
A school has inside of it many students  *"/schools"*  

**3. Students **  
A student studies in one school, it's path is *"/students"* 

**4. Eureka Server**  
we use the eureka server to check the states of the varoius applications  

**5. Configuration server**  
we use a configuration server to store all the application properties in a single 'component'
