.class public final LO0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO0/e;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method


# virtual methods
.method public final a(LM0/d;LN0/b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget v3, v1, LM0/d;->V:I

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    iput v5, v2, LN0/b;->e:I

    iput v5, v2, LN0/b;->f:I

    iput v5, v2, LN0/b;->g:I

    return-void

    :cond_1
    iget v3, v2, LN0/b;->a:I

    iget v4, v2, LN0/b;->b:I

    iget v6, v2, LN0/b;->c:I

    iget v7, v2, LN0/b;->d:I

    iget v8, v0, LO0/e;->b:I

    iget v9, v0, LO0/e;->c:I

    add-int/2addr v8, v9

    iget v9, v0, LO0/e;->d:I

    iget-object v10, v1, LM0/d;->U:Landroid/view/View;

    invoke-static {v3}, Lp/f;->b(I)I

    move-result v11

    iget-object v12, v1, LM0/d;->z:LM0/c;

    iget-object v13, v1, LM0/d;->x:LM0/c;

    iget-object v14, v1, LM0/d;->g:[I

    const/4 v15, 0x1

    const/4 v5, 0x2

    if-eqz v11, :cond_c

    if-eq v11, v15, :cond_b

    if-eq v11, v5, :cond_5

    const/4 v6, 0x3

    if-eq v11, v6, :cond_2

    const/4 v6, 0x0

    :goto_0
    const/4 v9, 0x0

    goto/16 :goto_8

    :cond_2
    iget v6, v0, LO0/e;->f:I

    if-eqz v13, :cond_3

    iget v11, v13, LM0/c;->e:I

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    :goto_1
    if-eqz v12, :cond_4

    iget v15, v12, LM0/c;->e:I

    add-int/2addr v11, v15

    :cond_4
    add-int/2addr v9, v11

    const/4 v11, -0x1

    invoke-static {v6, v9, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    aput v11, v14, v5

    goto :goto_0

    :cond_5
    iget v6, v0, LO0/e;->f:I

    const/4 v11, -0x2

    invoke-static {v6, v9, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    iget v9, v1, LM0/d;->j:I

    const/4 v11, 0x1

    if-ne v9, v11, :cond_6

    const/4 v9, 0x1

    :goto_2
    const/4 v11, 0x0

    goto :goto_3

    :cond_6
    const/4 v9, 0x0

    goto :goto_2

    :goto_3
    aput v11, v14, v5

    iget-boolean v15, v2, LN0/b;->j:Z

    if-eqz v15, :cond_9

    if-eqz v9, :cond_8

    const/4 v15, 0x3

    aget v16, v14, v15

    if-eqz v16, :cond_8

    aget v15, v14, v11

    invoke-virtual/range {p1 .. p1}, LM0/d;->l()I

    move-result v11

    if-ne v15, v11, :cond_7

    goto :goto_4

    :cond_7
    const/4 v11, 0x1

    goto :goto_5

    :cond_8
    :goto_4
    const/4 v11, 0x0

    :goto_5
    if-eqz v9, :cond_a

    if-eqz v11, :cond_9

    goto :goto_6

    :cond_9
    const/high16 v11, 0x40000000    # 2.0f

    goto :goto_7

    :cond_a
    :goto_6
    invoke-virtual/range {p1 .. p1}, LM0/d;->l()I

    move-result v6

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v6, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    goto :goto_0

    :goto_7
    const/4 v9, 0x1

    goto :goto_8

    :cond_b
    const/high16 v11, 0x40000000    # 2.0f

    iget v6, v0, LO0/e;->f:I

    const/4 v15, -0x2

    invoke-static {v6, v9, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    aput v15, v14, v5

    goto :goto_7

    :cond_c
    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v6, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    aput v6, v14, v5

    move v6, v9

    goto :goto_0

    :goto_8
    invoke-static {v4}, Lp/f;->b(I)I

    move-result v11

    if-eqz v11, :cond_17

    const/4 v15, 0x1

    if-eq v11, v15, :cond_16

    if-eq v11, v5, :cond_10

    const/4 v7, 0x3

    if-eq v11, v7, :cond_d

    move v8, v7

    const/4 v7, 0x0

    const/4 v11, 0x0

    goto/16 :goto_12

    :cond_d
    iget v7, v0, LO0/e;->g:I

    if-eqz v13, :cond_e

    iget-object v11, v1, LM0/d;->y:LM0/c;

    iget v11, v11, LM0/c;->e:I

    goto :goto_9

    :cond_e
    const/4 v11, 0x0

    :goto_9
    if-eqz v12, :cond_f

    iget-object v12, v1, LM0/d;->A:LM0/c;

    iget v12, v12, LM0/c;->e:I

    add-int/2addr v11, v12

    :cond_f
    add-int/2addr v8, v11

    const/4 v11, -0x1

    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    const/4 v12, 0x3

    aput v11, v14, v12

    move v11, v7

    move v8, v12

    :goto_a
    const/4 v7, 0x0

    goto :goto_12

    :cond_10
    const/4 v12, 0x3

    iget v7, v0, LO0/e;->g:I

    const/4 v11, -0x2

    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v11

    iget v7, v1, LM0/d;->k:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_11

    move v7, v8

    :goto_b
    const/4 v13, 0x0

    goto :goto_c

    :cond_11
    const/4 v7, 0x0

    goto :goto_b

    :goto_c
    aput v13, v14, v12

    iget-boolean v12, v2, LN0/b;->j:Z

    if-eqz v12, :cond_14

    if-eqz v7, :cond_13

    aget v12, v14, v5

    if-eqz v12, :cond_13

    aget v12, v14, v8

    invoke-virtual/range {p1 .. p1}, LM0/d;->i()I

    move-result v8

    if-ne v12, v8, :cond_12

    goto :goto_d

    :cond_12
    const/4 v8, 0x1

    goto :goto_e

    :cond_13
    :goto_d
    const/4 v8, 0x0

    :goto_e
    if-eqz v7, :cond_15

    if-eqz v8, :cond_14

    goto :goto_f

    :cond_14
    const/high16 v12, 0x40000000    # 2.0f

    goto :goto_11

    :cond_15
    :goto_f
    invoke-virtual/range {p1 .. p1}, LM0/d;->i()I

    move-result v7

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    const/4 v7, 0x0

    :goto_10
    const/4 v8, 0x3

    goto :goto_12

    :goto_11
    const/4 v7, 0x1

    goto :goto_10

    :cond_16
    const/high16 v12, 0x40000000    # 2.0f

    iget v7, v0, LO0/e;->g:I

    const/4 v11, -0x2

    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    const/4 v8, 0x3

    aput v11, v14, v8

    move v11, v7

    const/4 v7, 0x1

    goto :goto_12

    :cond_17
    const/4 v8, 0x3

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    aput v7, v14, v8

    goto :goto_a

    :goto_12
    if-ne v3, v8, :cond_18

    const/4 v12, 0x1

    goto :goto_13

    :cond_18
    const/4 v12, 0x0

    :goto_13
    if-ne v4, v8, :cond_19

    const/4 v8, 0x1

    goto :goto_14

    :cond_19
    const/4 v8, 0x0

    :goto_14
    const/4 v13, 0x4

    const/4 v15, 0x1

    if-eq v4, v13, :cond_1b

    if-ne v4, v15, :cond_1a

    goto :goto_15

    :cond_1a
    const/4 v4, 0x0

    goto :goto_16

    :cond_1b
    :goto_15
    move v4, v15

    :goto_16
    if-eq v3, v13, :cond_1d

    if-ne v3, v15, :cond_1c

    goto :goto_17

    :cond_1c
    const/4 v3, 0x0

    goto :goto_18

    :cond_1d
    :goto_17
    const/4 v3, 0x1

    :goto_18
    const/4 v13, 0x0

    if-eqz v12, :cond_1e

    iget v15, v1, LM0/d;->L:F

    cmpl-float v15, v15, v13

    if-lez v15, :cond_1e

    const/4 v15, 0x1

    goto :goto_19

    :cond_1e
    const/4 v15, 0x0

    :goto_19
    if-eqz v8, :cond_1f

    iget v5, v1, LM0/d;->L:F

    cmpl-float v5, v5, v13

    if-lez v5, :cond_1f

    const/4 v5, 0x1

    goto :goto_1a

    :cond_1f
    const/4 v5, 0x0

    :goto_1a
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, LO0/d;

    iget-boolean v0, v2, LN0/b;->j:Z

    if-nez v0, :cond_21

    if-eqz v12, :cond_21

    iget v0, v1, LM0/d;->j:I

    if-nez v0, :cond_21

    if-eqz v8, :cond_21

    iget v0, v1, LM0/d;->k:I

    if-eqz v0, :cond_20

    goto :goto_1b

    :cond_20
    const/4 v0, -0x1

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    goto/16 :goto_24

    :cond_21
    :goto_1b
    instance-of v0, v10, LO0/q;

    if-eqz v0, :cond_22

    instance-of v0, v1, LM0/g;

    if-eqz v0, :cond_22

    move-object v0, v1

    check-cast v0, LM0/g;

    move-object v8, v10

    check-cast v8, LO0/q;

    invoke-virtual {v8, v0, v6, v11}, LO0/q;->h(LM0/g;II)V

    goto :goto_1c

    :cond_22
    invoke-virtual {v10, v6, v11}, Landroid/view/View;->measure(II)V

    :goto_1c
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v12

    if-eqz v9, :cond_23

    const/4 v9, 0x0

    aput v0, v14, v9

    const/16 v16, 0x2

    aput v8, v14, v16

    goto :goto_1d

    :cond_23
    const/4 v9, 0x0

    const/16 v16, 0x2

    aput v9, v14, v9

    aput v9, v14, v16

    :goto_1d
    if-eqz v7, :cond_24

    const/4 v7, 0x1

    aput v8, v14, v7

    const/16 v16, 0x3

    aput v0, v14, v16

    goto :goto_1e

    :cond_24
    const/4 v7, 0x1

    const/16 v16, 0x3

    aput v9, v14, v7

    aput v9, v14, v16

    :goto_1e
    iget v7, v1, LM0/d;->m:I

    if-lez v7, :cond_25

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v7

    goto :goto_1f

    :cond_25
    move v7, v0

    :goto_1f
    iget v14, v1, LM0/d;->n:I

    if-lez v14, :cond_26

    invoke-static {v14, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_26
    iget v14, v1, LM0/d;->p:I

    if-lez v14, :cond_27

    invoke-static {v14, v8}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_20

    :cond_27
    move v14, v8

    :goto_20
    iget v9, v1, LM0/d;->q:I

    if-lez v9, :cond_28

    invoke-static {v9, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    :cond_28
    const/high16 v9, 0x3f000000    # 0.5f

    if-eqz v15, :cond_29

    if-eqz v4, :cond_29

    iget v3, v1, LM0/d;->L:F

    int-to-float v4, v14

    mul-float/2addr v4, v3

    add-float/2addr v4, v9

    float-to-int v3, v4

    move v7, v3

    goto :goto_21

    :cond_29
    if-eqz v5, :cond_2a

    if-eqz v3, :cond_2a

    iget v3, v1, LM0/d;->L:F

    int-to-float v4, v7

    div-float/2addr v4, v3

    add-float/2addr v4, v9

    float-to-int v3, v4

    move v14, v3

    :cond_2a
    :goto_21
    if-ne v0, v7, :cond_2c

    if-eq v8, v14, :cond_2b

    goto :goto_22

    :cond_2b
    move v11, v12

    const/4 v0, -0x1

    goto :goto_24

    :cond_2c
    :goto_22
    if-eq v0, v7, :cond_2d

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v7, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    goto :goto_23

    :cond_2d
    const/high16 v0, 0x40000000    # 2.0f

    :goto_23
    if-eq v8, v14, :cond_2e

    invoke-static {v14, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    :cond_2e
    invoke-virtual {v10, v6, v11}, Landroid/view/View;->measure(II)V

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v3

    move v14, v0

    move v7, v11

    const/4 v0, -0x1

    move v11, v3

    :goto_24
    if-eq v11, v0, :cond_2f

    const/4 v0, 0x1

    goto :goto_25

    :cond_2f
    const/4 v0, 0x0

    :goto_25
    iget v3, v2, LN0/b;->c:I

    if-ne v7, v3, :cond_31

    iget v3, v2, LN0/b;->d:I

    if-eq v14, v3, :cond_30

    goto :goto_26

    :cond_30
    const/4 v5, 0x0

    goto :goto_27

    :cond_31
    :goto_26
    const/4 v5, 0x1

    :goto_27
    iput-boolean v5, v2, LN0/b;->i:Z

    iget-boolean v3, v13, LO0/d;->X:Z

    if-eqz v3, :cond_32

    const/4 v0, 0x1

    :cond_32
    if-eqz v0, :cond_33

    const/4 v3, -0x1

    if-eq v11, v3, :cond_33

    iget v1, v1, LM0/d;->P:I

    if-eq v1, v11, :cond_33

    const/4 v1, 0x1

    iput-boolean v1, v2, LN0/b;->i:Z

    :cond_33
    iput v7, v2, LN0/b;->e:I

    iput v14, v2, LN0/b;->f:I

    iput-boolean v0, v2, LN0/b;->h:Z

    iput v11, v2, LN0/b;->g:I

    return-void
.end method
