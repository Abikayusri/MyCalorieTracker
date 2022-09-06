package abika.sinau.tracker_data.local

import abika.sinau.tracker_data.local.entity.TrackedFoodEntity
import androidx.room.Database
import androidx.room.RoomDatabase


/**
 * @author by Abika Chairul Yusri on 9/7/2022
 */

@Database(
    entities = [TrackedFoodEntity::class],
    version = 1
)


abstract class TrackerDatabase: RoomDatabase() {
    abstract val dao: TrackerDao
}