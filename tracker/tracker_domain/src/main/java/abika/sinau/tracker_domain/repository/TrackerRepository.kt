package abika.sinau.tracker_domain.repository

import abika.sinau.tracker_domain.model.TrackableFood
import abika.sinau.tracker_domain.model.TrackedFood
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate


/**
 * @author by Abika Chairul Yusri on 9/7/2022
 */
interface TrackerRepository {

    suspend fun searchFood(
        query: String,
        page: Int,
        pageSize: Int
    ): Result<List<TrackableFood>>

    suspend fun insertTrackedFood(food: TrackedFood)

    suspend fun deleteTrackedFood(food: TrackedFood)

    fun getFoodsForDate(localDate: LocalDate): Flow<List<TrackedFood>>
}