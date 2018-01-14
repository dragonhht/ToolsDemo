# 一些工具的使用

#＃ [Swagger使用](./src/main/java/dragon/hht/swaggerdemo)

-   Swagger的依赖

```
<dependency>
	<groupId>io.springfox</groupId>
		<artifactId>springfox-swagger2</artifactId>
		<version>2.7.0</version>
	</dependency>
	<dependency>
		<groupId>io.springfox</groupId>
		<artifactId>springfox-swagger-ui</artifactId>
		<version>2.7.0</version>
</dependency>
```

-   SpringBoot 要使用Swagger须在启动类添加`@EnableSwagger2`注解

-   模型类注解

    -   `@ApiModel`: 用来为POJO类做注释
    
    -   `@ApiModelProperty`: 用来为POJO类中的属性做注释
    
-   Controller中的注解

    -   `@Api`: 通常为一个controller做注释，说明该Controller的职能

    -   `@ApiOperation`: 通常为一个接口做注解，　说明该接口的职能
    
    -   `@ApiImplicitParams`: 通常用来包含一组接口的参数注解
    
    -   `@ApiImplicitParam`: 用在`@ApiImplicitParams`注解中，说明一个请求参数的各个方面
    
        -   `paramType`: 参数所放置的位置，包含`query`,`header`,`path`,`body`及`form`。需要注意，query域中的值需要使用`@RequestParam`获取，header中的值需要使用`@ReqquestHeader`获取，path中的值需要使用`@PathVariable`来获取，body中的值需要使用`@RequestBody`来获取
        
        -   `name`: 参数名
        
        -   `dataType`: 参数类型
        
        -   `required`: 参数是否必须传
        
        -   `value`: 参数的值
        
        -   `defaultValue`: 参数的默认值
        
    -   `@ApiResponses`: 通常用来包含接口的一组相应注解
    
    -   `@ApiResponse`: 用在`@ApiResponses`中，一般用于表达一个错误的相应信息
    
        -   `code`: HttpCode数字，如400
        
        -   `message`: 信息