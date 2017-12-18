package cn.yzl.mvp.`for`.kotlin

import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiFile
import org.jetbrains.kotlin.psi.KtClass

/**
 * Created by YZL on 2017/9/11.
 */
class Modle {

    constructor()

    constructor(path: String?) {
        this.path = path
    }

    constructor(type: ClassTypeEnum?, name: String?, pkg: String?, path: String?) {
        this.type = type
        this.name = name
        this.pkg = pkg
        this.path = path
    }

    /**
     * 0 activity
     * 1 fragment
     * 2 v4.fragment
     */
    var type: ClassTypeEnum? = null
    /**
     * Activity,Fragment 的名称前缀
     */
    var name: String? = null
    /**
     * 包名
     */
    var pkg: String? = null
    /**
     * 路径
     */
    var path: String? = null

    var psiFile: PsiFile? = null

    var vFile: VirtualFile? = null

    var ktClass: KtClass? = null
}