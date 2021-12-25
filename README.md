#

## 在nacos创建Namespaces，如spring-cloud-alibaba-practice
会自动生成Namespace ID，如f0f2ef4d-ef19-481d-ab05-501dc330e78f

则application.yaml里需要填入相应的namespace，如
```yaml
spring:
  application:
    name: restful-practice
  jackson:
    default-property-inclusion: non_null
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
        namespace: f0f2ef4d-ef19-481d-ab05-501dc330e78f
server:
  port: 8747

dubbo:
  registry:
    address: spring-cloud://localhost
  cloud:
      subscribed-services: "*"
```