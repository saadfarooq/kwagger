import io.swagger.v3.parser.core.extensions.SwaggerParserExtension

fun main(args: Array<String>) {
    SwaggerParserExtension
}
//    val swagger: Swagger = SwaggerParser().read("http://internal-claim-otro-usw1-775332223.us-west-1.elb.amazonaws.com:8883/v2/api-docs")
//
//    swagger.paths
//            .map { (endpointString, path) ->
//                path.operationMap.map {
//                    RetrofitInterfaceModel(
//                            httpMethod = it.key,
//                            endpointString = endpointString,
//                            operationName = it.value.summary,
//                            parameters = it.value.parameters
//                    )
//                }
//            }
//            .flatten()
//            .let { models ->
//                FileSpec.builder("com.metromile.data", "SwaggerInterface")
//                        .addType(
//                                TypeSpec.interfaceBuilder("SwaggerInterface")
//                                        .apply {
//                                            models.forEach {
//                                                addFunction(
//                                                        FunSpec.builder(it.operationName)
//                                                                .addAnnotation(
//                                                                        AnnotationSpec.builder(it.httpMethod.toRetrofitMethod())
//                                                                                .addMember("\"${it.endpointString}\"")
//                                                                                .build()
//                                                                )
//                                                                .apply {
//                                                                    it.parameters.forEach {
//                                                                        addParameter(ParameterSpec.builder(it.name, String::class).build())
//                                                                    }
//                                                                }
//                                                                .returns(ParameterizedTypeName.get(List::class, String::class))
//                                                                .build()
//                                                )
//                                            }
//                                        }.build()
//                        )
//                        .build()
//                        .writeTo(System.out)
//            }
//}
//
//    data class RetrofitInterfaceModel(val httpMethod: HttpMethod,
//                                      val endpointString: String,
//                                      val operationName: String,
//                                      val parameters: List<Parameter>)
//
//    fun HttpMethod.toRetrofitMethod() =
//            when (this) {
//                HttpMethod.GET -> retrofit2.http.GET::class
//                HttpMethod.POST -> retrofit2.http.POST::class
//                HttpMethod.DELETE -> retrofit2.http.DELETE::class
//                HttpMethod.HEAD -> retrofit2.http.HEAD::class
//                HttpMethod.OPTIONS -> retrofit2.http.OPTIONS::class
//                HttpMethod.PATCH -> retrofit2.http.PATCH::class
//                HttpMethod.PUT -> retrofit2.http.PUT::class
//            }
//
//    interface SwaggerInterface {
//        @GET("/ccs/claims/management/status/v3/{accountNumber}/claim/{claimNumber}")
//        fun getClaimByAccountNumberAndClaimNumberV3UsingGET(): String
//    }