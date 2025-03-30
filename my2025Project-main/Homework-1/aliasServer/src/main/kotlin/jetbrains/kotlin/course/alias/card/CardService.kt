package jetbrains.kotlin.course.alias.card

import jetbrains.kotlin.course.alias.util.IdentifierFactory
import jetbrains.kotlin.course.alias.util.words
import org.springframework.stereotype.Service

@Service
class CardService(
    private val identifierFactory: IdentifierFactory = IdentifierFactory()) {

    private val cards: List<Card> = generateCards()

    companion object {
        private const val WORDS_IN_CARD = 4
        val cardsAmount: Int = words.size / WORDS_IN_CARD
    }

    private fun List<String>.toWords(): List<Word> {return this.map { Word(it) }}

    private fun generateCards(): List<Card> {
        val shuffledWords = words.shuffled()
        val wordChunks = shuffledWords.chunked(WORDS_IN_CARD).take(cardsAmount)
        return wordChunks.map { chunk ->
            val id = identifierFactory.uniqueIdentifier()
            Card(id, chunk.toWords())
        }
    }


    fun getCardByIndex(index: Int): Card {
        return cards.getOrElse(index) {
            throw IndexOutOfBoundsException("Card $index does not exist.")
        }
    }
}
