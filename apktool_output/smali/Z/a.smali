.class public final LZ/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ZLo2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LZ/a;->a:Z

    check-cast p2, Lp2/h;

    iput-object p2, p0, LZ/a;->b:Ljava/lang/Object;

    invoke-static {}, Lp/e;->a()Lp/d;

    move-result-object p1

    iput-object p1, p0, LZ/a;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LZ/a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ln0/B;FJ)V
    .locals 11

    iget-object v0, p0, LZ/a;->c:Ljava/lang/Object;

    check-cast v0, Lp/d;

    invoke-virtual {v0}, Lp/d;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-lez v1, :cond_1

    invoke-static {p3, p4, v0}, LW/r;->b(JF)J

    move-result-wide v3

    iget-boolean p3, p0, LZ/a;->a:Z

    if-eqz p3, :cond_0

    iget-object p3, p1, Ln0/B;->d:LY/b;

    invoke-interface {p3}, LY/d;->L()J

    move-result-wide v0

    invoke-static {v0, v1}, LV/f;->d(J)F

    move-result v8

    invoke-interface {p3}, LY/d;->L()J

    move-result-wide v0

    invoke-static {v0, v1}, LV/f;->b(J)F

    move-result v9

    iget-object p3, p3, LY/b;->e:LB0/a;

    invoke-virtual {p3}, LB0/a;->r()J

    move-result-wide v0

    invoke-virtual {p3}, LB0/a;->j()LW/o;

    move-result-object p4

    invoke-interface {p4}, LW/o;->d()V

    iget-object p4, p3, LB0/a;->b:Ljava/lang/Object;

    check-cast p4, LA/t;

    iget-object p4, p4, LA/t;->e:Ljava/lang/Object;

    check-cast p4, LB0/a;

    invoke-virtual {p4}, LB0/a;->j()LW/o;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x1

    invoke-interface/range {v5 .. v10}, LW/o;->n(FFFFI)V

    const/16 v8, 0x7c

    const-wide/16 v6, 0x0

    move-object v2, p1

    move v5, p2

    invoke-static/range {v2 .. v8}, LY/d;->i(Ln0/B;JFJI)V

    invoke-virtual {p3}, LB0/a;->j()LW/o;

    move-result-object p1

    invoke-interface {p1}, LW/o;->a()V

    invoke-virtual {p3, v0, v1}, LB0/a;->J(J)V

    goto :goto_0

    :cond_0
    const/16 v8, 0x7c

    const-wide/16 v6, 0x0

    move-object v2, p1

    move v5, p2

    invoke-static/range {v2 .. v8}, LY/d;->i(Ln0/B;JFJI)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b(Ls/f;Ly2/u;)V
    .locals 7

    instance-of v0, p1, Ls/d;

    iget-object v1, p0, LZ/a;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v2, p1, Ls/e;

    if-eqz v2, :cond_1

    move-object v2, p1

    check-cast v2, Ls/e;

    iget-object v2, v2, Ls/e;->a:Ls/d;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v2, p1, Ls/b;

    if-eqz v2, :cond_2

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of v2, p1, Ls/c;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Ls/c;

    iget-object v2, v2, Ls/c;->a:Ls/b;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of v2, p1, Ls/a;

    if-eqz v2, :cond_e

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-static {v1}, Ld2/k;->f0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls/f;

    iget-object v2, p0, LZ/a;->e:Ljava/lang/Object;

    check-cast v2, Ls/f;

    invoke-static {v2, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_a

    iget-object v5, p0, LZ/a;->b:Ljava/lang/Object;

    check-cast v5, Lp2/h;

    invoke-interface {v5}, Lo2/a;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz/h;

    if-eqz v0, :cond_4

    iget p1, v5, Lz/h;->c:F

    goto :goto_1

    :cond_4
    instance-of v0, p1, Ls/b;

    if-eqz v0, :cond_5

    iget p1, v5, Lz/h;->b:F

    goto :goto_1

    :cond_5
    instance-of p1, p1, Ls/a;

    if-eqz p1, :cond_6

    iget p1, v5, Lz/h;->a:F

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    :goto_1
    sget-object v0, Lz/u;->a:Lp/G;

    instance-of v0, v1, Ls/d;

    sget-object v5, Lz/u;->a:Lp/G;

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    instance-of v0, v1, Ls/b;

    const/16 v6, 0x2d

    if-eqz v0, :cond_8

    new-instance v5, Lp/G;

    sget-object v0, Lp/s;->b:LX/d;

    invoke-direct {v5, v6, v4, v0}, Lp/G;-><init>(IILp/r;)V

    goto :goto_2

    :cond_8
    instance-of v0, v1, Ls/a;

    if-eqz v0, :cond_9

    new-instance v5, Lp/G;

    sget-object v0, Lp/s;->b:LX/d;

    invoke-direct {v5, v6, v4, v0}, Lp/G;-><init>(IILp/r;)V

    :cond_9
    :goto_2
    new-instance v0, Lz/B;

    invoke-direct {v0, p0, p1, v5, v3}, Lz/B;-><init>(LZ/a;FLp/G;Lg2/d;)V

    invoke-static {p2, v3, v4, v0, v2}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    goto :goto_4

    :cond_a
    iget-object p1, p0, LZ/a;->e:Ljava/lang/Object;

    check-cast p1, Ls/f;

    sget-object v0, Lz/u;->a:Lp/G;

    instance-of v0, p1, Ls/d;

    sget-object v5, Lz/u;->a:Lp/G;

    if-eqz v0, :cond_b

    goto :goto_3

    :cond_b
    instance-of v0, p1, Ls/b;

    if-eqz v0, :cond_c

    goto :goto_3

    :cond_c
    instance-of p1, p1, Ls/a;

    if-eqz p1, :cond_d

    new-instance v5, Lp/G;

    sget-object p1, Lp/s;->b:LX/d;

    const/16 v0, 0x96

    invoke-direct {v5, v0, v4, p1}, Lp/G;-><init>(IILp/r;)V

    :cond_d
    :goto_3
    new-instance p1, Lz/C;

    invoke-direct {p1, p0, v5, v3}, Lz/C;-><init>(LZ/a;Lp/G;Lg2/d;)V

    invoke-static {p2, v3, v4, p1, v2}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    :goto_4
    iput-object v1, p0, LZ/a;->e:Ljava/lang/Object;

    :cond_e
    return-void
.end method

.method public c(LB2/i;Lo0/u;Z)I
    .locals 18

    move-object/from16 v1, p0

    iget-object v0, v1, LZ/a;->e:Ljava/lang/Object;

    check-cast v0, Ln0/n;

    iget-boolean v2, v1, LZ/a;->a:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return v3

    :cond_0
    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, v1, LZ/a;->a:Z

    iget-object v4, v1, LZ/a;->d:Ljava/lang/Object;

    check-cast v4, LA/t;

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    invoke-virtual {v4, v5, v6}, LA/t;->C(LB2/i;Lo0/u;)LB2/i;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v5, v4, LB2/i;->e:Ljava/lang/Object;

    check-cast v5, Ln/m;

    :try_start_1
    invoke-virtual {v5}, Ln/m;->g()I

    move-result v6

    move v7, v3

    :goto_0
    if-ge v7, v6, :cond_3

    invoke-virtual {v5, v7}, Ln/m;->h(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lh0/k;

    iget-boolean v9, v8, Lh0/k;->d:Z

    if-nez v9, :cond_2

    iget-boolean v8, v8, Lh0/k;->h:Z

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    move v6, v3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_3
    move v6, v2

    :goto_2
    invoke-virtual {v5}, Ln/m;->g()I

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v8, v3

    :goto_3
    iget-object v9, v1, LZ/a;->c:Ljava/lang/Object;

    check-cast v9, LB0/a;

    if-ge v8, v7, :cond_7

    :try_start_2
    invoke-virtual {v5, v8}, Ln/m;->h(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh0/k;

    if-nez v6, :cond_4

    invoke-static {v10}, LZ0/d;->m(Lh0/k;)Z

    move-result v11

    if-eqz v11, :cond_6

    :cond_4
    iget v11, v10, Lh0/k;->i:I

    if-ne v11, v2, :cond_5

    move/from16 v16, v2

    goto :goto_4

    :cond_5
    move/from16 v16, v3

    :goto_4
    iget-object v11, v1, LZ/a;->b:Ljava/lang/Object;

    move-object v12, v11

    check-cast v12, Ln0/z;

    iget-wide v13, v10, Lh0/k;->c:J

    iget-object v11, v1, LZ/a;->e:Ljava/lang/Object;

    move-object v15, v11

    check-cast v15, Ln0/n;

    const/16 v17, 0x1

    invoke-virtual/range {v12 .. v17}, Ln0/z;->o(JLn0/n;ZZ)V

    invoke-virtual {v0}, Ln0/n;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_6

    iget-wide v11, v10, Lh0/k;->a:J

    invoke-static {v10}, LZ0/d;->m(Lh0/k;)Z

    move-result v10

    invoke-virtual {v9, v11, v12, v0, v10}, LB0/a;->c(JLjava/util/List;Z)V

    invoke-virtual {v0}, Ln0/n;->clear()V

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_7
    iget-object v0, v9, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, LA/t;

    invoke-virtual {v0}, LA/t;->E()V

    move/from16 v0, p3

    invoke-virtual {v9, v4, v0}, LB0/a;->f(LB2/i;Z)Z

    move-result v0

    invoke-virtual {v5}, Ln/m;->g()I

    move-result v2

    move v4, v3

    :goto_5
    if-ge v4, v2, :cond_9

    invoke-virtual {v5, v4}, Ln/m;->h(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh0/k;

    iget-wide v7, v6, Lh0/k;->g:J

    iget-wide v9, v6, Lh0/k;->c:J

    invoke-static {v9, v10, v7, v8}, LV/c;->e(JJ)J

    move-result-wide v7

    const-wide/16 v9, 0x0

    invoke-static {v7, v8, v9, v10}, LV/c;->a(JJ)Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v6}, Lh0/k;->b()Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v6, :cond_8

    const/4 v2, 0x2

    goto :goto_6

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_9
    move v2, v3

    :goto_6
    or-int/2addr v0, v2

    iput-boolean v3, v1, LZ/a;->a:Z

    return v0

    :goto_7
    iput-boolean v3, v1, LZ/a;->a:Z

    throw v0
.end method

.method public d()V
    .locals 5

    iget-boolean v0, p0, LZ/a;->a:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LZ/a;->d:Ljava/lang/Object;

    check-cast v0, LA/t;

    iget-object v0, v0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Ln/m;

    invoke-virtual {v0}, Ln/m;->a()V

    iget-object v0, p0, LZ/a;->c:Ljava/lang/Object;

    check-cast v0, LB0/a;

    iget-object v1, v0, LB0/a;->c:Ljava/lang/Object;

    check-cast v1, LA/t;

    iget-object v1, v1, LA/t;->e:Ljava/lang/Object;

    check-cast v1, LF/d;

    iget v2, v1, LF/d;->f:I

    if-lez v2, :cond_1

    iget-object v1, v1, LF/d;->d:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, Lh0/e;

    invoke-virtual {v4}, Lh0/e;->J()V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_1
    iget-object v0, v0, LB0/a;->c:Ljava/lang/Object;

    check-cast v0, LA/t;

    iget-object v0, v0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LF/d;

    invoke-virtual {v0}, LF/d;->g()V

    :cond_2
    return-void
.end method
