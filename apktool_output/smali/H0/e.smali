.class public final Lh0/e;
.super LA/t;
.source "SourceFile"


# instance fields
.field public final f:LP/k;

.field public final g:LI/m;

.field public final h:Ln/m;

.field public i:Ln0/Y;

.field public j:Lh0/f;

.field public k:Z

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(LP/k;)V
    .locals 2

    const/16 v0, 0x16

    invoke-direct {p0, v0}, LA/t;-><init>(I)V

    iput-object p1, p0, Lh0/e;->f:LP/k;

    new-instance p1, LI/m;

    invoke-direct {p1}, LI/m;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [J

    iput-object v1, p1, LI/m;->f:Ljava/lang/Object;

    iput-object p1, p0, Lh0/e;->g:LI/m;

    new-instance p1, Ln/m;

    invoke-direct {p1, v0}, Ln/m;-><init>(I)V

    iput-object p1, p0, Lh0/e;->h:Ln/m;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh0/e;->l:Z

    iput-boolean p1, p0, Lh0/e;->m:Z

    return-void
.end method


# virtual methods
.method public final J()V
    .locals 9

    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LF/d;

    iget v1, v0, LF/d;->f:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lez v1, :cond_1

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    move v4, v3

    :cond_0
    aget-object v5, v0, v4

    check-cast v5, Lh0/e;

    invoke-virtual {v5}, Lh0/e;->J()V

    add-int/2addr v4, v2

    if-lt v4, v1, :cond_0

    :cond_1
    const/4 v0, 0x0

    iget-object v1, p0, Lh0/e;->f:LP/k;

    move-object v4, v0

    :goto_0
    if-eqz v1, :cond_9

    instance-of v5, v1, Ln0/j0;

    if-eqz v5, :cond_2

    check-cast v1, Ln0/j0;

    invoke-interface {v1}, Ln0/j0;->B()V

    goto :goto_3

    :cond_2
    iget v5, v1, LP/k;->f:I

    const/16 v6, 0x10

    and-int/2addr v5, v6

    if-eqz v5, :cond_8

    instance-of v5, v1, Ln0/i;

    if-eqz v5, :cond_8

    move-object v5, v1

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    move v7, v3

    :goto_1
    if-eqz v5, :cond_7

    iget v8, v5, LP/k;->f:I

    and-int/2addr v8, v6

    if-eqz v8, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v2, :cond_3

    move-object v1, v5

    goto :goto_2

    :cond_3
    if-nez v4, :cond_4

    new-instance v4, LF/d;

    new-array v8, v6, [LP/k;

    invoke-direct {v4, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v4, v1}, LF/d;->b(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_5
    invoke-virtual {v4, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_1

    :cond_7
    if-ne v7, v2, :cond_8

    goto :goto_0

    :cond_8
    :goto_3
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v1

    goto :goto_0

    :cond_9
    return-void
.end method

.method public final K(LB2/i;)Z
    .locals 14

    iget-object v0, p0, Lh0/e;->h:Ln/m;

    invoke-virtual {v0}, Ln/m;->g()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v4, 0x0

    if-eqz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v1, p0, Lh0/e;->f:LP/k;

    iget-boolean v5, v1, LP/k;->p:Z

    if-nez v5, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v5, p0, Lh0/e;->j:Lh0/f;

    invoke-static {v5}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object v6, p0, Lh0/e;->i:Ln0/Y;

    invoke-static {v6}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-wide v6, v6, Ll0/o;->f:J

    move-object v8, v1

    move-object v9, v4

    :goto_1
    if-eqz v8, :cond_a

    instance-of v10, v8, Ln0/j0;

    if-eqz v10, :cond_3

    check-cast v8, Ln0/j0;

    sget-object v10, Lh0/g;->f:Lh0/g;

    invoke-interface {v8, v5, v10, v6, v7}, Ln0/j0;->y(Lh0/f;Lh0/g;J)V

    goto :goto_4

    :cond_3
    iget v10, v8, LP/k;->f:I

    const/16 v11, 0x10

    and-int/2addr v10, v11

    if-eqz v10, :cond_9

    instance-of v10, v8, Ln0/i;

    if-eqz v10, :cond_9

    move-object v10, v8

    check-cast v10, Ln0/i;

    iget-object v10, v10, Ln0/i;->r:LP/k;

    move v12, v2

    :goto_2
    if-eqz v10, :cond_8

    iget v13, v10, LP/k;->f:I

    and-int/2addr v13, v11

    if-eqz v13, :cond_7

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v3, :cond_4

    move-object v8, v10

    goto :goto_3

    :cond_4
    if-nez v9, :cond_5

    new-instance v9, LF/d;

    new-array v13, v11, [LP/k;

    invoke-direct {v9, v13}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v8, :cond_6

    invoke-virtual {v9, v8}, LF/d;->b(Ljava/lang/Object;)V

    move-object v8, v4

    :cond_6
    invoke-virtual {v9, v10}, LF/d;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_3
    iget-object v10, v10, LP/k;->i:LP/k;

    goto :goto_2

    :cond_8
    if-ne v12, v3, :cond_9

    goto :goto_1

    :cond_9
    :goto_4
    invoke-static {v9}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v8

    goto :goto_1

    :cond_a
    iget-boolean v1, v1, LP/k;->p:Z

    if-eqz v1, :cond_c

    iget-object v1, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v1, LF/d;

    iget v5, v1, LF/d;->f:I

    if-lez v5, :cond_c

    iget-object v1, v1, LF/d;->d:[Ljava/lang/Object;

    :cond_b
    aget-object v6, v1, v2

    check-cast v6, Lh0/e;

    invoke-virtual {v6, p1}, Lh0/e;->K(LB2/i;)Z

    add-int/2addr v2, v3

    if-lt v2, v5, :cond_b

    :cond_c
    move v2, v3

    :goto_5
    invoke-virtual {p0, p1}, Lh0/e;->u(LB2/i;)V

    invoke-virtual {v0}, Ln/m;->a()V

    iput-object v4, p0, Lh0/e;->i:Ln0/Y;

    return v2
.end method

.method public final L(LB2/i;Z)Z
    .locals 13

    iget-object v0, p0, Lh0/e;->h:Ln/m;

    invoke-virtual {v0}, Ln/m;->g()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    goto/16 :goto_9

    :cond_1
    iget-object v0, p0, Lh0/e;->f:LP/k;

    iget-boolean v3, v0, LP/k;->p:Z

    if-nez v3, :cond_2

    goto/16 :goto_9

    :cond_2
    iget-object v3, p0, Lh0/e;->j:Lh0/f;

    invoke-static {v3}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object v4, p0, Lh0/e;->i:Ln0/Y;

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-wide v4, v4, Ll0/o;->f:J

    const/4 v6, 0x0

    move-object v7, v0

    move-object v8, v6

    :goto_1
    const/16 v9, 0x10

    if-eqz v7, :cond_a

    instance-of v10, v7, Ln0/j0;

    if-eqz v10, :cond_3

    check-cast v7, Ln0/j0;

    sget-object v9, Lh0/g;->d:Lh0/g;

    invoke-interface {v7, v3, v9, v4, v5}, Ln0/j0;->y(Lh0/f;Lh0/g;J)V

    goto :goto_4

    :cond_3
    iget v10, v7, LP/k;->f:I

    and-int/2addr v10, v9

    if-eqz v10, :cond_9

    instance-of v10, v7, Ln0/i;

    if-eqz v10, :cond_9

    move-object v10, v7

    check-cast v10, Ln0/i;

    iget-object v10, v10, Ln0/i;->r:LP/k;

    move v11, v1

    :goto_2
    if-eqz v10, :cond_8

    iget v12, v10, LP/k;->f:I

    and-int/2addr v12, v9

    if-eqz v12, :cond_7

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v2, :cond_4

    move-object v7, v10

    goto :goto_3

    :cond_4
    if-nez v8, :cond_5

    new-instance v8, LF/d;

    new-array v12, v9, [LP/k;

    invoke-direct {v8, v12}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v7, :cond_6

    invoke-virtual {v8, v7}, LF/d;->b(Ljava/lang/Object;)V

    move-object v7, v6

    :cond_6
    invoke-virtual {v8, v10}, LF/d;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_3
    iget-object v10, v10, LP/k;->i:LP/k;

    goto :goto_2

    :cond_8
    if-ne v11, v2, :cond_9

    goto :goto_1

    :cond_9
    :goto_4
    invoke-static {v8}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v7

    goto :goto_1

    :cond_a
    iget-boolean v7, v0, LP/k;->p:Z

    if-eqz v7, :cond_c

    iget-object v7, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v7, LF/d;

    iget v8, v7, LF/d;->f:I

    if-lez v8, :cond_c

    iget-object v7, v7, LF/d;->d:[Ljava/lang/Object;

    move v10, v1

    :cond_b
    aget-object v11, v7, v10

    check-cast v11, Lh0/e;

    iget-object v12, p0, Lh0/e;->i:Ln0/Y;

    invoke-static {v12}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v11, p1, p2}, Lh0/e;->L(LB2/i;Z)Z

    add-int/2addr v10, v2

    if-lt v10, v8, :cond_b

    :cond_c
    iget-boolean p1, v0, LP/k;->p:Z

    if-eqz p1, :cond_14

    move-object p1, v6

    :goto_5
    if-eqz v0, :cond_14

    instance-of p2, v0, Ln0/j0;

    if-eqz p2, :cond_d

    check-cast v0, Ln0/j0;

    sget-object p2, Lh0/g;->e:Lh0/g;

    invoke-interface {v0, v3, p2, v4, v5}, Ln0/j0;->y(Lh0/f;Lh0/g;J)V

    goto :goto_8

    :cond_d
    iget p2, v0, LP/k;->f:I

    and-int/2addr p2, v9

    if-eqz p2, :cond_13

    instance-of p2, v0, Ln0/i;

    if-eqz p2, :cond_13

    move-object p2, v0

    check-cast p2, Ln0/i;

    iget-object p2, p2, Ln0/i;->r:LP/k;

    move v7, v1

    :goto_6
    if-eqz p2, :cond_12

    iget v8, p2, LP/k;->f:I

    and-int/2addr v8, v9

    if-eqz v8, :cond_11

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v2, :cond_e

    move-object v0, p2

    goto :goto_7

    :cond_e
    if-nez p1, :cond_f

    new-instance p1, LF/d;

    new-array v8, v9, [LP/k;

    invoke-direct {p1, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_f
    if-eqz v0, :cond_10

    invoke-virtual {p1, v0}, LF/d;->b(Ljava/lang/Object;)V

    move-object v0, v6

    :cond_10
    invoke-virtual {p1, p2}, LF/d;->b(Ljava/lang/Object;)V

    :cond_11
    :goto_7
    iget-object p2, p2, LP/k;->i:LP/k;

    goto :goto_6

    :cond_12
    if-ne v7, v2, :cond_13

    goto :goto_5

    :cond_13
    :goto_8
    invoke-static {p1}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v0

    goto :goto_5

    :cond_14
    move v1, v2

    :goto_9
    return v1
.end method

.method public final M(JLn/x;)V
    .locals 8

    iget-object v0, p0, Lh0/e;->g:LI/m;

    invoke-virtual {v0, p1, p2}, LI/m;->b(J)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    iget-object v1, p3, Ln/x;->a:[Ljava/lang/Object;

    iget v4, p3, Ln/x;->b:I

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v1, v5

    invoke-virtual {p0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, -0x1

    :goto_1
    if-ltz v5, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-nez v1, :cond_5

    iget v1, v0, LI/m;->e:I

    move v4, v2

    :goto_3
    if-ge v4, v1, :cond_4

    iget-object v5, v0, LI/m;->f:Ljava/lang/Object;

    check-cast v5, [J

    aget-wide v6, v5, v4

    cmp-long v5, p1, v6

    if-nez v5, :cond_3

    invoke-virtual {v0, v4}, LI/m;->d(I)V

    goto :goto_4

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    iget-object v0, p0, Lh0/e;->h:Ln/m;

    invoke-virtual {v0, p1, p2}, Ln/m;->f(J)V

    :cond_5
    iget-object v0, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LF/d;

    iget v1, v0, LF/d;->f:I

    if-lez v1, :cond_7

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    :cond_6
    aget-object v4, v0, v2

    check-cast v4, Lh0/e;

    invoke-virtual {v4, p1, p2, p3}, Lh0/e;->M(JLn/x;)V

    add-int/2addr v2, v3

    if-lt v2, v1, :cond_6

    :cond_7
    return-void
.end method

.method public final t(Ln/m;Ln0/p;LB2/i;Z)Z
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-super/range {p0 .. p4}, LA/t;->t(Ln/m;Ln0/p;LB2/i;Z)Z

    move-result v4

    iget-object v5, v0, Lh0/e;->f:LP/k;

    iget-boolean v6, v5, LP/k;->p:Z

    const/4 v7, 0x1

    if-nez v6, :cond_0

    return v7

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-eqz v5, :cond_8

    instance-of v10, v5, Ln0/j0;

    const/16 v11, 0x10

    if-eqz v10, :cond_1

    check-cast v5, Ln0/j0;

    invoke-static {v5, v11}, Ln0/C;->p(Ln0/h;I)Ln0/Y;

    move-result-object v5

    iput-object v5, v0, Lh0/e;->i:Ln0/Y;

    goto :goto_3

    :cond_1
    iget v10, v5, LP/k;->f:I

    and-int/2addr v10, v11

    if-eqz v10, :cond_7

    instance-of v10, v5, Ln0/i;

    if-eqz v10, :cond_7

    move-object v10, v5

    check-cast v10, Ln0/i;

    iget-object v10, v10, Ln0/i;->r:LP/k;

    const/4 v9, 0x0

    :goto_1
    if-eqz v10, :cond_6

    iget v12, v10, LP/k;->f:I

    and-int/2addr v12, v11

    if-eqz v12, :cond_5

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v7, :cond_2

    move-object v5, v10

    goto :goto_2

    :cond_2
    if-nez v8, :cond_3

    new-instance v8, LF/d;

    new-array v12, v11, [LP/k;

    invoke-direct {v8, v12}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v8, v5}, LF/d;->b(Ljava/lang/Object;)V

    const/4 v5, 0x0

    :cond_4
    invoke-virtual {v8, v10}, LF/d;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    iget-object v10, v10, LP/k;->i:LP/k;

    goto :goto_1

    :cond_6
    if-ne v9, v7, :cond_7

    goto :goto_0

    :cond_7
    :goto_3
    invoke-static {v8}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v5

    goto :goto_0

    :cond_8
    invoke-virtual/range {p1 .. p1}, Ln/m;->g()I

    move-result v5

    const/4 v8, 0x0

    :goto_4
    iget-object v10, v0, Lh0/e;->h:Ln/m;

    iget-object v11, v0, Lh0/e;->g:LI/m;

    if-ge v8, v5, :cond_e

    invoke-virtual {v1, v8}, Ln/m;->d(I)J

    move-result-wide v12

    invoke-virtual {v1, v8}, Ln/m;->h(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lh0/k;

    invoke-virtual {v11, v12, v13}, LI/m;->b(J)Z

    move-result v11

    if-eqz v11, :cond_d

    iget-wide v6, v14, Lh0/k;->g:J

    invoke-static {v6, v7}, LV/c;->d(J)Z

    move-result v11

    if-eqz v11, :cond_d

    move-object/from16 v16, v10

    iget-wide v9, v14, Lh0/k;->c:J

    invoke-static {v9, v10}, LV/c;->d(J)Z

    move-result v11

    if-eqz v11, :cond_d

    new-instance v11, Ljava/util/ArrayList;

    iget-object v15, v14, Lh0/k;->k:Ljava/util/ArrayList;

    sget-object v17, Ld2/s;->d:Ld2/s;

    if-nez v15, :cond_9

    move-object/from16 v15, v17

    :cond_9
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v15

    invoke-direct {v11, v15}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v15, v14, Lh0/k;->k:Ljava/util/ArrayList;

    move/from16 v37, v5

    if-nez v15, :cond_a

    move-object/from16 v15, v17

    :cond_a
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v5

    move/from16 v38, v4

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v5, :cond_c

    invoke-interface {v15, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move/from16 v18, v5

    move-object/from16 v5, v17

    check-cast v5, Lh0/b;

    move-wide/from16 v39, v12

    iget-wide v12, v5, Lh0/b;->b:J

    invoke-static {v12, v13}, LV/c;->d(J)Z

    move-result v17

    if-eqz v17, :cond_b

    move-object/from16 v17, v15

    new-instance v15, Lh0/b;

    iget-object v3, v0, Lh0/e;->i:Ln0/Y;

    invoke-static {v3}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, v2, v12, v13}, Ln0/Y;->y0(Ll0/g;J)J

    move-result-wide v22

    iget-wide v12, v5, Lh0/b;->a:J

    move v3, v8

    move-wide/from16 v26, v9

    iget-wide v8, v5, Lh0/b;->c:J

    move-object/from16 v19, v15

    move-wide/from16 v20, v12

    move-wide/from16 v24, v8

    invoke-direct/range {v19 .. v25}, Lh0/b;-><init>(JJJ)V

    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_b
    move v3, v8

    move-wide/from16 v26, v9

    move-object/from16 v17, v15

    :goto_6
    add-int/lit8 v4, v4, 0x1

    move v8, v3

    move-object/from16 v15, v17

    move/from16 v5, v18

    move-wide/from16 v9, v26

    move-wide/from16 v12, v39

    move-object/from16 v3, p3

    goto :goto_5

    :cond_c
    move v3, v8

    move-wide/from16 v26, v9

    move-wide/from16 v39, v12

    iget-object v4, v0, Lh0/e;->i:Ln0/Y;

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v4, v2, v6, v7}, Ln0/Y;->y0(Ll0/g;J)J

    move-result-wide v28

    iget-object v4, v0, Lh0/e;->i:Ln0/Y;

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    move-wide/from16 v5, v26

    invoke-virtual {v4, v2, v5, v6}, Ln0/Y;->y0(Ll0/g;J)J

    move-result-wide v22

    new-instance v4, Lh0/k;

    move-object/from16 v17, v4

    iget-wide v5, v14, Lh0/k;->j:J

    move-wide/from16 v33, v5

    iget-wide v5, v14, Lh0/k;->l:J

    move-wide/from16 v35, v5

    iget-wide v5, v14, Lh0/k;->a:J

    move-wide/from16 v18, v5

    iget-wide v5, v14, Lh0/k;->b:J

    move-wide/from16 v20, v5

    iget-boolean v5, v14, Lh0/k;->d:Z

    move/from16 v24, v5

    iget v5, v14, Lh0/k;->e:F

    move/from16 v25, v5

    iget-wide v5, v14, Lh0/k;->f:J

    move-wide/from16 v26, v5

    iget-boolean v5, v14, Lh0/k;->h:Z

    move/from16 v30, v5

    iget v5, v14, Lh0/k;->i:I

    move/from16 v31, v5

    move-object/from16 v32, v11

    invoke-direct/range {v17 .. v36}, Lh0/k;-><init>(JJJZFJJZILjava/util/ArrayList;JJ)V

    iget-object v5, v14, Lh0/k;->m:Lh0/a;

    iput-object v5, v4, Lh0/k;->m:Lh0/a;

    move-object/from16 v5, v16

    move-wide/from16 v6, v39

    invoke-virtual {v5, v6, v7, v4}, Ln/m;->e(JLjava/lang/Object;)V

    goto :goto_7

    :cond_d
    move/from16 v38, v4

    move/from16 v37, v5

    move v3, v8

    :goto_7
    add-int/lit8 v8, v3, 0x1

    move-object/from16 v3, p3

    move/from16 v5, v37

    move/from16 v4, v38

    const/4 v7, 0x1

    goto/16 :goto_4

    :cond_e
    move/from16 v38, v4

    move-object v5, v10

    invoke-virtual {v5}, Ln/m;->g()I

    move-result v2

    if-nez v2, :cond_f

    const/4 v2, 0x0

    iput v2, v11, LI/m;->e:I

    iget-object v1, v0, LA/t;->e:Ljava/lang/Object;

    check-cast v1, LF/d;

    invoke-virtual {v1}, LF/d;->g()V

    const/4 v2, 0x1

    return v2

    :cond_f
    const/4 v2, 0x1

    iget v3, v11, LI/m;->e:I

    sub-int/2addr v3, v2

    :goto_8
    const/4 v2, -0x1

    if-ge v2, v3, :cond_11

    iget-object v2, v11, LI/m;->f:Ljava/lang/Object;

    check-cast v2, [J

    aget-wide v6, v2, v3

    invoke-virtual {v1, v6, v7}, Ln/m;->c(J)I

    move-result v2

    if-ltz v2, :cond_10

    goto :goto_9

    :cond_10
    invoke-virtual {v11, v3}, LI/m;->d(I)V

    :goto_9
    add-int/lit8 v3, v3, -0x1

    goto :goto_8

    :cond_11
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ln/m;->g()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Ln/m;->g()I

    move-result v2

    const/4 v3, 0x0

    :goto_a
    if-ge v3, v2, :cond_12

    invoke-virtual {v5, v3}, Ln/m;->h(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_12
    new-instance v2, Lh0/f;

    move-object/from16 v3, p3

    invoke-direct {v2, v1, v3}, Lh0/f;-><init>(Ljava/util/List;LB2/i;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_b
    if-ge v5, v4, :cond_14

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lh0/k;

    iget-wide v7, v7, Lh0/k;->a:J

    invoke-virtual {v3, v7, v8}, LB2/i;->e(J)Z

    move-result v7

    if-eqz v7, :cond_13

    goto :goto_c

    :cond_13
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_14
    const/4 v6, 0x0

    :goto_c
    check-cast v6, Lh0/k;

    const/4 v1, 0x3

    if-eqz v6, :cond_1c

    iget-boolean v3, v6, Lh0/k;->d:Z

    if-nez p4, :cond_16

    const/4 v4, 0x0

    iput-boolean v4, v0, Lh0/e;->l:Z

    :cond_15
    const/4 v6, 0x1

    goto :goto_d

    :cond_16
    const/4 v4, 0x0

    iget-boolean v5, v0, Lh0/e;->l:Z

    if-nez v5, :cond_15

    if-nez v3, :cond_17

    iget-boolean v5, v6, Lh0/k;->h:Z

    if-eqz v5, :cond_15

    :cond_17
    iget-object v5, v0, Lh0/e;->i:Ln0/Y;

    invoke-static {v5}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-wide v7, v5, Ll0/o;->f:J

    invoke-static {v6, v7, v8}, LZ0/d;->C(Lh0/k;J)Z

    move-result v5

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    iput-boolean v5, v0, Lh0/e;->l:Z

    :goto_d
    iget-boolean v5, v0, Lh0/e;->l:Z

    iget-boolean v7, v0, Lh0/e;->k:Z

    const/4 v8, 0x5

    const/4 v9, 0x4

    if-eq v5, v7, :cond_1a

    iget v5, v2, Lh0/f;->b:I

    invoke-static {v5, v1}, LZ/b;->p(II)Z

    move-result v5

    if-nez v5, :cond_18

    iget v5, v2, Lh0/f;->b:I

    invoke-static {v5, v9}, LZ/b;->p(II)Z

    move-result v5

    if-nez v5, :cond_18

    iget v5, v2, Lh0/f;->b:I

    invoke-static {v5, v8}, LZ/b;->p(II)Z

    move-result v5

    if-eqz v5, :cond_1a

    :cond_18
    iget-boolean v3, v0, Lh0/e;->l:Z

    if-eqz v3, :cond_19

    move v8, v9

    :cond_19
    iput v8, v2, Lh0/f;->b:I

    goto :goto_e

    :cond_1a
    iget v5, v2, Lh0/f;->b:I

    invoke-static {v5, v9}, LZ/b;->p(II)Z

    move-result v5

    if-eqz v5, :cond_1b

    iget-boolean v5, v0, Lh0/e;->k:Z

    if-eqz v5, :cond_1b

    iget-boolean v5, v0, Lh0/e;->m:Z

    if-nez v5, :cond_1b

    iput v1, v2, Lh0/f;->b:I

    goto :goto_e

    :cond_1b
    iget v5, v2, Lh0/f;->b:I

    invoke-static {v5, v8}, LZ/b;->p(II)Z

    move-result v5

    if-eqz v5, :cond_1d

    iget-boolean v5, v0, Lh0/e;->l:Z

    if-eqz v5, :cond_1d

    if-eqz v3, :cond_1d

    iput v1, v2, Lh0/f;->b:I

    goto :goto_e

    :cond_1c
    const/4 v4, 0x0

    const/4 v6, 0x1

    :cond_1d
    :goto_e
    if-nez v38, :cond_21

    iget v3, v2, Lh0/f;->b:I

    invoke-static {v3, v1}, LZ/b;->p(II)Z

    move-result v1

    if-eqz v1, :cond_21

    iget-object v1, v0, Lh0/e;->j:Lh0/f;

    if-eqz v1, :cond_21

    iget-object v1, v1, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    iget-object v5, v2, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-eq v3, v7, :cond_1e

    goto :goto_10

    :cond_1e
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    move v7, v4

    :goto_f
    if-ge v7, v3, :cond_20

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lh0/k;

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lh0/k;

    iget-wide v10, v8, Lh0/k;->c:J

    iget-wide v8, v9, Lh0/k;->c:J

    invoke-static {v10, v11, v8, v9}, LV/c;->a(JJ)Z

    move-result v8

    if-nez v8, :cond_1f

    goto :goto_10

    :cond_1f
    add-int/lit8 v7, v7, 0x1

    goto :goto_f

    :cond_20
    move v7, v4

    goto :goto_11

    :cond_21
    :goto_10
    move v7, v6

    :goto_11
    iput-object v2, v0, Lh0/e;->j:Lh0/f;

    return v7
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Node(pointerInputFilter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh0/e;->f:LP/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", children="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LA/t;->e:Ljava/lang/Object;

    check-cast v1, LF/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pointerIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh0/e;->g:LI/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(LB2/i;)V
    .locals 13

    invoke-super {p0, p1}, LA/t;->u(LB2/i;)V

    iget-object v0, p0, Lh0/e;->j:Lh0/f;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p0, Lh0/e;->l:Z

    iput-boolean v1, p0, Lh0/e;->k:Z

    iget-object v1, v0, Lh0/f;->a:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_5

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh0/k;

    iget-boolean v6, v5, Lh0/k;->d:Z

    iget-wide v7, v5, Lh0/k;->a:J

    invoke-virtual {p1, v7, v8}, LB2/i;->e(J)Z

    move-result v5

    iget-boolean v9, p0, Lh0/e;->l:Z

    if-nez v6, :cond_1

    if-eqz v5, :cond_2

    :cond_1
    if-nez v6, :cond_4

    if-nez v9, :cond_4

    :cond_2
    iget-object v5, p0, Lh0/e;->g:LI/m;

    iget v6, v5, LI/m;->e:I

    move v9, v3

    :goto_1
    if-ge v9, v6, :cond_4

    iget-object v10, v5, LI/m;->f:Ljava/lang/Object;

    check-cast v10, [J

    aget-wide v11, v10, v9

    cmp-long v10, v7, v11

    if-nez v10, :cond_3

    invoke-virtual {v5, v9}, LI/m;->d(I)V

    goto :goto_2

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    iput-boolean v3, p0, Lh0/e;->l:Z

    iget p1, v0, Lh0/f;->b:I

    const/4 v0, 0x5

    invoke-static {p1, v0}, LZ/b;->p(II)Z

    move-result p1

    iput-boolean p1, p0, Lh0/e;->m:Z

    return-void
.end method
