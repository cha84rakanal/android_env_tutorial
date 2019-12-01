package jp.cha84rakanal.hellotogglecolor_studio_kotlin

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import android.widget.Button
import android.view.View

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cLayout = ConstraintLayout(this)
        val button = Button(this)
        cLayout.addView(button)

        val viewId = View.generateViewId()
        button.id =  viewId
        button.text = "Hello World!"

        button.setOnClickListener {
            Log.v(MainActivity::class.java.simpleName, "onButtonClick")
        }

        val constraintSet = ConstraintSet()
        constraintSet.clone(cLayout)

        // android:layout_width="wrap_content"
        constraintSet.constrainHeight(button.id,
                ConstraintSet.WRAP_CONTENT)

        //android:layout_height="wrap_content"
        constraintSet.constrainWidth(button.id,
                ConstraintSet.WRAP_CONTENT)

        // app:layout_constraintBottom_toBottomOf="parent"
        constraintSet.connect(
                button.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM,
                0)

        // app:layout_constraintLeft_toLeftOf="parent"
        constraintSet.connect(
                button.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT,
                0)

        // app:layout_constraintRight_toRightOf="parent"
        constraintSet.connect(
                button.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT,
                0)

        // app:layout_constraintTop_toTopOf="parent"
        constraintSet.connect(
                button.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP,
                0)

        constraintSet.applyTo(cLayout)

        // ConstraintLayout set on ContentView
        setContentView(cLayout)
    }
}
