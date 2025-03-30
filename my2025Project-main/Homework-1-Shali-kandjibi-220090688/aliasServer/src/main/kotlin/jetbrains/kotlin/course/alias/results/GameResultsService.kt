package jetbrains.kotlin.course.alias.results

import jetbrains.kotlin.course.alias.team.Team
import jetbrains.kotlin.course.alias.team.TeamService
import org.springframework.stereotype.Service

typealias GameResult = List<Team>

@Service
class GameResultsService {

    companion object {
        val gameHistory: MutableList<GameResult> = mutableListOf()
    }

    fun saveGameResults(result: GameResult){
        if (result.isEmpty()) {
            throw IllegalArgumentException("Result must not be empty.")
        }
        if (result.any { it.id !in TeamService.teamsStorage }) {
            throw IllegalArgumentException("All team IDs must be in the TeamService.teamsStorage.")
        }
        gameHistory.add(result)
    }
    fun getAllGameResults(): List<GameResult> {
        return gameHistory.reversed()
    }
}
