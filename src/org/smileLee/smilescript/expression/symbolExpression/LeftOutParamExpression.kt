package org.smileLee.smilescript.expression.symbolExpression

import org.smileLee.smilescript.expression.*
import org.smileLee.smilescript.reformator.*
import org.smileLee.smilescript.stack.*
import org.smileLee.smilescript.value.*

/**
 * Created by Administrator on 2017/6/8.
 *
 * @author smileLee
 */
class LeftOutParamExpression : IExpression {
    override fun invoke(s: Stack): Value = Value()

    override fun toCodeString(tab: String) = CodeString("")
}