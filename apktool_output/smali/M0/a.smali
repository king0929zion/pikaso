.class public final LM0/a;
.super LM0/i;
.source "SourceFile"


# instance fields
.field public f0:I

.field public g0:Z

.field public h0:I


# virtual methods
.method public final a(LL0/e;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LM0/d;->F:[LM0/c;

    iget-object v3, v0, LM0/d;->x:LM0/c;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v5, v0, LM0/d;->y:LM0/c;

    const/4 v6, 0x2

    aput-object v5, v2, v6

    iget-object v7, v0, LM0/d;->z:LM0/c;

    const/4 v8, 0x1

    aput-object v7, v2, v8

    iget-object v9, v0, LM0/d;->A:LM0/c;

    const/4 v10, 0x3

    aput-object v9, v2, v10

    move v11, v4

    :goto_0
    array-length v12, v2

    if-ge v11, v12, :cond_0

    aget-object v12, v2, v11

    invoke-virtual {v1, v12}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v13

    iput-object v13, v12, LM0/c;->g:LL0/j;

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    iget v11, v0, LM0/a;->f0:I

    if-ltz v11, :cond_18

    const/4 v12, 0x4

    if-ge v11, v12, :cond_18

    aget-object v2, v2, v11

    move v11, v4

    :goto_1
    iget v13, v0, LM0/i;->e0:I

    if-ge v11, v13, :cond_6

    iget-object v13, v0, LM0/i;->d0:[LM0/d;

    aget-object v13, v13, v11

    iget-boolean v14, v0, LM0/a;->g0:Z

    if-nez v14, :cond_1

    invoke-virtual {v13}, LM0/d;->b()Z

    move-result v14

    if-nez v14, :cond_1

    goto :goto_3

    :cond_1
    iget v14, v0, LM0/a;->f0:I

    if-eqz v14, :cond_2

    if-ne v14, v8, :cond_3

    :cond_2
    iget-object v15, v13, LM0/d;->c0:[I

    aget v15, v15, v4

    if-ne v15, v10, :cond_3

    iget-object v15, v13, LM0/d;->x:LM0/c;

    iget-object v15, v15, LM0/c;->d:LM0/c;

    if-eqz v15, :cond_3

    iget-object v15, v13, LM0/d;->z:LM0/c;

    iget-object v15, v15, LM0/c;->d:LM0/c;

    if-eqz v15, :cond_3

    :goto_2
    move v11, v8

    goto :goto_4

    :cond_3
    if-eq v14, v6, :cond_4

    if-ne v14, v10, :cond_5

    :cond_4
    iget-object v14, v13, LM0/d;->c0:[I

    aget v14, v14, v8

    if-ne v14, v10, :cond_5

    iget-object v14, v13, LM0/d;->y:LM0/c;

    iget-object v14, v14, LM0/c;->d:LM0/c;

    if-eqz v14, :cond_5

    iget-object v13, v13, LM0/d;->A:LM0/c;

    iget-object v13, v13, LM0/c;->d:LM0/c;

    if-eqz v13, :cond_5

    goto :goto_2

    :cond_5
    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_6
    move v11, v4

    :goto_4
    invoke-virtual {v3}, LM0/c;->e()Z

    move-result v13

    if-nez v13, :cond_8

    invoke-virtual {v7}, LM0/c;->e()Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_5

    :cond_7
    move v13, v4

    goto :goto_6

    :cond_8
    :goto_5
    move v13, v8

    :goto_6
    invoke-virtual {v5}, LM0/c;->e()Z

    move-result v14

    if-nez v14, :cond_a

    invoke-virtual {v9}, LM0/c;->e()Z

    move-result v14

    if-eqz v14, :cond_9

    goto :goto_7

    :cond_9
    move v14, v4

    goto :goto_8

    :cond_a
    :goto_7
    move v14, v8

    :goto_8
    if-nez v11, :cond_f

    iget v11, v0, LM0/a;->f0:I

    if-nez v11, :cond_b

    if-nez v13, :cond_e

    :cond_b
    if-ne v11, v6, :cond_c

    if-nez v14, :cond_e

    :cond_c
    if-ne v11, v8, :cond_d

    if-nez v13, :cond_e

    :cond_d
    if-ne v11, v10, :cond_f

    if-eqz v14, :cond_f

    :cond_e
    const/4 v11, 0x5

    goto :goto_9

    :cond_f
    move v11, v12

    :goto_9
    move v13, v4

    :goto_a
    iget v14, v0, LM0/i;->e0:I

    if-ge v13, v14, :cond_14

    iget-object v14, v0, LM0/i;->d0:[LM0/d;

    aget-object v14, v14, v13

    iget-boolean v15, v0, LM0/a;->g0:Z

    if-nez v15, :cond_10

    invoke-virtual {v14}, LM0/d;->b()Z

    move-result v15

    if-nez v15, :cond_10

    goto :goto_e

    :cond_10
    iget-object v15, v14, LM0/d;->F:[LM0/c;

    iget v10, v0, LM0/a;->f0:I

    aget-object v10, v15, v10

    invoke-virtual {v1, v10}, LL0/e;->j(Ljava/lang/Object;)LL0/j;

    move-result-object v10

    iget v15, v0, LM0/a;->f0:I

    iget-object v14, v14, LM0/d;->F:[LM0/c;

    aget-object v14, v14, v15

    iput-object v10, v14, LM0/c;->g:LL0/j;

    iget-object v8, v14, LM0/c;->d:LM0/c;

    if-eqz v8, :cond_11

    iget-object v8, v8, LM0/c;->b:LM0/d;

    if-ne v8, v0, :cond_11

    iget v8, v14, LM0/c;->e:I

    goto :goto_b

    :cond_11
    move v8, v4

    :goto_b
    if-eqz v15, :cond_13

    if-ne v15, v6, :cond_12

    goto :goto_c

    :cond_12
    iget-object v14, v2, LM0/c;->g:LL0/j;

    iget v15, v0, LM0/a;->h0:I

    add-int/2addr v15, v8

    invoke-virtual/range {p1 .. p1}, LL0/e;->k()LL0/c;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LL0/e;->l()LL0/j;

    move-result-object v12

    iput v4, v12, LL0/j;->d:I

    invoke-virtual {v6, v14, v10, v12, v15}, LL0/c;->b(LL0/j;LL0/j;LL0/j;I)V

    invoke-virtual {v1, v6}, LL0/e;->c(LL0/c;)V

    goto :goto_d

    :cond_13
    :goto_c
    iget-object v6, v2, LM0/c;->g:LL0/j;

    iget v12, v0, LM0/a;->h0:I

    sub-int/2addr v12, v8

    invoke-virtual/range {p1 .. p1}, LL0/e;->k()LL0/c;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, LL0/e;->l()LL0/j;

    move-result-object v15

    iput v4, v15, LL0/j;->d:I

    invoke-virtual {v14, v6, v10, v15, v12}, LL0/c;->c(LL0/j;LL0/j;LL0/j;I)V

    invoke-virtual {v1, v14}, LL0/e;->c(LL0/c;)V

    :goto_d
    iget-object v6, v2, LM0/c;->g:LL0/j;

    iget v12, v0, LM0/a;->h0:I

    add-int/2addr v12, v8

    invoke-virtual {v1, v6, v10, v12, v11}, LL0/e;->e(LL0/j;LL0/j;II)V

    :goto_e
    add-int/lit8 v13, v13, 0x1

    const/4 v6, 0x2

    const/4 v8, 0x1

    const/4 v10, 0x3

    const/4 v12, 0x4

    goto :goto_a

    :cond_14
    iget v2, v0, LM0/a;->f0:I

    const/16 v6, 0x8

    if-nez v2, :cond_15

    iget-object v2, v7, LM0/c;->g:LL0/j;

    iget-object v5, v3, LM0/c;->g:LL0/j;

    invoke-virtual {v1, v2, v5, v4, v6}, LL0/e;->e(LL0/j;LL0/j;II)V

    iget-object v2, v3, LM0/c;->g:LL0/j;

    iget-object v5, v0, LM0/d;->I:LM0/d;

    iget-object v5, v5, LM0/d;->z:LM0/c;

    iget-object v5, v5, LM0/c;->g:LL0/j;

    const/4 v6, 0x4

    invoke-virtual {v1, v2, v5, v4, v6}, LL0/e;->e(LL0/j;LL0/j;II)V

    iget-object v2, v3, LM0/c;->g:LL0/j;

    iget-object v3, v0, LM0/d;->I:LM0/d;

    iget-object v3, v3, LM0/d;->x:LM0/c;

    iget-object v3, v3, LM0/c;->g:LL0/j;

    invoke-virtual {v1, v2, v3, v4, v4}, LL0/e;->e(LL0/j;LL0/j;II)V

    goto :goto_f

    :cond_15
    const/4 v8, 0x1

    if-ne v2, v8, :cond_16

    iget-object v2, v3, LM0/c;->g:LL0/j;

    iget-object v5, v7, LM0/c;->g:LL0/j;

    invoke-virtual {v1, v2, v5, v4, v6}, LL0/e;->e(LL0/j;LL0/j;II)V

    iget-object v2, v3, LM0/c;->g:LL0/j;

    iget-object v5, v0, LM0/d;->I:LM0/d;

    iget-object v5, v5, LM0/d;->x:LM0/c;

    iget-object v5, v5, LM0/c;->g:LL0/j;

    const/4 v6, 0x4

    invoke-virtual {v1, v2, v5, v4, v6}, LL0/e;->e(LL0/j;LL0/j;II)V

    iget-object v2, v3, LM0/c;->g:LL0/j;

    iget-object v3, v0, LM0/d;->I:LM0/d;

    iget-object v3, v3, LM0/d;->z:LM0/c;

    iget-object v3, v3, LM0/c;->g:LL0/j;

    invoke-virtual {v1, v2, v3, v4, v4}, LL0/e;->e(LL0/j;LL0/j;II)V

    goto :goto_f

    :cond_16
    const/4 v3, 0x2

    if-ne v2, v3, :cond_17

    iget-object v2, v9, LM0/c;->g:LL0/j;

    iget-object v3, v5, LM0/c;->g:LL0/j;

    invoke-virtual {v1, v2, v3, v4, v6}, LL0/e;->e(LL0/j;LL0/j;II)V

    iget-object v2, v5, LM0/c;->g:LL0/j;

    iget-object v3, v0, LM0/d;->I:LM0/d;

    iget-object v3, v3, LM0/d;->A:LM0/c;

    iget-object v3, v3, LM0/c;->g:LL0/j;

    const/4 v6, 0x4

    invoke-virtual {v1, v2, v3, v4, v6}, LL0/e;->e(LL0/j;LL0/j;II)V

    iget-object v2, v5, LM0/c;->g:LL0/j;

    iget-object v3, v0, LM0/d;->I:LM0/d;

    iget-object v3, v3, LM0/d;->y:LM0/c;

    iget-object v3, v3, LM0/c;->g:LL0/j;

    invoke-virtual {v1, v2, v3, v4, v4}, LL0/e;->e(LL0/j;LL0/j;II)V

    goto :goto_f

    :cond_17
    const/4 v3, 0x3

    if-ne v2, v3, :cond_18

    iget-object v2, v5, LM0/c;->g:LL0/j;

    iget-object v3, v9, LM0/c;->g:LL0/j;

    invoke-virtual {v1, v2, v3, v4, v6}, LL0/e;->e(LL0/j;LL0/j;II)V

    iget-object v2, v5, LM0/c;->g:LL0/j;

    iget-object v3, v0, LM0/d;->I:LM0/d;

    iget-object v3, v3, LM0/d;->y:LM0/c;

    iget-object v3, v3, LM0/c;->g:LL0/j;

    const/4 v6, 0x4

    invoke-virtual {v1, v2, v3, v4, v6}, LL0/e;->e(LL0/j;LL0/j;II)V

    iget-object v2, v5, LM0/c;->g:LL0/j;

    iget-object v3, v0, LM0/d;->I:LM0/d;

    iget-object v3, v3, LM0/d;->A:LM0/c;

    iget-object v3, v3, LM0/c;->g:LL0/j;

    invoke-virtual {v1, v2, v3, v4, v4}, LL0/e;->e(LL0/j;LL0/j;II)V

    :cond_18
    :goto_f
    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Barrier] "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LM0/d;->W:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, LM0/i;->e0:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LM0/i;->d0:[LM0/d;

    aget-object v2, v2, v1

    if-lez v1, :cond_0

    const-string v3, ", "

    invoke-static {v0, v3}, LA/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v2, LM0/d;->W:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "}"

    invoke-static {v0, v1}, LA/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
