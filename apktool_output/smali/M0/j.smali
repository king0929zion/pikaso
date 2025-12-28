.class public abstract LM0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, LM0/j;->a:[Z

    return-void
.end method

.method public static a(LM0/e;LL0/e;I)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    const/4 v11, 0x2

    if-nez p2, :cond_0

    iget v1, v0, LM0/e;->l0:I

    iget-object v2, v0, LM0/e;->o0:[LM0/b;

    move v13, v1

    move-object v14, v2

    const/4 v15, 0x0

    goto :goto_0

    :cond_0
    iget v1, v0, LM0/e;->m0:I

    iget-object v2, v0, LM0/e;->n0:[LM0/b;

    move v13, v1

    move-object v14, v2

    move v15, v11

    :goto_0
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v13, :cond_6e

    aget-object v1, v14, v9

    iget-boolean v2, v1, LM0/b;->q:Z

    iget-object v8, v1, LM0/b;->a:LM0/d;

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/16 v7, 0x8

    const/16 v16, 0x0

    if-nez v2, :cond_19

    iget v2, v1, LM0/b;->l:I

    mul-int/lit8 v6, v2, 0x2

    move-object v12, v8

    move-object/from16 v19, v12

    const/16 v17, 0x0

    :goto_2
    if-nez v17, :cond_14

    iget v5, v1, LM0/b;->i:I

    add-int/2addr v5, v4

    iput v5, v1, LM0/b;->i:I

    iget-object v5, v12, LM0/d;->b0:[LM0/d;

    aput-object v16, v5, v2

    iget-object v5, v12, LM0/d;->a0:[LM0/d;

    aput-object v16, v5, v2

    iget v5, v12, LM0/d;->V:I

    iget-object v4, v12, LM0/d;->F:[LM0/c;

    if-eq v5, v7, :cond_f

    invoke-virtual {v12, v2}, LM0/d;->h(I)I

    aget-object v5, v4, v6

    invoke-virtual {v5}, LM0/c;->c()I

    add-int/lit8 v5, v6, 0x1

    aget-object v22, v4, v5

    invoke-virtual/range {v22 .. v22}, LM0/c;->c()I

    aget-object v22, v4, v6

    invoke-virtual/range {v22 .. v22}, LM0/c;->c()I

    aget-object v5, v4, v5

    invoke-virtual {v5}, LM0/c;->c()I

    iget-object v5, v1, LM0/b;->b:LM0/d;

    if-nez v5, :cond_1

    iput-object v12, v1, LM0/b;->b:LM0/d;

    :cond_1
    iput-object v12, v1, LM0/b;->d:LM0/d;

    iget-object v5, v12, LM0/d;->c0:[I

    aget v5, v5, v2

    if-ne v5, v3, :cond_f

    iget-object v7, v12, LM0/d;->l:[I

    aget v7, v7, v2

    if-eqz v7, :cond_3

    if-eq v7, v3, :cond_3

    if-ne v7, v11, :cond_2

    goto :goto_3

    :cond_2
    move/from16 v24, v9

    goto :goto_5

    :cond_3
    :goto_3
    iget v11, v1, LM0/b;->j:I

    const/16 v21, 0x1

    add-int/lit8 v11, v11, 0x1

    iput v11, v1, LM0/b;->j:I

    iget-object v11, v12, LM0/d;->Z:[F

    aget v11, v11, v2

    const/16 v20, 0x0

    cmpl-float v23, v11, v20

    if-lez v23, :cond_4

    iget v3, v1, LM0/b;->k:F

    add-float/2addr v3, v11

    iput v3, v1, LM0/b;->k:F

    :cond_4
    iget v3, v12, LM0/d;->V:I

    move/from16 v24, v9

    const/16 v9, 0x8

    if-eq v3, v9, :cond_8

    const/4 v3, 0x3

    if-ne v5, v3, :cond_8

    if-eqz v7, :cond_5

    if-ne v7, v3, :cond_8

    :cond_5
    const/4 v3, 0x0

    cmpg-float v5, v11, v3

    if-gez v5, :cond_6

    const/4 v3, 0x1

    iput-boolean v3, v1, LM0/b;->n:Z

    goto :goto_4

    :cond_6
    const/4 v3, 0x1

    iput-boolean v3, v1, LM0/b;->o:Z

    :goto_4
    iget-object v3, v1, LM0/b;->h:Ljava/util/ArrayList;

    if-nez v3, :cond_7

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, LM0/b;->h:Ljava/util/ArrayList;

    :cond_7
    iget-object v3, v1, LM0/b;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v3, v1, LM0/b;->f:LM0/d;

    if-nez v3, :cond_9

    iput-object v12, v1, LM0/b;->f:LM0/d;

    :cond_9
    iget-object v3, v1, LM0/b;->g:LM0/d;

    if-eqz v3, :cond_a

    iget-object v3, v3, LM0/d;->a0:[LM0/d;

    aput-object v12, v3, v2

    :cond_a
    iput-object v12, v1, LM0/b;->g:LM0/d;

    :goto_5
    if-nez v2, :cond_c

    iget v3, v12, LM0/d;->j:I

    if-eqz v3, :cond_b

    goto :goto_6

    :cond_b
    iget v3, v12, LM0/d;->m:I

    if-nez v3, :cond_e

    iget v3, v12, LM0/d;->n:I

    goto :goto_6

    :cond_c
    iget v3, v12, LM0/d;->k:I

    if-eqz v3, :cond_d

    goto :goto_6

    :cond_d
    iget v3, v12, LM0/d;->p:I

    if-nez v3, :cond_e

    iget v3, v12, LM0/d;->q:I

    :cond_e
    :goto_6
    move-object/from16 v3, v19

    goto :goto_7

    :cond_f
    move/from16 v24, v9

    goto :goto_6

    :goto_7
    if-eq v3, v12, :cond_10

    iget-object v3, v3, LM0/d;->b0:[LM0/d;

    aput-object v12, v3, v2

    :cond_10
    add-int/lit8 v3, v6, 0x1

    aget-object v3, v4, v3

    iget-object v3, v3, LM0/c;->d:LM0/c;

    if-eqz v3, :cond_11

    iget-object v3, v3, LM0/c;->b:LM0/d;

    iget-object v4, v3, LM0/d;->F:[LM0/c;

    aget-object v4, v4, v6

    iget-object v4, v4, LM0/c;->d:LM0/c;

    if-eqz v4, :cond_11

    iget-object v4, v4, LM0/c;->b:LM0/d;

    if-eq v4, v12, :cond_12

    :cond_11
    move-object/from16 v3, v16

    :cond_12
    if-eqz v3, :cond_13

    goto :goto_8

    :cond_13
    move-object v3, v12

    const/16 v17, 0x1

    :goto_8
    move-object/from16 v19, v12

    move/from16 v9, v24

    const/4 v4, 0x1

    const/16 v7, 0x8

    const/4 v11, 0x2

    move-object v12, v3

    const/4 v3, 0x3

    goto/16 :goto_2

    :cond_14
    move/from16 v24, v9

    iget-object v3, v1, LM0/b;->b:LM0/d;

    if-eqz v3, :cond_15

    iget-object v3, v3, LM0/d;->F:[LM0/c;

    aget-object v3, v3, v6

    invoke-virtual {v3}, LM0/c;->c()I

    :cond_15
    iget-object v3, v1, LM0/b;->d:LM0/d;

    if-eqz v3, :cond_16

    add-int/lit8 v6, v6, 0x1

    iget-object v3, v3, LM0/d;->F:[LM0/c;

    aget-object v3, v3, v6

    invoke-virtual {v3}, LM0/c;->c()I

    :cond_16
    iput-object v12, v1, LM0/b;->c:LM0/d;

    if-nez v2, :cond_17

    iget-boolean v2, v1, LM0/b;->m:Z

    if-eqz v2, :cond_17

    iput-object v12, v1, LM0/b;->e:LM0/d;

    goto :goto_9

    :cond_17
    iput-object v8, v1, LM0/b;->e:LM0/d;

    :goto_9
    iget-boolean v2, v1, LM0/b;->o:Z

    if-eqz v2, :cond_18

    iget-boolean v2, v1, LM0/b;->n:Z

    if-eqz v2, :cond_18

    const/4 v2, 0x1

    goto :goto_a

    :cond_18
    const/4 v2, 0x0

    :goto_a
    iput-boolean v2, v1, LM0/b;->p:Z

    const/4 v2, 0x1

    goto :goto_b

    :cond_19
    move/from16 v24, v9

    move v2, v4

    :goto_b
    iput-boolean v2, v1, LM0/b;->q:Z

    iget-object v11, v1, LM0/b;->c:LM0/d;

    iget-object v12, v1, LM0/b;->b:LM0/d;

    iget-object v9, v1, LM0/b;->d:LM0/d;

    iget-object v2, v1, LM0/b;->e:LM0/d;

    iget v3, v1, LM0/b;->k:F

    iget-object v4, v0, LM0/d;->c0:[I

    aget v4, v4, p2

    const/4 v7, 0x2

    if-ne v4, v7, :cond_1a

    const/4 v4, 0x1

    goto :goto_c

    :cond_1a
    const/4 v4, 0x0

    :goto_c
    if-nez p2, :cond_1e

    iget v5, v2, LM0/d;->X:I

    const/4 v6, 0x1

    if-nez v5, :cond_1b

    const/16 v21, 0x1

    goto :goto_d

    :cond_1b
    const/16 v21, 0x0

    :goto_d
    if-ne v5, v6, :cond_1c

    move/from16 v17, v6

    goto :goto_e

    :cond_1c
    const/16 v17, 0x0

    :goto_e
    if-ne v5, v7, :cond_1d

    move v5, v6

    goto :goto_f

    :cond_1d
    const/4 v5, 0x0

    :goto_f
    move/from16 v25, v3

    move-object v7, v8

    move/from16 v19, v21

    :goto_10
    const/4 v6, 0x0

    goto :goto_14

    :cond_1e
    const/4 v6, 0x1

    iget v5, v2, LM0/d;->Y:I

    if-nez v5, :cond_1f

    move/from16 v17, v6

    goto :goto_11

    :cond_1f
    const/16 v17, 0x0

    :goto_11
    if-ne v5, v6, :cond_20

    const/4 v6, 0x1

    goto :goto_12

    :cond_20
    const/4 v6, 0x0

    :goto_12
    if-ne v5, v7, :cond_21

    const/4 v5, 0x1

    goto :goto_13

    :cond_21
    const/4 v5, 0x0

    :goto_13
    move/from16 v25, v3

    move-object v7, v8

    move/from16 v19, v17

    move/from16 v17, v6

    goto :goto_10

    :goto_14
    iget-object v3, v0, LM0/d;->F:[LM0/c;

    move/from16 v26, v13

    if-nez v6, :cond_2e

    iget-object v13, v7, LM0/d;->F:[LM0/c;

    aget-object v13, v13, v15

    if-eqz v5, :cond_22

    const/16 v27, 0x1

    goto :goto_15

    :cond_22
    const/16 v27, 0x4

    :goto_15
    invoke-virtual {v13}, LM0/c;->c()I

    move-result v28

    move/from16 v29, v6

    iget-object v6, v7, LM0/d;->c0:[I

    move-object/from16 v30, v14

    aget v14, v6, p2

    move-object/from16 v31, v2

    const/4 v2, 0x3

    if-ne v14, v2, :cond_23

    iget-object v2, v7, LM0/d;->l:[I

    aget v2, v2, p2

    if-nez v2, :cond_23

    const/4 v2, 0x1

    goto :goto_16

    :cond_23
    const/4 v2, 0x0

    :goto_16
    iget-object v14, v13, LM0/c;->d:LM0/c;

    if-eqz v14, :cond_24

    if-eq v7, v8, :cond_24

    invoke-virtual {v14}, LM0/c;->c()I

    move-result v14

    add-int v28, v14, v28

    :cond_24
    move/from16 v14, v28

    if-eqz v5, :cond_25

    if-eq v7, v8, :cond_25

    if-eq v7, v12, :cond_25

    move-object/from16 v28, v8

    const/16 v27, 0x5

    goto :goto_17

    :cond_25
    move-object/from16 v28, v8

    :goto_17
    iget-object v8, v13, LM0/c;->d:LM0/c;

    if-eqz v8, :cond_28

    if-ne v7, v12, :cond_26

    move-object/from16 v32, v12

    iget-object v12, v13, LM0/c;->g:LL0/j;

    iget-object v8, v8, LM0/c;->g:LL0/j;

    move-object/from16 v33, v1

    const/4 v1, 0x6

    invoke-virtual {v10, v12, v8, v14, v1}, LL0/e;->f(LL0/j;LL0/j;II)V

    goto :goto_18

    :cond_26
    move-object/from16 v33, v1

    move-object/from16 v32, v12

    iget-object v1, v13, LM0/c;->g:LL0/j;

    iget-object v8, v8, LM0/c;->g:LL0/j;

    const/16 v12, 0x8

    invoke-virtual {v10, v1, v8, v14, v12}, LL0/e;->f(LL0/j;LL0/j;II)V

    :goto_18
    if-eqz v2, :cond_27

    if-nez v5, :cond_27

    const/4 v1, 0x5

    goto :goto_19

    :cond_27
    move/from16 v1, v27

    :goto_19
    iget-object v2, v13, LM0/c;->g:LL0/j;

    iget-object v8, v13, LM0/c;->d:LM0/c;

    iget-object v8, v8, LM0/c;->g:LL0/j;

    invoke-virtual {v10, v2, v8, v14, v1}, LL0/e;->e(LL0/j;LL0/j;II)V

    goto :goto_1a

    :cond_28
    move-object/from16 v33, v1

    move-object/from16 v32, v12

    :goto_1a
    iget-object v1, v7, LM0/d;->F:[LM0/c;

    if-eqz v4, :cond_2a

    iget v2, v7, LM0/d;->V:I

    const/16 v8, 0x8

    if-eq v2, v8, :cond_29

    aget v2, v6, p2

    const/4 v6, 0x3

    if-ne v2, v6, :cond_29

    add-int/lit8 v2, v15, 0x1

    aget-object v2, v1, v2

    iget-object v2, v2, LM0/c;->g:LL0/j;

    aget-object v6, v1, v15

    iget-object v6, v6, LM0/c;->g:LL0/j;

    const/4 v8, 0x0

    const/4 v12, 0x5

    invoke-virtual {v10, v2, v6, v8, v12}, LL0/e;->f(LL0/j;LL0/j;II)V

    goto :goto_1b

    :cond_29
    const/4 v8, 0x0

    :goto_1b
    aget-object v2, v1, v15

    iget-object v2, v2, LM0/c;->g:LL0/j;

    aget-object v3, v3, v15

    iget-object v3, v3, LM0/c;->g:LL0/j;

    const/16 v6, 0x8

    invoke-virtual {v10, v2, v3, v8, v6}, LL0/e;->f(LL0/j;LL0/j;II)V

    :cond_2a
    add-int/lit8 v2, v15, 0x1

    aget-object v1, v1, v2

    iget-object v1, v1, LM0/c;->d:LM0/c;

    if-eqz v1, :cond_2b

    iget-object v1, v1, LM0/c;->b:LM0/d;

    iget-object v2, v1, LM0/d;->F:[LM0/c;

    aget-object v2, v2, v15

    iget-object v2, v2, LM0/c;->d:LM0/c;

    if-eqz v2, :cond_2b

    iget-object v2, v2, LM0/c;->b:LM0/d;

    if-eq v2, v7, :cond_2c

    :cond_2b
    move-object/from16 v1, v16

    :cond_2c
    if-eqz v1, :cond_2d

    move-object v7, v1

    move/from16 v6, v29

    goto :goto_1c

    :cond_2d
    const/4 v6, 0x1

    :goto_1c
    move/from16 v13, v26

    move-object/from16 v8, v28

    move-object/from16 v14, v30

    move-object/from16 v2, v31

    move-object/from16 v12, v32

    move-object/from16 v1, v33

    goto/16 :goto_14

    :cond_2e
    move-object/from16 v33, v1

    move-object/from16 v31, v2

    move-object/from16 v28, v8

    move-object/from16 v32, v12

    move-object/from16 v30, v14

    if-eqz v9, :cond_31

    iget-object v1, v11, LM0/d;->F:[LM0/c;

    add-int/lit8 v2, v15, 0x1

    aget-object v1, v1, v2

    iget-object v1, v1, LM0/c;->d:LM0/c;

    if-eqz v1, :cond_31

    iget-object v1, v9, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v2

    iget-object v6, v9, LM0/d;->c0:[I

    aget v6, v6, p2

    const/4 v7, 0x3

    if-ne v6, v7, :cond_2f

    iget-object v6, v9, LM0/d;->l:[I

    aget v6, v6, p2

    if-nez v6, :cond_2f

    if-nez v5, :cond_2f

    iget-object v6, v1, LM0/c;->d:LM0/c;

    iget-object v7, v6, LM0/c;->b:LM0/d;

    if-ne v7, v0, :cond_2f

    iget-object v7, v1, LM0/c;->g:LL0/j;

    iget-object v6, v6, LM0/c;->g:LL0/j;

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v8

    neg-int v8, v8

    const/4 v12, 0x5

    invoke-virtual {v10, v7, v6, v8, v12}, LL0/e;->e(LL0/j;LL0/j;II)V

    goto :goto_1d

    :cond_2f
    const/4 v12, 0x5

    if-eqz v5, :cond_30

    iget-object v6, v1, LM0/c;->d:LM0/c;

    iget-object v7, v6, LM0/c;->b:LM0/d;

    if-ne v7, v0, :cond_30

    iget-object v7, v1, LM0/c;->g:LL0/j;

    iget-object v6, v6, LM0/c;->g:LL0/j;

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v8

    neg-int v8, v8

    const/4 v13, 0x4

    invoke-virtual {v10, v7, v6, v8, v13}, LL0/e;->e(LL0/j;LL0/j;II)V

    :cond_30
    :goto_1d
    iget-object v6, v1, LM0/c;->g:LL0/j;

    iget-object v7, v11, LM0/d;->F:[LM0/c;

    aget-object v2, v7, v2

    iget-object v2, v2, LM0/c;->d:LM0/c;

    iget-object v2, v2, LM0/c;->g:LL0/j;

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v1

    neg-int v1, v1

    const/4 v7, 0x6

    invoke-virtual {v10, v6, v2, v1, v7}, LL0/e;->g(LL0/j;LL0/j;II)V

    goto :goto_1e

    :cond_31
    const/4 v12, 0x5

    :goto_1e
    if-eqz v4, :cond_32

    add-int/lit8 v1, v15, 0x1

    aget-object v2, v3, v1

    iget-object v2, v2, LM0/c;->g:LL0/j;

    iget-object v3, v11, LM0/d;->F:[LM0/c;

    aget-object v1, v3, v1

    iget-object v3, v1, LM0/c;->g:LL0/j;

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v1

    const/16 v4, 0x8

    invoke-virtual {v10, v2, v3, v1, v4}, LL0/e;->f(LL0/j;LL0/j;II)V

    :cond_32
    move-object/from16 v1, v33

    iget-object v2, v1, LM0/b;->h:Ljava/util/ArrayList;

    if-eqz v2, :cond_3c

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_3c

    iget-boolean v6, v1, LM0/b;->n:Z

    if-eqz v6, :cond_33

    iget-boolean v6, v1, LM0/b;->p:Z

    if-nez v6, :cond_33

    iget v6, v1, LM0/b;->j:I

    int-to-float v6, v6

    goto :goto_1f

    :cond_33
    move/from16 v6, v25

    :goto_1f
    move-object/from16 v13, v16

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_20
    if-ge v8, v3, :cond_3c

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LM0/d;

    iget-object v4, v14, LM0/d;->Z:[F

    aget v4, v4, p2

    const/16 v20, 0x0

    cmpg-float v23, v4, v20

    iget-object v12, v14, LM0/d;->F:[LM0/c;

    if-gez v23, :cond_35

    iget-boolean v4, v1, LM0/b;->p:Z

    if-eqz v4, :cond_34

    add-int/lit8 v0, v15, 0x1

    aget-object v0, v12, v0

    iget-object v0, v0, LM0/c;->g:LL0/j;

    aget-object v4, v12, v15

    iget-object v4, v4, LM0/c;->g:LL0/j;

    const/4 v12, 0x0

    const/4 v14, 0x4

    invoke-virtual {v10, v0, v4, v12, v14}, LL0/e;->e(LL0/j;LL0/j;II)V

    move/from16 v23, v14

    goto :goto_23

    :cond_34
    const/16 v23, 0x4

    const/high16 v4, 0x3f800000    # 1.0f

    :goto_21
    const/16 v20, 0x0

    goto :goto_22

    :cond_35
    const/16 v23, 0x4

    goto :goto_21

    :goto_22
    cmpl-float v25, v4, v20

    if-nez v25, :cond_36

    add-int/lit8 v0, v15, 0x1

    aget-object v0, v12, v0

    iget-object v0, v0, LM0/c;->g:LL0/j;

    aget-object v4, v12, v15

    iget-object v4, v4, LM0/c;->g:LL0/j;

    const/4 v12, 0x0

    const/16 v14, 0x8

    invoke-virtual {v10, v0, v4, v12, v14}, LL0/e;->e(LL0/j;LL0/j;II)V

    :goto_23
    move-object/from16 v29, v2

    move/from16 v27, v3

    move/from16 v18, v12

    const/16 v20, 0x0

    goto/16 :goto_28

    :cond_36
    const/16 v18, 0x0

    if-eqz v13, :cond_3b

    iget-object v13, v13, LM0/d;->F:[LM0/c;

    aget-object v0, v13, v15

    iget-object v0, v0, LM0/c;->g:LL0/j;

    add-int/lit8 v27, v15, 0x1

    aget-object v13, v13, v27

    iget-object v13, v13, LM0/c;->g:LL0/j;

    move-object/from16 v29, v2

    aget-object v2, v12, v15

    iget-object v2, v2, LM0/c;->g:LL0/j;

    aget-object v12, v12, v27

    iget-object v12, v12, LM0/c;->g:LL0/j;

    move/from16 v27, v3

    invoke-virtual/range {p1 .. p1}, LL0/e;->k()LL0/c;

    move-result-object v3

    move-object/from16 v33, v14

    const/4 v14, 0x0

    iput v14, v3, LL0/c;->b:F

    cmpl-float v20, v6, v14

    const/high16 v14, -0x40800000    # -1.0f

    if-eqz v20, :cond_37

    cmpl-float v20, v7, v4

    if-nez v20, :cond_38

    :cond_37
    move/from16 v25, v4

    move v4, v14

    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    goto :goto_25

    :cond_38
    const/16 v20, 0x0

    cmpl-float v34, v7, v20

    if-nez v34, :cond_39

    iget-object v2, v3, LL0/c;->d:LL0/b;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-interface {v2, v0, v7}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v3, LL0/c;->d:LL0/b;

    invoke-interface {v0, v13, v14}, LL0/b;->b(LL0/j;F)V

    :goto_24
    move/from16 v25, v4

    goto :goto_26

    :cond_39
    const/high16 v14, 0x3f800000    # 1.0f

    if-nez v25, :cond_3a

    iget-object v0, v3, LL0/c;->d:LL0/b;

    invoke-interface {v0, v2, v14}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v3, LL0/c;->d:LL0/b;

    const/high16 v2, -0x40800000    # -1.0f

    invoke-interface {v0, v12, v2}, LL0/b;->b(LL0/j;F)V

    goto :goto_24

    :cond_3a
    div-float/2addr v7, v6

    div-float v25, v4, v6

    div-float v7, v7, v25

    move/from16 v25, v4

    iget-object v4, v3, LL0/c;->d:LL0/b;

    invoke-interface {v4, v0, v14}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v3, LL0/c;->d:LL0/b;

    const/high16 v4, -0x40800000    # -1.0f

    invoke-interface {v0, v13, v4}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v3, LL0/c;->d:LL0/b;

    invoke-interface {v0, v12, v7}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v3, LL0/c;->d:LL0/b;

    neg-float v4, v7

    invoke-interface {v0, v2, v4}, LL0/b;->b(LL0/j;F)V

    goto :goto_26

    :goto_25
    iget-object v7, v3, LL0/c;->d:LL0/b;

    invoke-interface {v7, v0, v14}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v3, LL0/c;->d:LL0/b;

    invoke-interface {v0, v13, v4}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v3, LL0/c;->d:LL0/b;

    invoke-interface {v0, v12, v14}, LL0/b;->b(LL0/j;F)V

    iget-object v0, v3, LL0/c;->d:LL0/b;

    invoke-interface {v0, v2, v4}, LL0/b;->b(LL0/j;F)V

    :goto_26
    invoke-virtual {v10, v3}, LL0/e;->c(LL0/c;)V

    goto :goto_27

    :cond_3b
    move-object/from16 v29, v2

    move/from16 v27, v3

    move/from16 v25, v4

    move-object/from16 v33, v14

    const/16 v20, 0x0

    :goto_27
    move/from16 v7, v25

    move-object/from16 v13, v33

    :goto_28
    add-int/lit8 v8, v8, 0x1

    move/from16 v3, v27

    move-object/from16 v2, v29

    const/4 v4, 0x1

    const/4 v12, 0x5

    move-object/from16 v0, p0

    goto/16 :goto_20

    :cond_3c
    const/16 v18, 0x0

    const/16 v23, 0x4

    if-eqz v32, :cond_44

    move-object/from16 v0, v32

    if-eq v0, v9, :cond_3d

    if-eqz v5, :cond_3e

    :cond_3d
    move-object/from16 v8, v28

    goto :goto_29

    :cond_3e
    move-object v14, v9

    move/from16 v12, v24

    move-object/from16 v8, v28

    goto/16 :goto_2f

    :goto_29
    iget-object v1, v8, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v15

    iget-object v2, v11, LM0/d;->F:[LM0/c;

    add-int/lit8 v3, v15, 0x1

    aget-object v2, v2, v3

    iget-object v1, v1, LM0/c;->d:LM0/c;

    if-eqz v1, :cond_3f

    iget-object v1, v1, LM0/c;->g:LL0/j;

    move-object v4, v1

    goto :goto_2a

    :cond_3f
    move-object/from16 v4, v16

    :goto_2a
    iget-object v1, v2, LM0/c;->d:LM0/c;

    if-eqz v1, :cond_40

    iget-object v1, v1, LM0/c;->g:LL0/j;

    move-object v6, v1

    goto :goto_2b

    :cond_40
    move-object/from16 v6, v16

    :goto_2b
    iget-object v1, v0, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v15

    iget-object v2, v9, LM0/d;->F:[LM0/c;

    aget-object v2, v2, v3

    if-eqz v4, :cond_42

    if-eqz v6, :cond_42

    if-nez p2, :cond_41

    move-object/from16 v3, v31

    iget v3, v3, LM0/d;->S:F

    :goto_2c
    move v5, v3

    goto :goto_2d

    :cond_41
    move-object/from16 v3, v31

    iget v3, v3, LM0/d;->T:F

    goto :goto_2c

    :goto_2d
    invoke-virtual {v1}, LM0/c;->c()I

    move-result v7

    invoke-virtual {v2}, LM0/c;->c()I

    move-result v8

    iget-object v3, v1, LM0/c;->g:LL0/j;

    iget-object v12, v2, LM0/c;->g:LL0/j;

    const/4 v13, 0x7

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v4

    move v4, v7

    const/4 v14, 0x2

    move-object v7, v12

    move-object v14, v9

    move/from16 v12, v24

    move v9, v13

    invoke-virtual/range {v1 .. v9}, LL0/e;->b(LL0/j;LL0/j;IFLL0/j;LL0/j;II)V

    goto :goto_2e

    :cond_42
    move-object v14, v9

    move/from16 v12, v24

    :cond_43
    :goto_2e
    move/from16 v22, v12

    goto/16 :goto_49

    :cond_44
    move-object v14, v9

    move/from16 v12, v24

    move-object/from16 v8, v28

    move-object/from16 v0, v32

    :goto_2f
    if-eqz v19, :cond_57

    if-eqz v0, :cond_57

    iget v2, v1, LM0/b;->j:I

    if-lez v2, :cond_45

    iget v1, v1, LM0/b;->i:I

    if-ne v1, v2, :cond_45

    const/16 v21, 0x1

    goto :goto_30

    :cond_45
    move/from16 v21, v18

    :goto_30
    move-object v9, v0

    move-object v13, v9

    :goto_31
    if-eqz v13, :cond_43

    iget-object v1, v13, LM0/d;->b0:[LM0/d;

    aget-object v1, v1, p2

    move-object v7, v1

    :goto_32
    if-eqz v7, :cond_46

    iget v1, v7, LM0/d;->V:I

    const/16 v6, 0x8

    if-ne v1, v6, :cond_47

    iget-object v1, v7, LM0/d;->b0:[LM0/d;

    aget-object v7, v1, p2

    goto :goto_32

    :cond_46
    const/16 v6, 0x8

    :cond_47
    if-nez v7, :cond_49

    if-ne v13, v14, :cond_48

    goto :goto_33

    :cond_48
    move-object/from16 v22, v7

    move-object/from16 v35, v8

    move-object/from16 v20, v9

    goto/16 :goto_3b

    :cond_49
    :goto_33
    iget-object v1, v13, LM0/d;->F:[LM0/c;

    aget-object v2, v1, v15

    iget-object v3, v2, LM0/c;->g:LL0/j;

    iget-object v4, v2, LM0/c;->d:LM0/c;

    if-eqz v4, :cond_4a

    iget-object v4, v4, LM0/c;->g:LL0/j;

    goto :goto_34

    :cond_4a
    move-object/from16 v4, v16

    :goto_34
    if-eq v9, v13, :cond_4b

    iget-object v4, v9, LM0/d;->F:[LM0/c;

    add-int/lit8 v5, v15, 0x1

    aget-object v4, v4, v5

    iget-object v4, v4, LM0/c;->g:LL0/j;

    goto :goto_35

    :cond_4b
    if-ne v13, v0, :cond_4d

    if-ne v9, v13, :cond_4d

    iget-object v4, v8, LM0/d;->F:[LM0/c;

    aget-object v4, v4, v15

    iget-object v4, v4, LM0/c;->d:LM0/c;

    if-eqz v4, :cond_4c

    iget-object v4, v4, LM0/c;->g:LL0/j;

    goto :goto_35

    :cond_4c
    move-object/from16 v4, v16

    :cond_4d
    :goto_35
    invoke-virtual {v2}, LM0/c;->c()I

    move-result v2

    add-int/lit8 v5, v15, 0x1

    aget-object v20, v1, v5

    invoke-virtual/range {v20 .. v20}, LM0/c;->c()I

    move-result v20

    if-eqz v7, :cond_4e

    iget-object v6, v7, LM0/d;->F:[LM0/c;

    aget-object v6, v6, v15

    move-object/from16 v23, v7

    iget-object v7, v6, LM0/c;->g:LL0/j;

    aget-object v1, v1, v5

    iget-object v1, v1, LM0/c;->g:LL0/j;

    :goto_36
    move-object/from16 v24, v1

    goto :goto_38

    :cond_4e
    move-object/from16 v23, v7

    iget-object v6, v11, LM0/d;->F:[LM0/c;

    aget-object v6, v6, v5

    iget-object v6, v6, LM0/c;->d:LM0/c;

    if-eqz v6, :cond_4f

    iget-object v7, v6, LM0/c;->g:LL0/j;

    goto :goto_37

    :cond_4f
    move-object/from16 v7, v16

    :goto_37
    aget-object v1, v1, v5

    iget-object v1, v1, LM0/c;->g:LL0/j;

    goto :goto_36

    :goto_38
    if-eqz v6, :cond_50

    invoke-virtual {v6}, LM0/c;->c()I

    move-result v1

    add-int v20, v1, v20

    :cond_50
    if-eqz v9, :cond_51

    iget-object v1, v9, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v5

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v1

    add-int/2addr v2, v1

    :cond_51
    if-eqz v3, :cond_55

    if-eqz v4, :cond_55

    if-eqz v7, :cond_55

    if-eqz v24, :cond_55

    if-ne v13, v0, :cond_52

    iget-object v1, v0, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v15

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v1

    move v6, v1

    goto :goto_39

    :cond_52
    move v6, v2

    :goto_39
    if-ne v13, v14, :cond_53

    iget-object v1, v14, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v5

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v1

    move/from16 v20, v1

    :cond_53
    if-eqz v21, :cond_54

    const/16 v25, 0x8

    goto :goto_3a

    :cond_54
    const/16 v25, 0x5

    :goto_3a
    const/high16 v5, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v4

    move v4, v6

    const/16 v22, 0x8

    move-object v6, v7

    move-object/from16 v22, v23

    move-object/from16 v7, v24

    move-object/from16 v35, v8

    move/from16 v8, v20

    move-object/from16 v20, v9

    move/from16 v9, v25

    invoke-virtual/range {v1 .. v9}, LL0/e;->b(LL0/j;LL0/j;IFLL0/j;LL0/j;II)V

    goto :goto_3b

    :cond_55
    move-object/from16 v35, v8

    move-object/from16 v20, v9

    move-object/from16 v22, v23

    :goto_3b
    iget v1, v13, LM0/d;->V:I

    const/16 v9, 0x8

    if-eq v1, v9, :cond_56

    goto :goto_3c

    :cond_56
    move-object/from16 v13, v20

    :goto_3c
    move-object v9, v13

    move-object/from16 v13, v22

    move-object/from16 v8, v35

    goto/16 :goto_31

    :cond_57
    move-object/from16 v35, v8

    const/16 v9, 0x8

    if-eqz v17, :cond_43

    if-eqz v0, :cond_43

    iget v2, v1, LM0/b;->j:I

    if-lez v2, :cond_58

    iget v1, v1, LM0/b;->i:I

    if-ne v1, v2, :cond_58

    const/16 v21, 0x1

    goto :goto_3d

    :cond_58
    move/from16 v21, v18

    :goto_3d
    move-object v8, v0

    move-object v13, v8

    :goto_3e
    if-eqz v13, :cond_63

    iget-object v1, v13, LM0/d;->b0:[LM0/d;

    aget-object v1, v1, p2

    :goto_3f
    if-eqz v1, :cond_59

    iget v2, v1, LM0/d;->V:I

    if-ne v2, v9, :cond_59

    iget-object v1, v1, LM0/d;->b0:[LM0/d;

    aget-object v1, v1, p2

    goto :goto_3f

    :cond_59
    if-eq v13, v0, :cond_61

    if-eq v13, v14, :cond_61

    if-eqz v1, :cond_61

    if-ne v1, v14, :cond_5a

    move-object/from16 v7, v16

    goto :goto_40

    :cond_5a
    move-object v7, v1

    :goto_40
    iget-object v1, v13, LM0/d;->F:[LM0/c;

    aget-object v2, v1, v15

    iget-object v3, v2, LM0/c;->g:LL0/j;

    iget-object v4, v8, LM0/d;->F:[LM0/c;

    add-int/lit8 v5, v15, 0x1

    aget-object v4, v4, v5

    iget-object v4, v4, LM0/c;->g:LL0/j;

    invoke-virtual {v2}, LM0/c;->c()I

    move-result v2

    aget-object v6, v1, v5

    invoke-virtual {v6}, LM0/c;->c()I

    move-result v6

    if-eqz v7, :cond_5c

    iget-object v1, v7, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v15

    iget-object v9, v1, LM0/c;->g:LL0/j;

    move-object/from16 v20, v7

    iget-object v7, v1, LM0/c;->d:LM0/c;

    if-eqz v7, :cond_5b

    iget-object v7, v7, LM0/c;->g:LL0/j;

    goto :goto_42

    :cond_5b
    move-object/from16 v7, v16

    goto :goto_42

    :cond_5c
    move-object/from16 v20, v7

    iget-object v7, v14, LM0/d;->F:[LM0/c;

    aget-object v7, v7, v15

    if-eqz v7, :cond_5d

    iget-object v9, v7, LM0/c;->g:LL0/j;

    goto :goto_41

    :cond_5d
    move-object/from16 v9, v16

    :goto_41
    aget-object v1, v1, v5

    iget-object v1, v1, LM0/c;->g:LL0/j;

    move-object/from16 v36, v7

    move-object v7, v1

    move-object/from16 v1, v36

    :goto_42
    if-eqz v1, :cond_5e

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v1

    add-int/2addr v1, v6

    move/from16 v22, v1

    goto :goto_43

    :cond_5e
    move/from16 v22, v6

    :goto_43
    iget-object v1, v8, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v5

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v1

    add-int v5, v1, v2

    if-eqz v21, :cond_5f

    const/16 v24, 0x8

    goto :goto_44

    :cond_5f
    move/from16 v24, v23

    :goto_44
    if-eqz v3, :cond_60

    if-eqz v4, :cond_60

    if-eqz v9, :cond_60

    if-eqz v7, :cond_60

    const/high16 v6, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v9

    move-object/from16 v25, v8

    move/from16 v8, v22

    move/from16 v22, v12

    const/16 v12, 0x8

    move/from16 v9, v24

    invoke-virtual/range {v1 .. v9}, LL0/e;->b(LL0/j;LL0/j;IFLL0/j;LL0/j;II)V

    goto :goto_45

    :cond_60
    move-object/from16 v25, v8

    move/from16 v22, v12

    const/16 v12, 0x8

    :goto_45
    move-object/from16 v1, v20

    goto :goto_46

    :cond_61
    move-object/from16 v25, v8

    move/from16 v22, v12

    move v12, v9

    :goto_46
    iget v2, v13, LM0/d;->V:I

    if-eq v2, v12, :cond_62

    move-object v8, v13

    goto :goto_47

    :cond_62
    move-object/from16 v8, v25

    :goto_47
    move-object v13, v1

    move v9, v12

    move/from16 v12, v22

    goto/16 :goto_3e

    :cond_63
    move/from16 v22, v12

    iget-object v1, v0, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v15

    move-object/from16 v2, v35

    iget-object v2, v2, LM0/d;->F:[LM0/c;

    aget-object v2, v2, v15

    iget-object v2, v2, LM0/c;->d:LM0/c;

    iget-object v3, v14, LM0/d;->F:[LM0/c;

    add-int/lit8 v4, v15, 0x1

    aget-object v12, v3, v4

    iget-object v3, v11, LM0/d;->F:[LM0/c;

    aget-object v3, v3, v4

    iget-object v13, v3, LM0/c;->d:LM0/c;

    const/4 v9, 0x5

    if-eqz v2, :cond_64

    if-eq v0, v14, :cond_65

    iget-object v3, v1, LM0/c;->g:LL0/j;

    iget-object v2, v2, LM0/c;->g:LL0/j;

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v1

    invoke-virtual {v10, v3, v2, v1, v9}, LL0/e;->e(LL0/j;LL0/j;II)V

    :cond_64
    move/from16 v20, v9

    goto :goto_48

    :cond_65
    if-eqz v13, :cond_64

    iget-object v3, v1, LM0/c;->g:LL0/j;

    iget-object v4, v2, LM0/c;->g:LL0/j;

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v5

    iget-object v6, v12, LM0/c;->g:LL0/j;

    iget-object v7, v13, LM0/c;->g:LL0/j;

    invoke-virtual {v12}, LM0/c;->c()I

    move-result v8

    const/high16 v20, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move/from16 v5, v20

    move/from16 v20, v9

    invoke-virtual/range {v1 .. v9}, LL0/e;->b(LL0/j;LL0/j;IFLL0/j;LL0/j;II)V

    :goto_48
    if-eqz v13, :cond_66

    if-eq v0, v14, :cond_66

    iget-object v1, v12, LM0/c;->g:LL0/j;

    iget-object v2, v13, LM0/c;->g:LL0/j;

    invoke-virtual {v12}, LM0/c;->c()I

    move-result v3

    neg-int v3, v3

    move/from16 v4, v20

    invoke-virtual {v10, v1, v2, v3, v4}, LL0/e;->e(LL0/j;LL0/j;II)V

    :cond_66
    :goto_49
    if-nez v19, :cond_67

    if-eqz v17, :cond_6d

    :cond_67
    if-eqz v0, :cond_6d

    if-eq v0, v14, :cond_6d

    iget-object v1, v0, LM0/d;->F:[LM0/c;

    aget-object v2, v1, v15

    iget-object v3, v14, LM0/d;->F:[LM0/c;

    add-int/lit8 v4, v15, 0x1

    aget-object v3, v3, v4

    iget-object v5, v2, LM0/c;->d:LM0/c;

    if-eqz v5, :cond_68

    iget-object v5, v5, LM0/c;->g:LL0/j;

    goto :goto_4a

    :cond_68
    move-object/from16 v5, v16

    :goto_4a
    iget-object v6, v3, LM0/c;->d:LM0/c;

    if-eqz v6, :cond_69

    iget-object v6, v6, LM0/c;->g:LL0/j;

    goto :goto_4b

    :cond_69
    move-object/from16 v6, v16

    :goto_4b
    if-eq v11, v14, :cond_6b

    iget-object v6, v11, LM0/d;->F:[LM0/c;

    aget-object v6, v6, v4

    iget-object v6, v6, LM0/c;->d:LM0/c;

    if-eqz v6, :cond_6a

    iget-object v6, v6, LM0/c;->g:LL0/j;

    move-object/from16 v16, v6

    :cond_6a
    move-object/from16 v6, v16

    :cond_6b
    if-ne v0, v14, :cond_6c

    aget-object v3, v1, v4

    :cond_6c
    if-eqz v5, :cond_6d

    if-eqz v6, :cond_6d

    invoke-virtual {v2}, LM0/c;->c()I

    move-result v0

    iget-object v1, v14, LM0/d;->F:[LM0/c;

    aget-object v1, v1, v4

    invoke-virtual {v1}, LM0/c;->c()I

    move-result v8

    iget-object v2, v2, LM0/c;->g:LL0/j;

    iget-object v7, v3, LM0/c;->g:LL0/j;

    const/4 v9, 0x5

    const/high16 v11, 0x3f000000    # 0.5f

    move-object/from16 v1, p1

    move-object v3, v5

    move v4, v0

    move v5, v11

    invoke-virtual/range {v1 .. v9}, LL0/e;->b(LL0/j;LL0/j;IFLL0/j;LL0/j;II)V

    :cond_6d
    add-int/lit8 v9, v22, 0x1

    const/4 v11, 0x2

    move-object/from16 v0, p0

    move/from16 v13, v26

    move-object/from16 v14, v30

    goto/16 :goto_1

    :cond_6e
    return-void
.end method
