.class public final Lk/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:LA1/e;

.field public c:LA1/e;

.field public d:LA1/e;

.field public e:LA1/e;

.field public f:LA1/e;

.field public g:LA1/e;

.field public h:LA1/e;

.field public final i:Lk/Q;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk/F;->j:I

    const/4 v0, -0x1

    iput v0, p0, Lk/F;->k:I

    iput-object p1, p0, Lk/F;->a:Landroid/widget/TextView;

    new-instance v0, Lk/Q;

    invoke-direct {v0, p1}, Lk/Q;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk/F;->i:Lk/Q;

    return-void
.end method

.method public static c(Landroid/content/Context;Lk/r;I)LA1/e;
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lk/r;->a:Lk/u0;

    invoke-virtual {v0, p0, p2}, Lk/u0;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    if-eqz p0, :cond_0

    new-instance p1, LA1/e;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, LA1/e;->b:Z

    iput-object p0, p1, LA1/e;->c:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;LA1/e;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Lk/F;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Lk/r;->d(Landroid/graphics/drawable/Drawable;LA1/e;[I)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Lk/F;->b:LA1/e;

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v3, p0, Lk/F;->a:Landroid/widget/TextView;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk/F;->c:LA1/e;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk/F;->d:LA1/e;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk/F;->e:LA1/e;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v4, v0, v2

    iget-object v5, p0, Lk/F;->b:LA1/e;

    invoke-virtual {p0, v4, v5}, Lk/F;->a(Landroid/graphics/drawable/Drawable;LA1/e;)V

    const/4 v4, 0x1

    aget-object v4, v0, v4

    iget-object v5, p0, Lk/F;->c:LA1/e;

    invoke-virtual {p0, v4, v5}, Lk/F;->a(Landroid/graphics/drawable/Drawable;LA1/e;)V

    aget-object v4, v0, v1

    iget-object v5, p0, Lk/F;->d:LA1/e;

    invoke-virtual {p0, v4, v5}, Lk/F;->a(Landroid/graphics/drawable/Drawable;LA1/e;)V

    const/4 v4, 0x3

    aget-object v0, v0, v4

    iget-object v4, p0, Lk/F;->e:LA1/e;

    invoke-virtual {p0, v0, v4}, Lk/F;->a(Landroid/graphics/drawable/Drawable;LA1/e;)V

    :cond_1
    iget-object v0, p0, Lk/F;->f:LA1/e;

    if-nez v0, :cond_2

    iget-object v0, p0, Lk/F;->g:LA1/e;

    if-eqz v0, :cond_3

    :cond_2
    invoke-static {v3}, Lk/B;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Lk/F;->f:LA1/e;

    invoke-virtual {p0, v2, v3}, Lk/F;->a(Landroid/graphics/drawable/Drawable;LA1/e;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Lk/F;->g:LA1/e;

    invoke-virtual {p0, v0, v1}, Lk/F;->a(Landroid/graphics/drawable/Drawable;LA1/e;)V

    :cond_3
    return-void
.end method

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v8, p2

    const/4 v9, 0x1

    iget-object v10, v1, Lk/F;->a:Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    sget-object v2, Lk/r;->b:Landroid/graphics/PorterDuff$Mode;

    const-class v2, Lk/r;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lk/r;->c:Lk/r;

    if-nez v3, :cond_0

    invoke-static {}, Lk/r;->c()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2a

    :cond_0
    :goto_0
    sget-object v12, Lk/r;->c:Lk/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    sget-object v4, Lg/a;->f:[I

    invoke-static {v11, v0, v4, v8}, LB0/a;->y(Landroid/content/Context;Landroid/util/AttributeSet;[II)LB0/a;

    move-result-object v13

    iget-object v2, v1, Lk/F;->a:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v5, v13, LB0/a;->c:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Landroid/content/res/TypedArray;

    move-object/from16 v5, p1

    move/from16 v7, p2

    invoke-static/range {v2 .. v7}, Ld1/K;->i(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    iget-object v2, v13, LB0/a;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/res/TypedArray;

    const/4 v14, 0x0

    const/4 v15, -0x1

    invoke-virtual {v2, v14, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    const/4 v7, 0x3

    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2, v7, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {v11, v12, v4}, Lk/F;->c(Landroid/content/Context;Lk/r;I)LA1/e;

    move-result-object v4

    iput-object v4, v1, Lk/F;->b:LA1/e;

    :cond_1
    invoke-virtual {v2, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2, v9, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {v11, v12, v4}, Lk/F;->c(Landroid/content/Context;Lk/r;I)LA1/e;

    move-result-object v4

    iput-object v4, v1, Lk/F;->c:LA1/e;

    :cond_2
    const/4 v6, 0x4

    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2, v6, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {v11, v12, v4}, Lk/F;->c(Landroid/content/Context;Lk/r;I)LA1/e;

    move-result-object v4

    iput-object v4, v1, Lk/F;->d:LA1/e;

    :cond_3
    const/4 v5, 0x2

    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v2, v5, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-static {v11, v12, v4}, Lk/F;->c(Landroid/content/Context;Lk/r;I)LA1/e;

    move-result-object v4

    iput-object v4, v1, Lk/F;->e:LA1/e;

    :cond_4
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v9, 0x5

    invoke-virtual {v2, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-virtual {v2, v9, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    invoke-static {v11, v12, v5}, Lk/F;->c(Landroid/content/Context;Lk/r;I)LA1/e;

    move-result-object v5

    iput-object v5, v1, Lk/F;->f:LA1/e;

    :cond_5
    const/4 v5, 0x6

    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v17

    if-eqz v17, :cond_6

    invoke-virtual {v2, v5, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {v11, v12, v2}, Lk/F;->c(Landroid/content/Context;Lk/r;I)LA1/e;

    move-result-object v2

    iput-object v2, v1, Lk/F;->g:LA1/e;

    :cond_6
    invoke-virtual {v13}, LB0/a;->C()V

    invoke-virtual {v10}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    sget-object v13, Lg/a;->s:[I

    const/16 v5, 0xe

    const/16 v9, 0xf

    if-eq v3, v15, :cond_a

    new-instance v6, LB0/a;

    invoke-virtual {v11, v3, v13}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v3

    invoke-direct {v6, v11, v3}, LB0/a;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v2, :cond_7

    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v20

    if-eqz v20, :cond_7

    invoke-virtual {v3, v5, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v20

    move/from16 v21, v20

    const/16 v20, 0x1

    goto :goto_1

    :cond_7
    move/from16 v20, v14

    move/from16 v21, v20

    :goto_1
    invoke-virtual {v1, v11, v6}, Lk/F;->k(Landroid/content/Context;LB0/a;)V

    invoke-virtual {v3, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v22

    if-eqz v22, :cond_8

    invoke-virtual {v3, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v22

    const/16 v7, 0xd

    goto :goto_2

    :cond_8
    const/16 v7, 0xd

    const/16 v22, 0x0

    :goto_2
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v18

    if-eqz v18, :cond_9

    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_9
    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v6}, LB0/a;->C()V

    goto :goto_4

    :cond_a
    move/from16 v20, v14

    move/from16 v21, v20

    const/4 v3, 0x0

    const/16 v22, 0x0

    :goto_4
    new-instance v6, LB0/a;

    invoke-virtual {v11, v0, v13, v8, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v7

    invoke-direct {v6, v11, v7}, LB0/a;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v2, :cond_b

    invoke-virtual {v7, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual {v7, v5, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v21

    move/from16 v5, v21

    const/16 v20, 0x1

    goto :goto_5

    :cond_b
    move/from16 v5, v21

    :goto_5
    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v22

    :cond_c
    const/16 v13, 0xd

    invoke-virtual {v7, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v18

    if-eqz v18, :cond_d

    invoke-virtual {v7, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    :cond_d
    const/16 v13, 0x1c

    if-lt v4, v13, :cond_e

    invoke-virtual {v7, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {v7, v14, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    if-nez v4, :cond_e

    const/4 v4, 0x0

    invoke-virtual {v10, v14, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_e
    invoke-virtual {v1, v11, v6}, Lk/F;->k(Landroid/content/Context;LB0/a;)V

    invoke-virtual {v6}, LB0/a;->C()V

    if-nez v2, :cond_f

    if-eqz v20, :cond_f

    iget-object v2, v1, Lk/F;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_f
    iget-object v2, v1, Lk/F;->l:Landroid/graphics/Typeface;

    if-eqz v2, :cond_11

    iget v4, v1, Lk/F;->k:I

    if-ne v4, v15, :cond_10

    iget v4, v1, Lk/F;->j:I

    invoke-virtual {v10, v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_6

    :cond_10
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_11
    :goto_6
    if-eqz v3, :cond_12

    invoke-static {v10, v3}, Lk/D;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_12
    if-eqz v22, :cond_13

    invoke-static/range {v22 .. v22}, Lk/C;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v2

    invoke-static {v10, v2}, Lk/C;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    :cond_13
    sget-object v13, Lg/a;->g:[I

    iget-object v7, v1, Lk/F;->i:Lk/Q;

    iget-object v6, v7, Lk/Q;->j:Landroid/content/Context;

    invoke-virtual {v6, v0, v13, v8, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    iget-object v2, v7, Lk/Q;->i:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    move-object v4, v13

    move-object/from16 v16, v5

    const/4 v9, 0x2

    move-object/from16 v5, p1

    move-object/from16 v19, v6

    const/4 v15, 0x4

    move-object/from16 v6, v16

    move-object v9, v7

    move/from16 v7, p2

    invoke-static/range {v2 .. v7}, Ld1/K;->i(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    move-object/from16 v3, v16

    const/4 v2, 0x5

    invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v3, v2, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v9, Lk/Q;->a:I

    :cond_14
    invoke-virtual {v3, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    const/high16 v4, -0x40800000    # -1.0f

    if-eqz v2, :cond_15

    invoke-virtual {v3, v15, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    :goto_7
    const/4 v5, 0x2

    goto :goto_8

    :cond_15
    move v2, v4

    goto :goto_7

    :goto_8
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    :goto_9
    const/4 v5, 0x1

    goto :goto_a

    :cond_16
    move v6, v4

    goto :goto_9

    :goto_a
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    :goto_b
    const/4 v5, 0x3

    goto :goto_c

    :cond_17
    move v7, v4

    goto :goto_b

    :goto_c
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual {v3, v5, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    if-lez v8, :cond_1a

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v8}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/TypedArray;->length()I

    move-result v15

    new-array v5, v15, [I

    if-lez v15, :cond_19

    :goto_d
    if-ge v14, v15, :cond_18

    const/4 v4, -0x1

    invoke-virtual {v8, v14, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v17

    aput v17, v5, v14

    const/4 v4, 0x1

    add-int/2addr v14, v4

    const/high16 v4, -0x40800000    # -1.0f

    goto :goto_d

    :cond_18
    invoke-static {v5}, Lk/Q;->b([I)[I

    move-result-object v4

    iput-object v4, v9, Lk/Q;->f:[I

    invoke-virtual {v9}, Lk/Q;->i()Z

    :cond_19
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1a
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v9}, Lk/Q;->j()Z

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v3, :cond_1f

    iget v3, v9, Lk/Q;->a:I

    const/4 v5, 0x1

    if-ne v3, v5, :cond_20

    iget-boolean v3, v9, Lk/Q;->g:Z

    if-nez v3, :cond_1e

    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v8, v6, v5

    if-nez v8, :cond_1b

    const/high16 v6, 0x41400000    # 12.0f

    const/4 v8, 0x2

    invoke-static {v8, v6, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v6

    goto :goto_e

    :cond_1b
    const/4 v8, 0x2

    :goto_e
    cmpl-float v14, v7, v5

    if-nez v14, :cond_1c

    const/high16 v7, 0x42e00000    # 112.0f

    invoke-static {v8, v7, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v7

    :cond_1c
    cmpl-float v3, v2, v5

    if-nez v3, :cond_1d

    move v2, v4

    :cond_1d
    invoke-virtual {v9, v6, v7, v2}, Lk/Q;->k(FFF)V

    :cond_1e
    invoke-virtual {v9}, Lk/Q;->h()Z

    goto :goto_f

    :cond_1f
    const/4 v2, 0x0

    iput v2, v9, Lk/Q;->a:I

    :cond_20
    :goto_f
    sget-boolean v2, Lk/Y0;->a:Z

    if-eqz v2, :cond_22

    iget v2, v9, Lk/Q;->a:I

    if-eqz v2, :cond_22

    iget-object v2, v9, Lk/Q;->f:[I

    array-length v3, v2

    if-lez v3, :cond_22

    invoke-static {v10}, Lk/D;->a(Landroid/widget/TextView;)I

    move-result v3

    int-to-float v3, v3

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-float v3, v3, v5

    if-eqz v3, :cond_21

    iget v2, v9, Lk/Q;->d:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, v9, Lk/Q;->e:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v5, v9, Lk/Q;->c:F

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    const/4 v6, 0x0

    invoke-static {v10, v2, v3, v5, v6}, Lk/D;->b(Landroid/widget/TextView;IIII)V

    goto :goto_10

    :cond_21
    const/4 v6, 0x0

    invoke-static {v10, v2, v6}, Lk/D;->c(Landroid/widget/TextView;[II)V

    :cond_22
    :goto_10
    invoke-virtual {v11, v0, v13}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, v3, :cond_23

    invoke-virtual {v12, v11, v2}, Lk/r;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_11
    const/16 v5, 0xd

    goto :goto_12

    :cond_23
    const/4 v2, 0x0

    goto :goto_11

    :goto_12
    invoke-virtual {v0, v5, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    if-eq v5, v3, :cond_24

    invoke-virtual {v12, v11, v5}, Lk/r;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_13

    :cond_24
    const/4 v5, 0x0

    :goto_13
    const/16 v6, 0x9

    invoke-virtual {v0, v6, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    if-eq v6, v3, :cond_25

    invoke-virtual {v12, v11, v6}, Lk/r;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    :goto_14
    const/4 v7, 0x6

    goto :goto_15

    :cond_25
    const/4 v6, 0x0

    goto :goto_14

    :goto_15
    invoke-virtual {v0, v7, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    if-eq v7, v3, :cond_26

    invoke-virtual {v12, v11, v7}, Lk/r;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_16

    :cond_26
    const/4 v7, 0x0

    :goto_16
    const/16 v8, 0xa

    invoke-virtual {v0, v8, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    if-eq v8, v3, :cond_27

    invoke-virtual {v12, v11, v8}, Lk/r;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_17

    :cond_27
    const/4 v8, 0x0

    :goto_17
    const/4 v9, 0x7

    invoke-virtual {v0, v9, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    if-eq v9, v3, :cond_28

    invoke-virtual {v12, v11, v9}, Lk/r;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_18

    :cond_28
    const/4 v3, 0x0

    :goto_18
    if-nez v8, :cond_33

    if-eqz v3, :cond_29

    goto :goto_21

    :cond_29
    if-nez v2, :cond_2a

    if-nez v5, :cond_2a

    if-nez v6, :cond_2a

    if-eqz v7, :cond_38

    :cond_2a
    invoke-static {v10}, Lk/B;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const/4 v8, 0x0

    aget-object v9, v3, v8

    if-nez v9, :cond_30

    const/4 v12, 0x2

    aget-object v13, v3, v12

    if-eqz v13, :cond_2b

    goto :goto_1d

    :cond_2b
    invoke-virtual {v10}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v2, :cond_2c

    goto :goto_19

    :cond_2c
    aget-object v2, v3, v8

    :goto_19
    if-eqz v5, :cond_2d

    goto :goto_1a

    :cond_2d
    const/4 v5, 0x1

    aget-object v5, v3, v5

    :goto_1a
    if-eqz v6, :cond_2e

    goto :goto_1b

    :cond_2e
    const/4 v6, 0x2

    aget-object v6, v3, v6

    :goto_1b
    if-eqz v7, :cond_2f

    goto :goto_1c

    :cond_2f
    const/4 v7, 0x3

    aget-object v7, v3, v7

    :goto_1c
    invoke-virtual {v10, v2, v5, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_26

    :cond_30
    :goto_1d
    if-eqz v5, :cond_31

    :goto_1e
    const/4 v2, 0x2

    goto :goto_1f

    :cond_31
    const/4 v2, 0x1

    aget-object v5, v3, v2

    goto :goto_1e

    :goto_1f
    aget-object v2, v3, v2

    if-eqz v7, :cond_32

    goto :goto_20

    :cond_32
    const/4 v6, 0x3

    aget-object v7, v3, v6

    :goto_20
    invoke-static {v10, v9, v5, v2, v7}, Lk/B;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_26

    :cond_33
    :goto_21
    invoke-static {v10}, Lk/B;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v8, :cond_34

    goto :goto_22

    :cond_34
    const/4 v6, 0x0

    aget-object v8, v2, v6

    :goto_22
    if-eqz v5, :cond_35

    goto :goto_23

    :cond_35
    const/4 v5, 0x1

    aget-object v5, v2, v5

    :goto_23
    if-eqz v3, :cond_36

    goto :goto_24

    :cond_36
    const/4 v3, 0x2

    aget-object v3, v2, v3

    :goto_24
    if-eqz v7, :cond_37

    goto :goto_25

    :cond_37
    const/4 v6, 0x3

    aget-object v7, v2, v6

    :goto_25
    invoke-static {v10, v8, v5, v3, v7}, Lk/B;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_38
    :goto_26
    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3a

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_39

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_39

    invoke-static {v11, v3}, Lr2/a;->y(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_39

    goto :goto_27

    :cond_39
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :goto_27
    invoke-static {v10, v3}, Lj1/l;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_3a
    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3b

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/4 v5, 0x0

    invoke-static {v2, v5}, Lk/U;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    invoke-static {v10, v2}, Lj1/l;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    :goto_28
    const/16 v2, 0xf

    goto :goto_29

    :cond_3b
    const/4 v3, -0x1

    goto :goto_28

    :goto_29
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v5, 0x12

    invoke-virtual {v0, v5, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    const/16 v6, 0x13

    invoke-virtual {v0, v6, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eq v2, v3, :cond_3c

    invoke-static {v10, v2}, LZ0/d;->N(Landroid/widget/TextView;I)V

    :cond_3c
    if-eq v5, v3, :cond_3d

    invoke-static {v10, v5}, LZ0/d;->P(Landroid/widget/TextView;I)V

    :cond_3d
    if-eq v6, v3, :cond_3e

    invoke-static {v6}, LZ/b;->f(I)V

    invoke-virtual {v10}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq v6, v0, :cond_3e

    sub-int/2addr v6, v0

    int-to-float v0, v6

    invoke-virtual {v10, v0, v4}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_3e
    return-void

    :goto_2a
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final e(Landroid/content/Context;I)V
    .locals 5

    sget-object v0, Lg/a;->s:[I

    new-instance v1, LB0/a;

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-direct {v1, p1, p2}, LB0/a;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/16 v0, 0xe

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    iget-object v3, p0, Lk/F;->a:Landroid/widget/TextView;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p2, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    invoke-virtual {p2, v4, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, v1}, Lk/F;->k(Landroid/content/Context;LB0/a;)V

    const/16 p1, 0xd

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v3, p1}, Lk/D;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_2
    invoke-virtual {v1}, LB0/a;->C()V

    iget-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget p2, p0, Lk/F;->j:I

    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public final f(IIII)V
    .locals 2

    iget-object v0, p0, Lk/F;->i:Lk/Q;

    invoke-virtual {v0}, Lk/Q;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lk/Q;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    int-to-float p1, p1

    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    int-to-float p2, p2

    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    int-to-float p3, p3

    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Lk/Q;->k(FFF)V

    invoke-virtual {v0}, Lk/Q;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lk/Q;->a()V

    :cond_0
    return-void
.end method

.method public final g([II)V
    .locals 6

    iget-object v0, p0, Lk/F;->i:Lk/Q;

    invoke-virtual {v0}, Lk/Q;->j()Z

    move-result v1

    if-eqz v1, :cond_4

    array-length v1, p1

    const/4 v2, 0x0

    if-lez v1, :cond_3

    new-array v3, v1, [I

    if-nez p2, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    goto :goto_1

    :cond_0
    iget-object v4, v0, Lk/Q;->j:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    :goto_0
    if-ge v2, v1, :cond_1

    aget v5, p1, v2

    int-to-float v5, v5

    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-static {v3}, Lk/Q;->b([I)[I

    move-result-object p2

    iput-object p2, v0, Lk/Q;->f:[I

    invoke-virtual {v0}, Lk/Q;->i()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "None of the preset sizes is valid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    iput-boolean v2, v0, Lk/Q;->g:Z

    :goto_2
    invoke-virtual {v0}, Lk/Q;->h()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lk/Q;->a()V

    :cond_4
    return-void
.end method

.method public final h(I)V
    .locals 4

    iget-object v0, p0, Lk/F;->i:Lk/Q;

    invoke-virtual {v0}, Lk/Q;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Lk/Q;->j:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/high16 v1, 0x41400000    # 12.0f

    const/4 v2, 0x2

    invoke-static {v2, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    const/high16 v3, 0x42e00000    # 112.0f

    invoke-static {v2, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, p1, v2}, Lk/Q;->k(FFF)V

    invoke-virtual {v0}, Lk/Q;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lk/Q;->a()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown auto-size text type: "

    invoke-static {v1, p1}, LA/a;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p1, 0x0

    iput p1, v0, Lk/Q;->a:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Lk/Q;->d:F

    iput v1, v0, Lk/Q;->e:F

    iput v1, v0, Lk/Q;->c:F

    new-array v1, p1, [I

    iput-object v1, v0, Lk/Q;->f:[I

    iput-boolean p1, v0, Lk/Q;->b:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final i(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lk/F;->h:LA1/e;

    if-nez v0, :cond_0

    new-instance v0, LA1/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk/F;->h:LA1/e;

    :cond_0
    iget-object v0, p0, Lk/F;->h:LA1/e;

    iput-object p1, v0, LA1/e;->c:Ljava/lang/Object;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, LA1/e;->b:Z

    iput-object v0, p0, Lk/F;->b:LA1/e;

    iput-object v0, p0, Lk/F;->c:LA1/e;

    iput-object v0, p0, Lk/F;->d:LA1/e;

    iput-object v0, p0, Lk/F;->e:LA1/e;

    iput-object v0, p0, Lk/F;->f:LA1/e;

    iput-object v0, p0, Lk/F;->g:LA1/e;

    return-void
.end method

.method public final j(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lk/F;->h:LA1/e;

    if-nez v0, :cond_0

    new-instance v0, LA1/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk/F;->h:LA1/e;

    :cond_0
    iget-object v0, p0, Lk/F;->h:LA1/e;

    iput-object p1, v0, LA1/e;->d:Ljava/lang/Object;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, LA1/e;->a:Z

    iput-object v0, p0, Lk/F;->b:LA1/e;

    iput-object v0, p0, Lk/F;->c:LA1/e;

    iput-object v0, p0, Lk/F;->d:LA1/e;

    iput-object v0, p0, Lk/F;->e:LA1/e;

    iput-object v0, p0, Lk/F;->f:LA1/e;

    iput-object v0, p0, Lk/F;->g:LA1/e;

    return-void
.end method

.method public final k(Landroid/content/Context;LB0/a;)V
    .locals 11

    iget v0, p0, Lk/F;->j:I

    iget-object v1, p2, LB0/a;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/TypedArray;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lk/F;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    const/4 v4, -0x1

    if-lt v0, v3, :cond_0

    const/16 v5, 0xb

    invoke-virtual {v1, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    iput v5, p0, Lk/F;->k:I

    if-eq v5, v4, :cond_0

    iget v5, p0, Lk/F;->j:I

    and-int/2addr v5, v2

    iput v5, p0, Lk/F;->j:I

    :cond_0
    const/16 v5, 0xa

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v6, :cond_6

    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v8, p0, Lk/F;->m:Z

    invoke-virtual {v1, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    if-eq p1, v9, :cond_4

    if-eq p1, v2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_0
    return-void

    :cond_6
    :goto_1
    const/4 v6, 0x0

    iput-object v6, p0, Lk/F;->l:Landroid/graphics/Typeface;

    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_7

    move v5, v7

    :cond_7
    iget v6, p0, Lk/F;->k:I

    iget v7, p0, Lk/F;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v10, p0, Lk/F;->a:Landroid/widget/TextView;

    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v10, Lk/A;

    invoke-direct {v10, p0, v6, v7, p1}, Lk/A;-><init>(Lk/F;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Lk/F;->j:I

    invoke-virtual {p2, v5, p1, v10}, LB0/a;->n(IILk/A;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v3, :cond_9

    iget p2, p0, Lk/F;->k:I

    if-eq p2, v4, :cond_9

    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Lk/F;->k:I

    iget v0, p0, Lk/F;->j:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_8

    move v0, v9

    goto :goto_2

    :cond_8
    move v0, v8

    :goto_2
    invoke-static {p1, p2, v0}, Lk/E;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    goto :goto_3

    :cond_9
    iput-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    :cond_a
    :goto_3
    iget-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v9

    goto :goto_4

    :cond_b
    move p1, v8

    :goto_4
    iput-boolean p1, p0, Lk/F;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_e

    iget p2, p0, Lk/F;->k:I

    if-eq p2, v4, :cond_e

    invoke-static {p1, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Lk/F;->k:I

    iget v0, p0, Lk/F;->j:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_d

    move v8, v9

    :cond_d
    invoke-static {p1, p2, v8}, Lk/E;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    goto :goto_5

    :cond_e
    iget p2, p0, Lk/F;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lk/F;->l:Landroid/graphics/Typeface;

    :cond_f
    :goto_5
    return-void
.end method
