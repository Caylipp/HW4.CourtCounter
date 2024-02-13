package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val CURRENT_SCORE_TEAM_A = "Current_Score_Team_A"
const val CURRENT_SCORE_TEAM_B = "Current_Score_Team_B"

class ScoreViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {

    private var scoreTeamA : Int
        get() = savedStateHandle.get(CURRENT_SCORE_TEAM_A)?:0
        set(value) = savedStateHandle.set(CURRENT_SCORE_TEAM_A, value)

    private var scoreTeamB : Int
        get() = savedStateHandle.get(CURRENT_SCORE_TEAM_B)?:0
        set(value) = savedStateHandle.set(CURRENT_SCORE_TEAM_B, value)


    val currentScoreTeamA: Int
        get() = scoreTeamA

    val currentScoreTeamB: Int
        get() = scoreTeamB


    fun updateScoreTeamA(value: Int){
        scoreTeamA = value
    }

    fun updateScoreTeamB(value: Int){
        scoreTeamB = value

    }
}




//    private val questionBank = listOf(
//        Question(R.string.question_australia, true),
//        Question(R.string.question_oceans, true),
//        Question(R.string.question_mideast, false),
//        Question(R.string.question_africa, false),
//        Question(R.string.question_americas, true),
//        Question(R.string.question_asia, true))
//
//    private var currentIndex : Int
//        get() = savedStateHandle.get(CURRENT_INDEX_KEY)?:0
//        set(value) = savedStateHandle.set(CURRENT_INDEX_KEY, value)
//
//    val currentQuestionAnswer : Boolean
//        get() = questionBank[currentIndex].answer
//    val currentQuestionText: Int
//        get() = questionBank[currentIndex].textResId
//
//    val currentQuestionIndex: Int
//        get() = currentIndex
//
//    val currentQuestionSize: Int
//        get() = questionBank.size
//
//    fun moveToNext(){
//        currentIndex = (currentIndex + 1) % questionBank.size
//    }
//
//}
