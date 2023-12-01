package br.com.gamebarato.config

import br.com.gamebarato.client.NintendoEshopRetrofitClient
import okhttp3.OkHttpClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

@Configuration
class RetrofitConfig {

    @Value("\${eshop-client.base-url}")
    private lateinit var eshopBaseUrl: String

    @Value("\${eshop-client.api-key}")
    private lateinit var apiKey: String

    @Value("\${eshop-client.application-id}")
    private lateinit var applicationId: String

    @Bean
    fun nintendoEshopRetrofitClient(): NintendoEshopRetrofitClient {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val original = chain.request()
                val request = original.newBuilder()
                    .header("Access-Control-Allow-Headers", "x-algolia-application-id,connection,origin,x-algolia-api-key,content-type,content-length,x-algolia-signature,x-algolia-user-id,x-algolia-usertoken,x-algolia-tagfilters,DNT,X-Mx-ReqToken,Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Authorization,Accept,Pragma")
                    .header("X-Algolia-Api-Key", apiKey)
                    .header("X-Algolia-Application-Id", applicationId)
                    .method(original.method, original.body)
                    .build()
                chain.proceed(request)
            }
            .build()

        return Retrofit.Builder()
            .baseUrl(eshopBaseUrl)
            .addConverterFactory(JacksonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(NintendoEshopRetrofitClient::class.java)
    }

    @Bean
    fun apiKey(): String {
        return apiKey
    }

    @Bean
    fun applicationId(): String {
        return applicationId
    }
}
