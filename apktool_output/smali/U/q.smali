.class public final LU/q;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/g;
.implements Ln0/a0;
.implements Lm0/c;


# instance fields
.field public q:Z

.field public r:Z

.field public s:LU/p;


# direct methods
.method public static final i0(LU/q;)Z
    .locals 11

    iget-object p0, p0, LP/k;->d:LP/k;

    iget-boolean v0, p0, LP/k;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    new-instance v0, LF/d;

    const/16 v2, 0x10

    new-array v3, v2, [LP/k;

    invoke-direct {v0, v3}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v3, p0, LP/k;->i:LP/k;

    if-nez v3, :cond_0

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, LF/d;->b(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0}, LF/d;->k()Z

    move-result p0

    const/4 v3, 0x0

    if-eqz p0, :cond_c

    iget p0, v0, LF/d;->f:I

    const/4 v4, 0x1

    sub-int/2addr p0, v4

    invoke-virtual {v0, p0}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP/k;

    iget v5, p0, LP/k;->g:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_b

    move-object v5, p0

    :goto_1
    if-eqz v5, :cond_b

    iget v6, v5, LP/k;->f:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_a

    move-object v7, v1

    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_a

    instance-of v8, v6, LU/q;

    if-eqz v8, :cond_3

    check-cast v6, LU/q;

    iget-object v8, v6, LU/q;->s:LU/p;

    if-eqz v8, :cond_9

    invoke-virtual {v6}, LU/q;->h0()LU/p;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    if-eq p0, v4, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-ne p0, v0, :cond_1

    goto :goto_3

    :cond_1
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_2
    move v3, v4

    :goto_3
    return v3

    :cond_3
    iget v8, v6, LP/k;->f:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_9

    instance-of v8, v6, Ln0/i;

    if-eqz v8, :cond_9

    move-object v8, v6

    check-cast v8, Ln0/i;

    iget-object v8, v8, Ln0/i;->r:LP/k;

    move v9, v3

    :goto_4
    if-eqz v8, :cond_8

    iget v10, v8, LP/k;->f:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_7

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v4, :cond_4

    move-object v6, v8

    goto :goto_5

    :cond_4
    if-nez v7, :cond_5

    new-instance v7, LF/d;

    new-array v10, v2, [LP/k;

    invoke-direct {v7, v10}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v6, :cond_6

    invoke-virtual {v7, v6}, LF/d;->b(Ljava/lang/Object;)V

    move-object v6, v1

    :cond_6
    invoke-virtual {v7, v8}, LF/d;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_5
    iget-object v8, v8, LP/k;->i:LP/k;

    goto :goto_4

    :cond_8
    if-ne v9, v4, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v7}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v6

    goto :goto_2

    :cond_a
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_1

    :cond_b
    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto/16 :goto_0

    :cond_c
    return v3

    :cond_d
    const-string p0, "visitSubtreeIf called on an unattached node"

    invoke-static {p0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1
.end method

.method public static final j0(LU/q;)Z
    .locals 9

    iget-object v0, p0, LP/k;->d:LP/k;

    iget-boolean v1, v0, LP/k;->p:Z

    if-eqz v1, :cond_e

    iget-object v0, v0, LP/k;->h:LP/k;

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object p0

    :goto_0
    const/4 v1, 0x0

    if-eqz p0, :cond_d

    iget-object v2, p0, Ln0/z;->x:LD/s;

    iget-object v2, v2, LD/s;->f:Ljava/lang/Object;

    check-cast v2, LP/k;

    iget v2, v2, LP/k;->g:I

    and-int/lit16 v2, v2, 0x400

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    :goto_1
    if-eqz v0, :cond_b

    iget v2, v0, LP/k;->f:I

    and-int/lit16 v2, v2, 0x400

    if-eqz v2, :cond_a

    move-object v2, v0

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_a

    instance-of v5, v2, LU/q;

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    check-cast v2, LU/q;

    iget-object v5, v2, LU/q;->s:LU/p;

    if-eqz v5, :cond_9

    invoke-virtual {v2}, LU/q;->h0()LU/p;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    if-eq p0, v6, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_3

    :cond_0
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1
    move v1, v6

    :cond_2
    :goto_3
    return v1

    :cond_3
    iget v5, v2, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_9

    instance-of v5, v2, Ln0/i;

    if-eqz v5, :cond_9

    move-object v5, v2

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    move v7, v1

    :goto_4
    if-eqz v5, :cond_8

    iget v8, v5, LP/k;->f:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_7

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v6, :cond_4

    move-object v2, v5

    goto :goto_5

    :cond_4
    if-nez v4, :cond_5

    new-instance v4, LF/d;

    const/16 v8, 0x10

    new-array v8, v8, [LP/k;

    invoke-direct {v4, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v4, v2}, LF/d;->b(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_6
    invoke-virtual {v4, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_5
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_4

    :cond_8
    if-ne v7, v6, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v2

    goto :goto_2

    :cond_a
    iget-object v0, v0, LP/k;->h:LP/k;

    goto :goto_1

    :cond_b
    invoke-virtual {p0}, Ln0/z;->k()Ln0/z;

    move-result-object p0

    if-eqz p0, :cond_c

    iget-object v0, p0, Ln0/z;->x:LD/s;

    if-eqz v0, :cond_c

    iget-object v0, v0, LD/s;->e:Ljava/lang/Object;

    check-cast v0, Ln0/m0;

    goto/16 :goto_0

    :cond_c
    move-object v0, v3

    goto/16 :goto_0

    :cond_d
    return v1

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final Q()V
    .locals 2

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {p0}, LU/q;->k0()V

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {p0}, LU/c;->A(LU/q;)V

    :cond_0
    return-void
.end method

.method public final V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Z()V
    .locals 4

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    goto :goto_2

    :cond_0
    invoke-static {p0}, LU/c;->E(LU/q;)LA1/f;

    move-result-object v0

    :try_start_0
    iget-boolean v2, v0, LA1/f;->a:Z

    if-eqz v2, :cond_1

    invoke-static {v0}, LA1/f;->a(LA1/f;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    iput-boolean v1, v0, LA1/f;->a:Z

    sget-object v1, LU/p;->f:LU/p;

    invoke-virtual {p0, v1}, LU/q;->l0(LU/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LA1/f;->b(LA1/f;)V

    goto :goto_2

    :goto_1
    invoke-static {v0}, LA1/f;->b(LA1/f;)V

    throw v1

    :cond_2
    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object v0

    check-cast v0, Lo0/u;

    invoke-virtual {v0}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/a;

    const/4 v2, 0x0

    const/16 v3, 0x8

    invoke-virtual {v0, v3, v1, v2}, Landroidx/compose/ui/focus/a;->a(IZZ)Z

    invoke-static {p0}, LU/c;->q(LU/q;)V

    :goto_2
    const/4 v0, 0x0

    iput-object v0, p0, LU/q;->s:LU/p;

    return-void
.end method

.method public final f0()LU/j;
    .locals 11

    new-instance v0, LU/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, LU/j;->a:Z

    sget-object v2, LU/n;->b:LU/n;

    iput-object v2, v0, LU/j;->b:LU/n;

    iput-object v2, v0, LU/j;->c:LU/n;

    iput-object v2, v0, LU/j;->d:LU/n;

    iput-object v2, v0, LU/j;->e:LU/n;

    iput-object v2, v0, LU/j;->f:LU/n;

    iput-object v2, v0, LU/j;->g:LU/n;

    iput-object v2, v0, LU/j;->h:LU/n;

    iput-object v2, v0, LU/j;->i:LU/n;

    sget-object v2, LU/h;->g:LU/h;

    iput-object v2, v0, LU/j;->j:LU/h;

    sget-object v2, LU/h;->h:LU/h;

    iput-object v2, v0, LU/j;->k:LU/h;

    iget-object v2, p0, LP/k;->d:LP/k;

    iget-boolean v3, v2, LP/k;->p:Z

    if-eqz v3, :cond_c

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v3

    move-object v4, v2

    :goto_0
    if-eqz v3, :cond_b

    iget-object v5, v3, Ln0/z;->x:LD/s;

    iget-object v5, v5, LD/s;->f:Ljava/lang/Object;

    check-cast v5, LP/k;

    iget v5, v5, LP/k;->g:I

    and-int/lit16 v5, v5, 0xc00

    const/4 v6, 0x0

    if-eqz v5, :cond_9

    :goto_1
    if-eqz v4, :cond_9

    iget v5, v4, LP/k;->f:I

    and-int/lit16 v7, v5, 0xc00

    if-eqz v7, :cond_8

    if-eq v4, v2, :cond_0

    and-int/lit16 v7, v5, 0x400

    if-eqz v7, :cond_0

    goto/16 :goto_6

    :cond_0
    and-int/lit16 v5, v5, 0x800

    if-eqz v5, :cond_8

    move-object v5, v4

    move-object v7, v6

    :goto_2
    if-eqz v5, :cond_8

    instance-of v8, v5, LU/l;

    if-eqz v8, :cond_1

    check-cast v5, LU/l;

    invoke-interface {v5, v0}, LU/l;->h(LU/i;)V

    goto :goto_5

    :cond_1
    iget v8, v5, LP/k;->f:I

    and-int/lit16 v8, v8, 0x800

    if-eqz v8, :cond_7

    instance-of v8, v5, Ln0/i;

    if-eqz v8, :cond_7

    move-object v8, v5

    check-cast v8, Ln0/i;

    iget-object v8, v8, Ln0/i;->r:LP/k;

    const/4 v9, 0x0

    :goto_3
    if-eqz v8, :cond_6

    iget v10, v8, LP/k;->f:I

    and-int/lit16 v10, v10, 0x800

    if-eqz v10, :cond_5

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v1, :cond_2

    move-object v5, v8

    goto :goto_4

    :cond_2
    if-nez v7, :cond_3

    new-instance v7, LF/d;

    const/16 v10, 0x10

    new-array v10, v10, [LP/k;

    invoke-direct {v7, v10}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v7, v5}, LF/d;->b(Ljava/lang/Object;)V

    move-object v5, v6

    :cond_4
    invoke-virtual {v7, v8}, LF/d;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_4
    iget-object v8, v8, LP/k;->i:LP/k;

    goto :goto_3

    :cond_6
    if-ne v9, v1, :cond_7

    goto :goto_2

    :cond_7
    :goto_5
    invoke-static {v7}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v5

    goto :goto_2

    :cond_8
    iget-object v4, v4, LP/k;->h:LP/k;

    goto :goto_1

    :cond_9
    invoke-virtual {v3}, Ln0/z;->k()Ln0/z;

    move-result-object v3

    if-eqz v3, :cond_a

    iget-object v4, v3, Ln0/z;->x:LD/s;

    if-eqz v4, :cond_a

    iget-object v4, v4, LD/s;->e:Ljava/lang/Object;

    check-cast v4, Ln0/m0;

    goto :goto_0

    :cond_a
    move-object v4, v6

    goto/16 :goto_0

    :cond_b
    :goto_6
    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitAncestors called on an unattached node"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g0()V
    .locals 9

    iget-object v0, p0, LP/k;->d:LP/k;

    iget-boolean v1, v0, LP/k;->p:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    if-eqz v1, :cond_b

    iget-object v0, v0, LP/k;->h:LP/k;

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_a

    iget-object v3, v1, Ln0/z;->x:LD/s;

    iget-object v3, v3, LD/s;->f:Ljava/lang/Object;

    check-cast v3, LP/k;

    iget v3, v3, LP/k;->g:I

    and-int/lit8 v3, v3, 0x20

    if-eqz v3, :cond_8

    :goto_1
    if-eqz v0, :cond_8

    iget v3, v0, LP/k;->f:I

    and-int/lit8 v3, v3, 0x20

    if-eqz v3, :cond_7

    move-object v3, v0

    move-object v4, v2

    :goto_2
    if-eqz v3, :cond_7

    instance-of v5, v3, Lm0/c;

    if-eqz v5, :cond_0

    check-cast v3, Lm0/c;

    invoke-interface {v3}, Lm0/c;->a()Lm0/a;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_5

    :cond_0
    iget v5, v3, LP/k;->f:I

    and-int/lit8 v5, v5, 0x20

    if-eqz v5, :cond_6

    instance-of v5, v3, Ln0/i;

    if-eqz v5, :cond_6

    move-object v5, v3

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x1

    if-eqz v5, :cond_5

    iget v8, v5, LP/k;->f:I

    and-int/lit8 v8, v8, 0x20

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v3, v5

    goto :goto_4

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, LF/d;

    const/16 v7, 0x10

    new-array v7, v7, [LP/k;

    invoke-direct {v4, v7}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v4, v3}, LF/d;->b(Ljava/lang/Object;)V

    move-object v3, v2

    :cond_3
    invoke-virtual {v4, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_3

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_2

    :cond_6
    :goto_5
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v3

    goto :goto_2

    :cond_7
    iget-object v0, v0, LP/k;->h:LP/k;

    goto :goto_1

    :cond_8
    invoke-virtual {v1}, Ln0/z;->k()Ln0/z;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v0, v1, Ln0/z;->x:LD/s;

    if-eqz v0, :cond_9

    iget-object v0, v0, LD/s;->e:Ljava/lang/Object;

    check-cast v0, Ln0/m0;

    goto :goto_0

    :cond_9
    move-object v0, v2

    goto :goto_0

    :cond_a
    return-void

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitAncestors called on an unattached node"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    const-string v0, "ModifierLocal accessed from an unattached node"

    invoke-static {v0}, LZ0/d;->R(Ljava/lang/String;)V

    throw v2
.end method

.method public final h0()LU/p;
    .locals 1

    iget-object v0, p0, LP/k;->d:LP/k;

    iget-object v0, v0, LP/k;->k:Ln0/Y;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln0/Y;->n:Ln0/z;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln0/z;->l:Lo0/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroidx/compose/ui/focus/a;

    iget-object v0, v0, Landroidx/compose/ui/focus/a;->f:LA1/f;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, LA1/f;->b:Ljava/lang/Object;

    check-cast v0, Ln/y;

    invoke-virtual {v0, p0}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LU/p;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, LU/q;->s:LU/p;

    if-nez v0, :cond_2

    sget-object v0, LU/p;->f:LU/p;

    :cond_2
    return-object v0
.end method

.method public final k0()V
    .locals 4

    iget-object v0, p0, LU/q;->s:LU/p;

    const/4 v1, 0x1

    if-nez v0, :cond_3

    if-nez v0, :cond_2

    invoke-static {p0}, LU/c;->E(LU/q;)LA1/f;

    move-result-object v0

    :try_start_0
    iget-boolean v2, v0, LA1/f;->a:Z

    if-eqz v2, :cond_0

    invoke-static {v0}, LA1/f;->a(LA1/f;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iput-boolean v1, v0, LA1/f;->a:Z

    invoke-static {p0}, LU/q;->j0(LU/q;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p0}, LU/q;->i0(LU/q;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, LU/p;->e:LU/p;

    goto :goto_1

    :cond_1
    sget-object v2, LU/p;->f:LU/p;

    :goto_1
    invoke-virtual {p0, v2}, LU/q;->l0(LU/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LA1/f;->b(LA1/f;)V

    goto :goto_3

    :goto_2
    invoke-static {v0}, LA1/f;->b(LA1/f;)V

    throw v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Re-initializing focus target node."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_3
    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    goto :goto_4

    :cond_4
    new-instance v0, Lp2/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, LD/q0;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3, p0}, LD/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {p0, v2}, Ln0/C;->o(LP/k;Lo2/a;)V

    iget-object v0, v0, Lp2/o;->d:Ljava/lang/Object;

    if-eqz v0, :cond_6

    check-cast v0, LU/i;

    invoke-interface {v0}, LU/i;->a()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object v0

    check-cast v0, Lo0/u;

    invoke-virtual {v0}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/a;

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1, v1}, Landroidx/compose/ui/focus/a;->a(IZZ)Z

    :cond_5
    :goto_4
    return-void

    :cond_6
    const-string v0, "focusProperties"

    invoke-static {v0}, Lp2/g;->h(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final l0(LU/p;)V
    .locals 1

    invoke-static {p0}, LU/c;->E(LU/q;)LA1/f;

    move-result-object v0

    iget-object v0, v0, LA1/f;->b:Ljava/lang/Object;

    check-cast v0, Ln/y;

    invoke-virtual {v0, p0, p1}, Ln/y;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
