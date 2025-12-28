.class public Lk/J;
.super Landroid/widget/TextView;
.source "SourceFile"


# instance fields
.field public final d:Lk/m;

.field public final e:Lk/F;

.field public final f:LB2/i;

.field public g:Lk/u;

.field public h:Z

.field public i:Lk/H;

.field public j:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lk/J;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 2
    invoke-static {p1}, Lk/K0;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lk/J;->h:Z

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lk/J;->i:Lk/H;

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lk/J0;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 6
    new-instance p1, Lk/m;

    invoke-direct {p1, p0}, Lk/m;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lk/J;->d:Lk/m;

    .line 7
    invoke-virtual {p1, p2, p3}, Lk/m;->d(Landroid/util/AttributeSet;I)V

    .line 8
    new-instance p1, Lk/F;

    invoke-direct {p1, p0}, Lk/F;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lk/J;->e:Lk/F;

    .line 9
    invoke-virtual {p1, p2, p3}, Lk/F;->d(Landroid/util/AttributeSet;I)V

    .line 10
    invoke-virtual {p1}, Lk/F;->b()V

    .line 11
    new-instance p1, LB2/i;

    const/16 v0, 0xa

    const/4 v1, 0x0

    .line 12
    invoke-direct {p1, v0, v1}, LB2/i;-><init>(IZ)V

    .line 13
    iput-object p0, p1, LB2/i;->e:Ljava/lang/Object;

    .line 14
    iput-object p1, p0, Lk/J;->f:LB2/i;

    .line 15
    invoke-direct {p0}, Lk/J;->getEmojiTextViewHelper()Lk/u;

    move-result-object p1

    .line 16
    invoke-virtual {p1, p2, p3}, Lk/u;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic d(Lk/J;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method

.method public static synthetic e(Lk/J;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    return-void
.end method

.method private getEmojiTextViewHelper()Lk/u;
    .locals 1

    iget-object v0, p0, Lk/J;->g:Lk/u;

    if-nez v0, :cond_0

    new-instance v0, Lk/u;

    invoke-direct {v0, p0}, Lk/u;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk/J;->g:Lk/u;

    :cond_0
    iget-object v0, p0, Lk/J;->g:Lk/u;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    iget-object v0, p0, Lk/J;->d:Lk/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/m;->a()V

    :cond_0
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lk/F;->b()V

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lk/J;->j:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lk/J;->j:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_1

    throw v1

    :cond_1
    invoke-static {p0}, LZ0/d;->z(Lk/J;)Lb1/c;

    throw v1

    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    sget-boolean v0, Lk/Y0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lk/F;->i:Lk/Q;

    iget v0, v0, Lk/Q;->e:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    sget-boolean v0, Lk/Y0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lk/F;->i:Lk/Q;

    iget v0, v0, Lk/Q;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    sget-boolean v0, Lk/Y0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lk/F;->i:Lk/Q;

    iget v0, v0, Lk/Q;->c:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    sget-boolean v0, Lk/Y0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lk/F;->i:Lk/Q;

    iget-object v0, v0, Lk/Q;->f:[I

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-boolean v0, Lk/Y0;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lk/F;->i:Lk/Q;

    iget v0, v0, Lk/Q;->a:I

    return v0

    :cond_2
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 2

    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    instance-of v1, v0, Lj1/o;

    if-eqz v1, :cond_0

    check-cast v0, Lj1/o;

    iget-object v0, v0, Lj1/o;->a:Landroid/view/ActionMode$Callback;

    :cond_0
    return-object v0
.end method

.method public getFirstBaselineToTopHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getLastBaselineToBottomHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getSuperCaller()Lk/G;
    .locals 2

    iget-object v0, p0, Lk/J;->i:Lk/H;

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Lk/I;

    invoke-direct {v0, p0}, Lk/I;-><init>(Lk/J;)V

    iput-object v0, p0, Lk/J;->i:Lk/H;

    goto :goto_0

    :cond_0
    new-instance v0, Lk/H;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lk/H;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lk/J;->i:Lk/H;

    :cond_1
    :goto_0
    iget-object v0, p0, Lk/J;->i:Lk/H;

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lk/J;->d:Lk/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/m;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lk/J;->d:Lk/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/m;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lk/J;->e:Lk/F;

    iget-object v0, v0, Lk/F;->h:LA1/e;

    if-eqz v0, :cond_0

    iget-object v0, v0, LA1/e;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lk/J;->e:Lk/F;

    iget-object v0, v0, Lk/F;->h:LA1/e;

    if-eqz v0, :cond_0

    iget-object v0, v0, LA1/e;->d:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lk/J;->f()V

    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lk/J;->f:LB2/i;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v1, Landroid/view/textclassifier/TextClassifier;

    if-nez v1, :cond_1

    iget-object v0, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lk/z;->a(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v1

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public getTextMetricsParamsCompat()Lb1/c;
    .locals 1

    invoke-static {p0}, LZ0/d;->z(Lk/J;)Lb1/c;

    move-result-object v0

    return-object v0
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 14

    const/16 v0, 0x800

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v3

    iget-object v4, p0, Lk/J;->e:Lk/F;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1e

    if-ge v4, v5, :cond_d

    if-eqz v3, :cond_d

    invoke-virtual {p0}, Lk/J;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    if-lt v4, v5, :cond_0

    invoke-static {p1, v6}, Li1/a;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt v4, v5, :cond_1

    invoke-static {p1, v6}, Li1/a;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_1
    iget v4, p1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget v5, p1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    if-le v4, v5, :cond_2

    move v7, v5

    goto :goto_0

    :cond_2
    move v7, v4

    :goto_0
    if-le v4, v5, :cond_3

    goto :goto_1

    :cond_3
    move v4, v5

    :goto_1
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const/4 v8, 0x0

    if-ltz v7, :cond_c

    if-le v4, v5, :cond_4

    goto/16 :goto_5

    :cond_4
    iget v9, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit16 v9, v9, 0xfff

    const/16 v10, 0x81

    if-eq v9, v10, :cond_b

    const/16 v10, 0xe1

    if-eq v9, v10, :cond_b

    const/16 v10, 0x12

    if-ne v9, v10, :cond_5

    goto/16 :goto_4

    :cond_5
    if-gt v5, v0, :cond_6

    invoke-static {p1, v6, v7, v4}, LZ0/d;->Q(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto/16 :goto_6

    :cond_6
    sub-int v5, v4, v7

    const/16 v8, 0x400

    if-le v5, v8, :cond_7

    move v8, v1

    goto :goto_2

    :cond_7
    move v8, v5

    :goto_2
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v9

    sub-int/2addr v9, v4

    sub-int/2addr v0, v8

    const-wide v10, 0x3fe999999999999aL    # 0.8

    int-to-double v12, v0

    mul-double/2addr v12, v10

    double-to-int v10, v12

    invoke-static {v7, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    sub-int v10, v0, v10

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    sub-int/2addr v0, v9

    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v7, v0

    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-static {v10}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v10

    if-eqz v10, :cond_8

    add-int/2addr v7, v2

    sub-int/2addr v0, v2

    :cond_8
    add-int v10, v4, v9

    sub-int/2addr v10, v2

    invoke-interface {v6, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-static {v10}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v10

    if-eqz v10, :cond_9

    sub-int/2addr v9, v2

    :cond_9
    add-int v10, v0, v8

    add-int v11, v10, v9

    if-eq v8, v5, :cond_a

    add-int v5, v7, v0

    invoke-interface {v6, v7, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    add-int/2addr v9, v4

    invoke-interface {v6, v4, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/CharSequence;

    aput-object v5, v6, v1

    aput-object v4, v6, v2

    invoke-static {v6}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_3

    :cond_a
    add-int/2addr v11, v7

    invoke-interface {v6, v7, v11}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    :goto_3
    invoke-static {p1, v1, v0, v10}, LZ0/d;->Q(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto :goto_6

    :cond_b
    :goto_4
    invoke-static {p1, v8, v1, v1}, LZ0/d;->Q(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto :goto_6

    :cond_c
    :goto_5
    invoke-static {p1, v8, v1, v1}, LZ0/d;->Q(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    :cond_d
    :goto_6
    invoke-static {v3, p1, p0}, LZ/b;->E(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V

    return-object v3
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    iget-object p1, p0, Lk/J;->e:Lk/F;

    if-eqz p1, :cond_0

    sget-boolean p2, Lk/Y0;->a:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Lk/F;->i:Lk/Q;

    invoke-virtual {p1}, Lk/Q;->a()V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-virtual {p0}, Lk/J;->f()V

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Lk/J;->e:Lk/F;

    if-eqz p1, :cond_0

    sget-boolean p2, Lk/Y0;->a:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Lk/F;->i:Lk/Q;

    invoke-virtual {p1}, Lk/Q;->f()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lk/Q;->a()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Lk/J;->getEmojiTextViewHelper()Lk/u;

    move-result-object v0

    iget-object v0, v0, Lk/u;->b:Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LZ/b;

    invoke-virtual {v0, p1}, LZ/b;->L(Z)V

    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    sget-boolean v0, Lk/Y0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3, p4}, Lk/F;->f(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    sget-boolean v0, Lk/Y0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lk/F;->g([II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    sget-boolean v0, Lk/Y0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lk/F;->h(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lk/J;->d:Lk/m;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk/m;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lk/J;->d:Lk/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/m;->f(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lk/J;->e:Lk/F;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk/F;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lk/J;->e:Lk/F;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk/F;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .locals 2

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 5
    invoke-static {v0, p1}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 6
    invoke-static {v0, p2}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 7
    invoke-static {v0, p3}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 8
    invoke-static {v0, p4}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 9
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Lk/J;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 10
    iget-object p1, p0, Lk/J;->e:Lk/F;

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p1}, Lk/F;->b()V

    :cond_4
    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lk/J;->e:Lk/F;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lk/F;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .locals 2

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 5
    invoke-static {v0, p1}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 6
    invoke-static {v0, p2}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 7
    invoke-static {v0, p3}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 8
    invoke-static {v0, p4}, LZ/b;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 9
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Lk/J;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 10
    iget-object p1, p0, Lk/J;->e:Lk/F;

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p1}, Lk/F;->b()V

    :cond_4
    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lk/J;->e:Lk/F;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lk/F;->b()V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p1, p0}, LZ0/d;->W(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lk/J;->getEmojiTextViewHelper()Lk/u;

    move-result-object v0

    iget-object v0, v0, Lk/u;->b:Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LZ/b;

    invoke-virtual {v0, p1}, LZ/b;->M(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Lk/J;->getEmojiTextViewHelper()Lk/u;

    move-result-object v0

    iget-object v0, v0, Lk/u;->b:Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, LZ/b;

    invoke-virtual {v0, p1}, LZ/b;->t([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    invoke-interface {v0, p1}, Lk/G;->i(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LZ0/d;->N(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    invoke-interface {v0, p1}, Lk/G;->h(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LZ0/d;->P(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLineHeight(I)V
    .locals 2

    invoke-static {p1}, LZ/b;->f(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method

.method public setPrecomputedText(Lb1/d;)V
    .locals 2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    throw v1

    :cond_0
    invoke-static {p0}, LZ0/d;->z(Lk/J;)Lb1/c;

    throw v1
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lk/J;->d:Lk/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/m;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lk/J;->d:Lk/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk/m;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lk/J;->e:Lk/F;

    invoke-virtual {v0, p1}, Lk/F;->i(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Lk/F;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lk/J;->e:Lk/F;

    invoke-virtual {v0, p1}, Lk/F;->j(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Lk/F;->b()V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lk/J;->e:Lk/F;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lk/F;->e(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lk/J;->f:LB2/i;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v0, LB2/i;->f:Ljava/lang/Object;

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lk/J;->getSuperCaller()Lk/G;

    move-result-object v0

    check-cast v0, Lk/H;

    iget-object v0, v0, Lk/H;->b:Ljava/lang/Object;

    check-cast v0, Lk/J;

    invoke-super {v0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "Lb1/d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lk/J;->j:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setTextMetricsParamsCompat(Lb1/c;)V
    .locals 5

    iget-object v0, p1, Lb1/c;->b:Landroid/text/TextDirectionHeuristic;

    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v4, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_2

    const/4 v2, 0x2

    goto :goto_0

    :cond_2
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_3

    const/4 v2, 0x3

    goto :goto_0

    :cond_3
    sget-object v4, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_4

    const/4 v2, 0x4

    goto :goto_0

    :cond_4
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_5

    const/4 v2, 0x5

    goto :goto_0

    :cond_5
    if-ne v0, v3, :cond_6

    const/4 v2, 0x6

    goto :goto_0

    :cond_6
    if-ne v0, v1, :cond_7

    const/4 v2, 0x7

    :cond_7
    :goto_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setTextDirection(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p1, Lb1/c;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    iget v0, p1, Lb1/c;->c:I

    invoke-static {p0, v0}, Lj1/l;->e(Landroid/widget/TextView;I)V

    iget p1, p1, Lb1/c;->d:I

    invoke-static {p0, p1}, Lj1/l;->h(Landroid/widget/TextView;I)V

    return-void
.end method

.method public final setTextSize(IF)V
    .locals 2

    sget-boolean v0, Lk/Y0;->a:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lk/J;->e:Lk/F;

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    iget-object v0, v1, Lk/F;->i:Lk/Q;

    invoke-virtual {v0}, Lk/Q;->f()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2}, Lk/Q;->g(IF)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;I)V
    .locals 2

    iget-boolean v0, p0, Lk/J;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-lez p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LV0/g;->a:La/a;

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lk/J;->h:Z

    if-eqz v0, :cond_3

    move-object p1, v0

    :cond_3
    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Lk/J;->h:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Lk/J;->h:Z

    throw p1
.end method
