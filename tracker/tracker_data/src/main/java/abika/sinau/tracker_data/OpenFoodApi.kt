package abika.sinau.tracker_data

import abika.sinau.tracker_data.remote.SearchDto
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * @author by Abika Chairul Yusri on 9/7/2022
 */
interface OpenFoodApi {

    @GET("cgi/search.pl?search_simple=1&json=1&action=process&fields=product_name,nutriments,image_front_thumb_url")
    suspend fun searchFood(
        @Query("search_terms") query: String,
        @Query("page") page: Int,
        @Query("page_size") pageSize: Int
    ): SearchDto

    companion object {
        const val BASE_URL = "https://us.openfoodfacts.org/"
    }
}