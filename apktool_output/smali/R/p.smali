.class public abstract Lr/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr/g;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li2/j;-><init>(ILg2/d;)V

    sput-object v0, Lr/p;->a:Lr/g;

    return-void
.end method

.method public static final a(Lh0/p;ZLh0/g;Li2/a;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lr/h;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lr/h;

    iget v1, v0, Lr/h;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lr/h;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lr/h;

    invoke-direct {v0, p3}, Li2/c;-><init>(Lg2/d;)V

    :goto_0
    iget-object p3, v0, Lr/h;->j:Ljava/lang/Object;

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, v0, Lr/h;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p0, v0, Lr/h;->i:Z

    iget-object p1, v0, Lr/h;->h:Lh0/g;

    iget-object p2, v0, Lr/h;->g:Lh0/p;

    invoke-static {p3}, LZ0/d;->U(Ljava/lang/Object;)V

    move-object v9, p1

    move p1, p0

    move-object p0, p2

    move-object p2, v9

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LZ0/d;->U(Ljava/lang/Object;)V

    :cond_3
    iput-object p0, v0, Lr/h;->g:Lh0/p;

    iput-object p2, v0, Lr/h;->h:Lh0/g;

    iput-boolean p1, v0, Lr/h;->i:Z

    iput v3, v0, Lr/h;->k:I

    invoke-virtual {p0, p2, v0}, Lh0/p;->a(Lh0/g;Li2/a;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Lh0/f;

    iget-object v2, p3, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    if-ge v6, v4, :cond_8

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh0/k;

    if-eqz p1, :cond_6

    invoke-virtual {v7}, Lh0/k;->b()Z

    move-result v8

    if-nez v8, :cond_5

    iget-boolean v8, v7, Lh0/k;->h:Z

    if-nez v8, :cond_5

    iget-boolean v7, v7, Lh0/k;->d:Z

    if-eqz v7, :cond_5

    move v7, v3

    goto :goto_3

    :cond_5
    move v7, v5

    goto :goto_3

    :cond_6
    invoke-static {v7}, LZ0/d;->m(Lh0/k;)Z

    move-result v7

    :goto_3
    if-nez v7, :cond_7

    move v2, v5

    goto :goto_4

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_8
    move v2, v3

    :goto_4
    if-eqz v2, :cond_3

    iget-object p0, p3, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lh0/p;Lh0/g;Li2/a;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p2

    instance-of v1, v0, Lr/o;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lr/o;

    iget v2, v1, Lr/o;->j:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lr/o;->j:I

    goto :goto_0

    :cond_0
    new-instance v1, Lr/o;

    invoke-direct {v1, v0}, Li2/c;-><init>(Lg2/d;)V

    :goto_0
    iget-object v0, v1, Lr/o;->i:Ljava/lang/Object;

    sget-object v2, Lh2/a;->d:Lh2/a;

    iget v3, v1, Lr/o;->j:I

    const/4 v4, 0x1

    const/4 v6, 0x2

    if-eqz v3, :cond_4

    if-eq v3, v4, :cond_3

    if-ne v3, v6, :cond_2

    iget-object v3, v1, Lr/o;->h:Lh0/g;

    iget-object v8, v1, Lr/o;->g:Lh0/p;

    invoke-static {v0}, LZ0/d;->U(Ljava/lang/Object;)V

    move-object v4, v2

    move v2, v6

    :cond_1
    move-object/from16 v20, v3

    move-object v3, v1

    move-object/from16 v1, v20

    goto/16 :goto_7

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v3, v1, Lr/o;->h:Lh0/g;

    iget-object v8, v1, Lr/o;->g:Lh0/p;

    invoke-static {v0}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, LZ0/d;->U(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    move-object v3, v1

    move-object/from16 v1, p1

    :goto_1
    iput-object v0, v3, Lr/o;->g:Lh0/p;

    iput-object v1, v3, Lr/o;->h:Lh0/g;

    iput v4, v3, Lr/o;->j:I

    invoke-virtual {v0, v1, v3}, Lh0/p;->a(Lh0/g;Li2/a;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_5

    return-object v2

    :cond_5
    move-object/from16 v20, v8

    move-object v8, v0

    move-object/from16 v0, v20

    move-object/from16 v21, v3

    move-object v3, v1

    move-object/from16 v1, v21

    :goto_2
    check-cast v0, Lh0/f;

    iget-object v9, v0, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_3
    iget-object v12, v0, Lh0/f;->a:Ljava/lang/Object;

    if-ge v11, v10, :cond_f

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lh0/k;

    invoke-virtual {v13}, Lh0/k;->b()Z

    move-result v14

    if-nez v14, :cond_6

    iget-boolean v14, v13, Lh0/k;->h:Z

    if-eqz v14, :cond_6

    iget-boolean v13, v13, Lh0/k;->d:Z

    if-nez v13, :cond_6

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_6
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v0, :cond_c

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh0/k;

    invoke-virtual {v10}, Lh0/k;->b()Z

    move-result v11

    if-nez v11, :cond_a

    iget-object v11, v8, Lh0/p;->h:Lh0/r;

    iget-wide v13, v11, Lh0/r;->z:J

    iget-object v11, v8, Lh0/p;->h:Lh0/r;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v15

    iget-object v15, v15, Ln0/z;->u:Lo0/F0;

    invoke-interface {v15}, Lo0/F0;->a()J

    move-result-wide v6

    invoke-interface {v11, v6, v7}, LG0/b;->q(J)J

    move-result-wide v6

    iget-wide v4, v11, Lh0/r;->z:J

    invoke-static {v6, v7}, LV/f;->d(J)F

    move-result v11

    const/16 v16, 0x20

    move-object/from16 v17, v2

    move-object/from16 p0, v3

    shr-long v2, v4, v16

    long-to-int v2, v2

    int-to-float v2, v2

    sub-float/2addr v11, v2

    const/4 v2, 0x0

    invoke-static {v2, v11}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const/high16 v11, 0x40000000    # 2.0f

    div-float/2addr v3, v11

    invoke-static {v6, v7}, LV/f;->b(J)F

    move-result v6

    const-wide v18, 0xffffffffL

    and-long v4, v4, v18

    long-to-int v4, v4

    int-to-float v4, v4

    sub-float/2addr v6, v4

    invoke-static {v2, v6}, Ljava/lang/Math;->max(FF)F

    move-result v2

    div-float/2addr v2, v11

    invoke-static {v3, v2}, La/a;->d(FF)J

    move-result-wide v2

    iget v4, v10, Lh0/k;->i:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_8

    iget-wide v6, v10, Lh0/k;->c:J

    invoke-static {v6, v7}, LV/c;->b(J)F

    move-result v4

    invoke-static {v6, v7}, LV/c;->c(J)F

    move-result v6

    invoke-static {v2, v3}, LV/f;->d(J)F

    move-result v7

    neg-float v7, v7

    const/16 v10, 0x20

    shr-long v10, v13, v10

    long-to-int v10, v10

    int-to-float v10, v10

    invoke-static {v2, v3}, LV/f;->d(J)F

    move-result v11

    add-float/2addr v11, v10

    invoke-static {v2, v3}, LV/f;->b(J)F

    move-result v10

    neg-float v10, v10

    const-wide v18, 0xffffffffL

    and-long v13, v13, v18

    long-to-int v13, v13

    int-to-float v13, v13

    invoke-static {v2, v3}, LV/f;->b(J)F

    move-result v2

    add-float/2addr v2, v13

    cmpg-float v3, v4, v7

    if-ltz v3, :cond_9

    cmpl-float v3, v4, v11

    if-gtz v3, :cond_9

    cmpg-float v3, v6, v10

    if-ltz v3, :cond_9

    cmpl-float v2, v6, v2

    if-lez v2, :cond_7

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    goto :goto_5

    :cond_8
    invoke-static {v10, v13, v14}, LZ0/d;->C(Lh0/k;J)Z

    move-result v5

    :cond_9
    :goto_5
    if-eqz v5, :cond_b

    :cond_a
    const/4 v0, 0x0

    goto :goto_6

    :cond_b
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v3, p0

    move-object/from16 v2, v17

    const/4 v4, 0x1

    const/4 v6, 0x2

    goto/16 :goto_4

    :goto_6
    return-object v0

    :cond_c
    move-object/from16 v17, v2

    move-object/from16 p0, v3

    sget-object v0, Lh0/g;->f:Lh0/g;

    iput-object v8, v1, Lr/o;->g:Lh0/p;

    iput-object v3, v1, Lr/o;->h:Lh0/g;

    const/4 v2, 0x2

    iput v2, v1, Lr/o;->j:I

    invoke-virtual {v8, v0, v1}, Lh0/p;->a(Lh0/g;Li2/a;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v4, v17

    if-ne v0, v4, :cond_1

    return-object v4

    :goto_7
    check-cast v0, Lh0/f;

    iget-object v0, v0, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_8
    if-ge v6, v5, :cond_e

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh0/k;

    invoke-virtual {v7}, Lh0/k;->b()Z

    move-result v7

    if-eqz v7, :cond_d

    const/4 v7, 0x0

    return-object v7

    :cond_d
    const/4 v7, 0x0

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_e
    move v6, v2

    move-object v2, v4

    move-object v0, v8

    const/4 v4, 0x1

    goto/16 :goto_1

    :cond_f
    const/4 v0, 0x0

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
