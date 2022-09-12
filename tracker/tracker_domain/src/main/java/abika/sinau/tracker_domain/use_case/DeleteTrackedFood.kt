package abika.sinau.tracker_domain.use_case

import abika.sinau.tracker_domain.model.TrackedFood
import abika.sinau.tracker_domain.repository.TrackerRepository

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}