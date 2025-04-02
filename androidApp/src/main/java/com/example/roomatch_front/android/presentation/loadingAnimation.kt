package com.example.roomatch_front.android.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.LottieResult
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionResult
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.roomatch_front.android.R

@Composable
fun LoadingAnimation(isLoading: Boolean){
    if(isLoading){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            val compositionResult: LottieCompositionResult = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loading_animation))

            when(val composition = compositionResult.value){
                is LottieComposition ->{
                    LottieAnimation(
                        composition = composition,
                        iterations = LottieConstants.IterateForever //loop
                    )
                }
            }

        }
    }
}