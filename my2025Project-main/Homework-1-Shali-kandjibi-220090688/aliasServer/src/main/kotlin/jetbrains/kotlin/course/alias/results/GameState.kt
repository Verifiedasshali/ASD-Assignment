package jetbrains.kotlin.course.alias.results

import jetbrains.kotlin.course.alias.card.Word
import jetbrains.kotlin.course.alias.team.Team
import jetbrains.kotlin.course.alias.util.Identifier
import kotlinx.serialization.Serializable

@Serializable
data class GameState(
    val gameHistory: List<GameResult>,
    val teamsStorage: Map<Identifier, Team>,
    val lastTeamId: Int,
    val lastCardId: Int,
    val usedWords: List<Word>
)