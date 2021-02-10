package com.keennhoward.socialapp.firebase

import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth

class FirebaseSource {

    private val firebaseAuth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance()
    }

    fun register(email: String, password:String){
        firebaseAuth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(OnCompleteListener { task ->
                if(task.isSuccessful){

                }
            })
    }

    fun logout() = firebaseAuth.signOut()

    fun currentUser() = firebaseAuth.currentUser


}
