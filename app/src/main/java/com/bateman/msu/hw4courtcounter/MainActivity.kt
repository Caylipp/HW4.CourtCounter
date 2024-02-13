package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    private val scoreViewModel : ScoreViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayForTeamA(scoreViewModel.currentScoreTeamA)
        displayForTeamB(scoreViewModel.currentScoreTeamB)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        scoreViewModel.updateScoreTeamA(scoreViewModel.currentScoreTeamA + 1)
        displayForTeamA(scoreViewModel.currentScoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        scoreViewModel.updateScoreTeamA(scoreViewModel.currentScoreTeamA + 2)
        displayForTeamA(scoreViewModel.currentScoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        scoreViewModel.updateScoreTeamA(scoreViewModel.currentScoreTeamA + 3)
        displayForTeamA(scoreViewModel.currentScoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        scoreViewModel.updateScoreTeamB(scoreViewModel.currentScoreTeamB + 1)
        displayForTeamB(scoreViewModel.currentScoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        scoreViewModel.updateScoreTeamB(scoreViewModel.currentScoreTeamB + 2)
        displayForTeamB(scoreViewModel.currentScoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        scoreViewModel.updateScoreTeamB(scoreViewModel.currentScoreTeamB + 3)
        displayForTeamB(scoreViewModel.currentScoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        scoreViewModel.updateScoreTeamA(0)
        scoreViewModel.updateScoreTeamB(0)
        displayForTeamA(scoreViewModel.currentScoreTeamA)
        displayForTeamB(scoreViewModel.currentScoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }


    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}