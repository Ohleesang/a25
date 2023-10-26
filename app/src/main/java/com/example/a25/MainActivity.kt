package com.example.a25

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(arr: IntArray, divisor: Int): IntArray {
                var res = mutableListOf<Int>()
                var answer = intArrayOf()
                for(index in 0..arr.size-1){
                    if(arr.get(index) % divisor ==0) res.add(arr.get(index))
                }
                if(res.isEmpty()) answer = intArrayOf(-1)
                else {
                    res.sort()
                    answer = res.toIntArray()
                }
                return answer
            }
        }
        val a = Solution()
        a.solution(intArrayOf(5, 9, 7, 10),	5)
        a.solution(intArrayOf(2, 36, 1, 3),	1)
        a.solution(intArrayOf(3, 2, 6),	10)
    }
}