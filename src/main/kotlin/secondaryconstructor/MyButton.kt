package org.example.secondaryconstructor

import javax.naming.Context
import javax.swing.text.AttributeSet

class MyButton : View {
    constructor(ctx: Context)
    : super(ctx){
        // ...
    }

    constructor(ctx: Context, attr: AttributeSet)
    : super(ctx, attr){
        // ...
    }

/*    constructor(ctx: Context): this(ctx, MY_STYLE) {
        // ...
    }

    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr){
        // ...
    }*/
}