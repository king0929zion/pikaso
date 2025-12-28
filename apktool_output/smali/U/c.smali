.class public abstract LU/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, LU/c;->a:[I

    return-void
.end method

.method public static final A(LU/q;)V
    .locals 9

    iget-object v0, p0, LP/k;->d:LP/k;

    iget-boolean v1, v0, LP/k;->p:Z

    if-eqz v1, :cond_c

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object p0

    move-object v1, v0

    :goto_0
    if-eqz p0, :cond_b

    iget-object v2, p0, Ln0/z;->x:LD/s;

    iget-object v2, v2, LD/s;->f:Ljava/lang/Object;

    check-cast v2, LP/k;

    iget v2, v2, LP/k;->g:I

    and-int/lit16 v2, v2, 0x1400

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    :goto_1
    if-eqz v1, :cond_9

    iget v2, v1, LP/k;->f:I

    and-int/lit16 v4, v2, 0x1400

    if-eqz v4, :cond_8

    if-eq v1, v0, :cond_0

    and-int/lit16 v4, v2, 0x400

    if-eqz v4, :cond_0

    goto/16 :goto_6

    :cond_0
    and-int/lit16 v2, v2, 0x1000

    if-eqz v2, :cond_8

    move-object v2, v1

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_8

    instance-of v5, v2, LU/b;

    if-eqz v5, :cond_1

    check-cast v2, LU/b;

    invoke-static {v2}, LU/c;->o(LU/b;)LU/p;

    move-result-object v5

    invoke-interface {v2, v5}, LU/b;->z(LU/p;)V

    goto :goto_5

    :cond_1
    iget v5, v2, LP/k;->f:I

    and-int/lit16 v5, v5, 0x1000

    if-eqz v5, :cond_7

    instance-of v5, v2, Ln0/i;

    if-eqz v5, :cond_7

    move-object v5, v2

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x1

    if-eqz v5, :cond_6

    iget v8, v5, LP/k;->f:I

    and-int/lit16 v8, v8, 0x1000

    if-eqz v8, :cond_5

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_2

    move-object v2, v5

    goto :goto_4

    :cond_2
    if-nez v4, :cond_3

    new-instance v4, LF/d;

    const/16 v7, 0x10

    new-array v7, v7, [LP/k;

    invoke-direct {v4, v7}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v4, v2}, LF/d;->b(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_4
    invoke-virtual {v4, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_4
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_3

    :cond_6
    if-ne v6, v7, :cond_7

    goto :goto_2

    :cond_7
    :goto_5
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v2

    goto :goto_2

    :cond_8
    iget-object v1, v1, LP/k;->h:LP/k;

    goto :goto_1

    :cond_9
    invoke-virtual {p0}, Ln0/z;->k()Ln0/z;

    move-result-object p0

    if-eqz p0, :cond_a

    iget-object v1, p0, Ln0/z;->x:LD/s;

    if-eqz v1, :cond_a

    iget-object v1, v1, LD/s;->e:Ljava/lang/Object;

    check-cast v1, Ln0/m0;

    goto/16 :goto_0

    :cond_a
    move-object v1, v3

    goto/16 :goto_0

    :cond_b
    :goto_6
    return-void

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final B(LU/q;)Z
    .locals 1

    const/4 v0, 0x7

    invoke-static {p0, v0}, LU/c;->C(LU/q;I)Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final C(LU/q;I)Ljava/lang/Boolean;
    .locals 4

    invoke-static {p0}, LU/c;->E(LU/q;)LA1/f;

    move-result-object v0

    new-instance v1, LU/r;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, LU/r;-><init>(LU/q;I)V

    :try_start_0
    iget-boolean v2, v0, LA1/f;->a:Z

    if-eqz v2, :cond_0

    invoke-static {v0}, LA1/f;->a(LA1/f;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_0
    :goto_0
    const/4 v2, 0x1

    iput-boolean v2, v0, LA1/f;->a:Z

    iget-object v3, v0, LA1/f;->c:Ljava/lang/Object;

    check-cast v3, LF/d;

    invoke-virtual {v3, v1}, LF/d;->b(Ljava/lang/Object;)V

    invoke-static {p0, p1}, LU/c;->w(LU/q;I)I

    move-result p1

    invoke-static {p1}, Lp/f;->b(I)I

    move-result p1

    if-eqz p1, :cond_4

    if-eq p1, v2, :cond_3

    const/4 p0, 0x2

    if-eq p1, p0, :cond_2

    const/4 p0, 0x3

    if-ne p1, p0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p0, 0x0

    goto :goto_2

    :cond_4
    invoke-static {p0}, LU/c;->x(LU/q;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-static {v0}, LA1/f;->b(LA1/f;)V

    return-object p0

    :goto_3
    invoke-static {v0}, LA1/f;->b(LA1/f;)V

    throw p0
.end method

.method public static final D(LU/q;LU/q;)Z
    .locals 12

    iget-object v0, p1, LP/k;->d:LP/k;

    iget-boolean v1, v0, LP/k;->p:Z

    const-string v2, "visitAncestors called on an unattached node"

    if-eqz v1, :cond_20

    iget-object v0, v0, LP/k;->h:LP/k;

    invoke-static {p1}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v1

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/16 v6, 0x10

    if-eqz v1, :cond_a

    iget-object v7, v1, Ln0/z;->x:LD/s;

    iget-object v7, v7, LD/s;->f:Ljava/lang/Object;

    check-cast v7, LP/k;

    iget v7, v7, LP/k;->g:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_8

    :goto_1
    if-eqz v0, :cond_8

    iget v7, v0, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_7

    move-object v7, v0

    move-object v8, v3

    :goto_2
    if-eqz v7, :cond_7

    instance-of v9, v7, LU/q;

    if-eqz v9, :cond_0

    goto :goto_5

    :cond_0
    iget v9, v7, LP/k;->f:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_6

    instance-of v9, v7, Ln0/i;

    if-eqz v9, :cond_6

    move-object v9, v7

    check-cast v9, Ln0/i;

    iget-object v9, v9, Ln0/i;->r:LP/k;

    move v10, v4

    :goto_3
    if-eqz v9, :cond_5

    iget v11, v9, LP/k;->f:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_4

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v5, :cond_1

    move-object v7, v9

    goto :goto_4

    :cond_1
    if-nez v8, :cond_2

    new-instance v8, LF/d;

    new-array v11, v6, [LP/k;

    invoke-direct {v8, v11}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v7, :cond_3

    invoke-virtual {v8, v7}, LF/d;->b(Ljava/lang/Object;)V

    move-object v7, v3

    :cond_3
    invoke-virtual {v8, v9}, LF/d;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    iget-object v9, v9, LP/k;->i:LP/k;

    goto :goto_3

    :cond_5
    if-ne v10, v5, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v8}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v7

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
    move-object v0, v3

    goto :goto_0

    :cond_a
    move-object v7, v3

    :goto_5
    invoke-static {v7, p0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, LU/p;->e:LU/p;

    if-eqz v0, :cond_1d

    if-eq v0, v5, :cond_1a

    const/4 v7, 0x2

    if-eq v0, v7, :cond_1e

    const/4 v7, 0x3

    if-ne v0, v7, :cond_19

    iget-object v0, p0, LP/k;->d:LP/k;

    iget-boolean v7, v0, LP/k;->p:Z

    if-eqz v7, :cond_18

    iget-object v0, v0, LP/k;->h:LP/k;

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v2

    :goto_6
    if-eqz v2, :cond_15

    iget-object v7, v2, Ln0/z;->x:LD/s;

    iget-object v7, v7, LD/s;->f:Ljava/lang/Object;

    check-cast v7, LP/k;

    iget v7, v7, LP/k;->g:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_13

    :goto_7
    if-eqz v0, :cond_13

    iget v7, v0, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_12

    move-object v7, v0

    move-object v8, v3

    :goto_8
    if-eqz v7, :cond_12

    instance-of v9, v7, LU/q;

    if-eqz v9, :cond_b

    goto :goto_b

    :cond_b
    iget v9, v7, LP/k;->f:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_11

    instance-of v9, v7, Ln0/i;

    if-eqz v9, :cond_11

    move-object v9, v7

    check-cast v9, Ln0/i;

    iget-object v9, v9, Ln0/i;->r:LP/k;

    move v10, v4

    :goto_9
    if-eqz v9, :cond_10

    iget v11, v9, LP/k;->f:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_f

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v5, :cond_c

    move-object v7, v9

    goto :goto_a

    :cond_c
    if-nez v8, :cond_d

    new-instance v8, LF/d;

    new-array v11, v6, [LP/k;

    invoke-direct {v8, v11}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_d
    if-eqz v7, :cond_e

    invoke-virtual {v8, v7}, LF/d;->b(Ljava/lang/Object;)V

    move-object v7, v3

    :cond_e
    invoke-virtual {v8, v9}, LF/d;->b(Ljava/lang/Object;)V

    :cond_f
    :goto_a
    iget-object v9, v9, LP/k;->i:LP/k;

    goto :goto_9

    :cond_10
    if-ne v10, v5, :cond_11

    goto :goto_8

    :cond_11
    invoke-static {v8}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v7

    goto :goto_8

    :cond_12
    iget-object v0, v0, LP/k;->h:LP/k;

    goto :goto_7

    :cond_13
    invoke-virtual {v2}, Ln0/z;->k()Ln0/z;

    move-result-object v2

    if-eqz v2, :cond_14

    iget-object v0, v2, Ln0/z;->x:LD/s;

    if-eqz v0, :cond_14

    iget-object v0, v0, LD/s;->e:Ljava/lang/Object;

    check-cast v0, Ln0/m0;

    goto :goto_6

    :cond_14
    move-object v0, v3

    goto :goto_6

    :cond_15
    move-object v7, v3

    :goto_b
    check-cast v7, LU/q;

    if-nez v7, :cond_16

    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object v0

    check-cast v0, Lo0/u;

    invoke-virtual {v0}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/a;

    iget-object v0, v0, Landroidx/compose/ui/focus/a;->a:Lo0/o;

    invoke-virtual {v0, v3, v3}, Lo0/o;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {p1}, LU/c;->p(LU/q;)V

    invoke-virtual {p0, v1}, LU/q;->l0(LU/p;)V

    :goto_c
    move v4, v5

    goto :goto_e

    :cond_16
    if-eqz v7, :cond_1e

    invoke-static {v7, p0}, LU/c;->D(LU/q;LU/q;)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {p0, p1}, LU/c;->D(LU/q;LU/q;)Z

    move-result v4

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object p0

    if-ne p0, v1, :cond_17

    if-eqz v4, :cond_1e

    invoke-static {v7}, LU/c;->A(LU/q;)V

    goto :goto_e

    :cond_17
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Deactivated node is focused"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_18
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_19
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1a
    invoke-static {p0}, LU/c;->n(LU/q;)LU/q;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-static {p0}, LU/c;->n(LU/q;)LU/q;

    move-result-object p0

    if-eqz p0, :cond_1b

    invoke-static {p0, v4, v5}, LU/c;->e(LU/q;ZZ)Z

    move-result p0

    goto :goto_d

    :cond_1b
    move p0, v5

    :goto_d
    if-eqz p0, :cond_1e

    invoke-static {p1}, LU/c;->p(LU/q;)V

    goto :goto_c

    :cond_1c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "ActiveParent with no focused child"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1d
    invoke-static {p1}, LU/c;->p(LU/q;)V

    invoke-virtual {p0, v1}, LU/q;->l0(LU/p;)V

    goto :goto_c

    :cond_1e
    :goto_e
    return v4

    :cond_1f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Non child node cannot request focus."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_20
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final E(LU/q;)LA1/f;
    .locals 0

    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object p0

    check-cast p0, Lo0/u;

    invoke-virtual {p0}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/focus/a;

    iget-object p0, p0, Landroidx/compose/ui/focus/a;->f:LA1/f;

    return-object p0
.end method

.method public static final F(LU/q;)V
    .locals 9

    iget-object v0, p0, LP/k;->d:LP/k;

    iget-boolean v1, v0, LP/k;->p:Z

    if-eqz v1, :cond_c

    iget-object v0, v0, LP/k;->h:LP/k;

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_a

    iget-object v3, v1, Ln0/z;->x:LD/s;

    iget-object v3, v3, LD/s;->f:Ljava/lang/Object;

    check-cast v3, LP/k;

    iget v3, v3, LP/k;->g:I

    and-int/lit16 v3, v3, 0x400

    if-eqz v3, :cond_8

    :goto_1
    if-eqz v0, :cond_8

    iget v3, v0, LP/k;->f:I

    and-int/lit16 v3, v3, 0x400

    if-eqz v3, :cond_7

    move-object v3, v0

    move-object v4, v2

    :goto_2
    if-eqz v3, :cond_7

    instance-of v5, v3, LU/q;

    if-eqz v5, :cond_0

    goto :goto_5

    :cond_0
    iget v5, v3, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

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

    and-int/lit16 v8, v8, 0x400

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
    move-object v3, v2

    :goto_5
    check-cast v3, LU/q;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, LU/q;->g0()V

    invoke-virtual {p0}, LU/q;->g0()V

    invoke-static {v2, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    return-void

    :cond_b
    invoke-virtual {p0}, LU/q;->g0()V

    return-void

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final G(ILD2/p;LU/q;LV/d;)Z
    .locals 10

    new-instance v0, LF/d;

    const/16 v1, 0x10

    new-array v2, v1, [LU/q;

    invoke-direct {v0, v2}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object p2, p2, LP/k;->d:LP/k;

    iget-boolean v2, p2, LP/k;->p:Z

    if-eqz v2, :cond_10

    new-instance v2, LF/d;

    new-array v3, v1, [LP/k;

    invoke-direct {v2, v3}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v3, p2, LP/k;->i:LP/k;

    if-nez v3, :cond_0

    invoke-static {v2, p2}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3}, LF/d;->b(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {v2}, LF/d;->k()Z

    move-result p2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz p2, :cond_b

    iget p2, v2, LF/d;->f:I

    sub-int/2addr p2, v3

    invoke-virtual {v2, p2}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LP/k;

    iget v5, p2, LP/k;->g:I

    and-int/lit16 v5, v5, 0x400

    if-nez v5, :cond_2

    invoke-static {v2, p2}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p2, :cond_1

    iget v5, p2, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_a

    const/4 v5, 0x0

    move-object v6, v5

    :goto_2
    if-eqz p2, :cond_1

    instance-of v7, p2, LU/q;

    if-eqz v7, :cond_3

    check-cast p2, LU/q;

    iget-boolean v7, p2, LP/k;->p:Z

    if-eqz v7, :cond_9

    invoke-virtual {v0, p2}, LF/d;->b(Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    iget v7, p2, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_9

    instance-of v7, p2, Ln0/i;

    if-eqz v7, :cond_9

    move-object v7, p2

    check-cast v7, Ln0/i;

    iget-object v7, v7, Ln0/i;->r:LP/k;

    move v8, v4

    :goto_3
    if-eqz v7, :cond_8

    iget v9, v7, LP/k;->f:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_7

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v3, :cond_4

    move-object p2, v7

    goto :goto_4

    :cond_4
    if-nez v6, :cond_5

    new-instance v6, LF/d;

    new-array v9, v1, [LP/k;

    invoke-direct {v6, v9}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz p2, :cond_6

    invoke-virtual {v6, p2}, LF/d;->b(Ljava/lang/Object;)V

    move-object p2, v5

    :cond_6
    invoke-virtual {v6, v7}, LF/d;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_4
    iget-object v7, v7, LP/k;->i:LP/k;

    goto :goto_3

    :cond_8
    if-ne v8, v3, :cond_9

    goto :goto_2

    :cond_9
    :goto_5
    invoke-static {v6}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object p2

    goto :goto_2

    :cond_a
    iget-object p2, p2, LP/k;->i:LP/k;

    goto :goto_1

    :cond_b
    :goto_6
    invoke-virtual {v0}, LF/d;->k()Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-static {v0, p3, p0}, LU/c;->h(LF/d;LV/d;I)LU/q;

    move-result-object p2

    if-nez p2, :cond_c

    return v4

    :cond_c
    invoke-virtual {p2}, LU/q;->f0()LU/j;

    move-result-object v1

    iget-boolean v1, v1, LU/j;->a:Z

    if-eqz v1, :cond_d

    invoke-virtual {p1, p2}, LD2/p;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_d
    invoke-static {p0, p1, p2, p3}, LU/c;->l(ILD2/p;LU/q;LV/d;)Z

    move-result v1

    if-eqz v1, :cond_e

    return v3

    :cond_e
    invoke-virtual {v0, p2}, LF/d;->l(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    return v4

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitChildren called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final H(I)Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x5

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x21

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x6

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p0, 0x82

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p0, 0x11

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 p0, 0x42

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_4
    invoke-static {p0, v2}, LU/a;->a(II)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_5
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final I(I)LU/a;
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_4

    const/16 v0, 0x11

    if-eq p0, v0, :cond_3

    const/16 v0, 0x21

    if-eq p0, v0, :cond_2

    const/16 v0, 0x42

    if-eq p0, v0, :cond_1

    const/16 v0, 0x82

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance p0, LU/a;

    const/4 v0, 0x6

    invoke-direct {p0, v0}, LU/a;-><init>(I)V

    goto :goto_0

    :cond_1
    new-instance p0, LU/a;

    const/4 v0, 0x4

    invoke-direct {p0, v0}, LU/a;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance p0, LU/a;

    const/4 v0, 0x5

    invoke-direct {p0, v0}, LU/a;-><init>(I)V

    goto :goto_0

    :cond_3
    new-instance p0, LU/a;

    const/4 v0, 0x3

    invoke-direct {p0, v0}, LU/a;-><init>(I)V

    goto :goto_0

    :cond_4
    new-instance p0, LU/a;

    invoke-direct {p0, v1}, LU/a;-><init>(I)V

    goto :goto_0

    :cond_5
    new-instance p0, LU/a;

    invoke-direct {p0, v0}, LU/a;-><init>(I)V

    :goto_0
    return-object p0
.end method

.method public static final J(ILD2/p;LU/q;LV/d;)Ljava/lang/Boolean;
    .locals 6

    invoke-virtual {p2}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_d

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_d

    if-ne v0, v1, :cond_2

    invoke-virtual {p2}, LU/q;->f0()LU/j;

    move-result-object v0

    iget-boolean v0, v0, LU/j;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, LD2/p;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    invoke-static {p2, p0, p1}, LU/c;->i(LU/q;ILo2/c;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p2, p3}, LU/c;->G(ILD2/p;LU/q;LV/d;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_2
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_3
    invoke-static {p2}, LU/c;->n(LU/q;)LU/q;

    move-result-object v0

    const-string v4, "ActiveParent must have a focusedChild"

    if-eqz v0, :cond_c

    invoke-virtual {v0}, LU/q;->h0()LU/p;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_a

    if-eq v5, v3, :cond_5

    if-eq v5, v2, :cond_a

    if-eq v5, v1, :cond_4

    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    invoke-static {p0, p1, v0, p3}, LU/c;->J(ILD2/p;LU/q;LV/d;)Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return-object v1

    :cond_6
    if-nez p3, :cond_9

    invoke-virtual {v0}, LU/q;->h0()LU/p;

    move-result-object p3

    sget-object v1, LU/p;->e:LU/p;

    if-ne p3, v1, :cond_8

    invoke-static {v0}, LU/c;->g(LU/q;)LU/q;

    move-result-object p3

    if-eqz p3, :cond_7

    invoke-static {p3}, LU/c;->j(LU/q;)LV/d;

    move-result-object p3

    goto :goto_1

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Searching for active node in inactive hierarchy"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    :goto_1
    invoke-static {p0, p1, p2, p3}, LU/c;->l(ILD2/p;LU/q;LV/d;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_a
    if-nez p3, :cond_b

    invoke-static {v0}, LU/c;->j(LU/q;)LV/d;

    move-result-object p3

    :cond_b
    invoke-static {p0, p1, p2, p3}, LU/c;->l(ILD2/p;LU/q;LV/d;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    invoke-static {p2, p0, p1}, LU/c;->i(LU/q;ILo2/c;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final a(LU/q;LD2/p;)Z
    .locals 7

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_8

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_8

    if-ne v0, v1, :cond_2

    invoke-static {p0, p1}, LU/c;->y(LU/q;LD2/p;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LU/q;->f0()LU/j;

    move-result-object v0

    iget-boolean v0, v0, LU/j;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, LD2/p;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v2

    :goto_0
    if-eqz p0, :cond_9

    :cond_1
    :goto_1
    move v2, v4

    goto :goto_2

    :cond_2
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_3
    invoke-static {p0}, LU/c;->n(LU/q;)LU/q;

    move-result-object v0

    const-string v5, "ActiveParent must have a focusedChild"

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LU/q;->h0()LU/p;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_6

    if-eq v6, v4, :cond_5

    if-eq v6, v3, :cond_6

    if-eq v6, v1, :cond_4

    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    invoke-static {v0, p1}, LU/c;->a(LU/q;LD2/p;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p0, v0, v3, p1}, LU/c;->m(LU/q;LU/q;ILD2/p;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {v0}, LU/q;->f0()LU/j;

    move-result-object p0

    iget-boolean p0, p0, LU/j;->a:Z

    if-eqz p0, :cond_9

    invoke-virtual {p1, v0}, LD2/p;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_9

    goto :goto_1

    :cond_6
    invoke-static {p0, v0, v3, p1}, LU/c;->m(LU/q;LU/q;ILD2/p;)Z

    move-result v2

    goto :goto_2

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-static {p0, p1}, LU/c;->y(LU/q;LD2/p;)Z

    move-result v2

    :cond_9
    :goto_2
    return v2
.end method

.method public static final b(LV/d;LV/d;LV/d;I)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    invoke-static {v3, v2, v0}, LU/c;->c(ILV/d;LV/d;)Z

    move-result v4

    if-nez v4, :cond_c

    invoke-static {v3, v1, v0}, LU/c;->c(ILV/d;LV/d;)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v4, 0x3

    invoke-static {v3, v4}, LU/a;->a(II)Z

    move-result v6

    const-string v8, "This function should only be used for 2-D focus search"

    const/4 v9, 0x6

    const/4 v10, 0x5

    const/4 v11, 0x4

    iget v12, v2, LV/d;->b:F

    iget v13, v2, LV/d;->d:F

    iget v14, v2, LV/d;->a:F

    iget v2, v2, LV/d;->c:F

    iget v15, v0, LV/d;->d:F

    iget v5, v0, LV/d;->b:F

    iget v7, v0, LV/d;->c:F

    iget v0, v0, LV/d;->a:F

    if-eqz v6, :cond_1

    cmpl-float v6, v0, v2

    if-ltz v6, :cond_b

    goto :goto_0

    :cond_1
    invoke-static {v3, v11}, LU/a;->a(II)Z

    move-result v6

    if-eqz v6, :cond_2

    cmpg-float v6, v7, v14

    if-gtz v6, :cond_b

    goto :goto_0

    :cond_2
    invoke-static {v3, v10}, LU/a;->a(II)Z

    move-result v6

    if-eqz v6, :cond_3

    cmpl-float v6, v5, v13

    if-ltz v6, :cond_b

    goto :goto_0

    :cond_3
    invoke-static {v3, v9}, LU/a;->a(II)Z

    move-result v6

    if-eqz v6, :cond_f

    cmpg-float v6, v15, v12

    if-gtz v6, :cond_b

    :goto_0
    invoke-static {v3, v4}, LU/a;->a(II)Z

    move-result v6

    if-nez v6, :cond_b

    invoke-static {v3, v11}, LU/a;->a(II)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v3, v4}, LU/a;->a(II)Z

    move-result v6

    if-eqz v6, :cond_5

    iget v1, v1, LV/d;->c:F

    sub-float v1, v0, v1

    goto :goto_1

    :cond_5
    invoke-static {v3, v11}, LU/a;->a(II)Z

    move-result v6

    if-eqz v6, :cond_6

    iget v1, v1, LV/d;->a:F

    sub-float/2addr v1, v7

    goto :goto_1

    :cond_6
    invoke-static {v3, v10}, LU/a;->a(II)Z

    move-result v6

    if-eqz v6, :cond_7

    iget v1, v1, LV/d;->d:F

    sub-float v1, v5, v1

    goto :goto_1

    :cond_7
    invoke-static {v3, v9}, LU/a;->a(II)Z

    move-result v6

    if-eqz v6, :cond_e

    iget v1, v1, LV/d;->b:F

    sub-float/2addr v1, v15

    :goto_1
    const/4 v6, 0x0

    invoke-static {v6, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v3, v4}, LU/a;->a(II)Z

    move-result v4

    if-eqz v4, :cond_8

    sub-float/2addr v0, v14

    goto :goto_2

    :cond_8
    invoke-static {v3, v11}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_9

    sub-float v0, v2, v7

    goto :goto_2

    :cond_9
    invoke-static {v3, v10}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_a

    sub-float v0, v5, v12

    goto :goto_2

    :cond_a
    invoke-static {v3, v9}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_d

    sub-float v0, v13, v15

    :goto_2
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_c

    :cond_b
    :goto_3
    const/4 v5, 0x1

    goto :goto_5

    :cond_c
    :goto_4
    const/4 v5, 0x0

    goto :goto_5

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    return v5
.end method

.method public static final c(ILV/d;LV/d;)Z
    .locals 3

    const/4 v0, 0x3

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    :goto_0
    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget p0, p2, LV/d;->b:F

    iget v0, p1, LV/d;->d:F

    cmpl-float p0, v0, p0

    if-lez p0, :cond_1

    iget p0, p1, LV/d;->b:F

    iget p1, p2, LV/d;->d:F

    cmpg-float p0, p0, p1

    if-gez p0, :cond_1

    goto :goto_2

    :cond_1
    move v1, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x5

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_3

    move p0, v1

    goto :goto_1

    :cond_3
    const/4 v0, 0x6

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result p0

    :goto_1
    if-eqz p0, :cond_4

    iget p0, p2, LV/d;->a:F

    iget v0, p1, LV/d;->c:F

    cmpl-float p0, v0, p0

    if-lez p0, :cond_1

    iget p0, p1, LV/d;->a:F

    iget p1, p2, LV/d;->c:F

    cmpg-float p0, p0, p1

    if-gez p0, :cond_1

    :goto_2
    return v1

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This function should only be used for 2-D focus search"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(Landroid/view/View;)LV/d;
    .locals 6

    sget-object v0, LU/c;->a:[I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    new-instance v1, LV/d;

    const/4 v2, 0x0

    aget v2, v0, v2

    int-to-float v2, v2

    const/4 v3, 0x1

    aget v4, v0, v3

    int-to-float v4, v4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v2

    aget v0, v0, v3

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    add-float/2addr v0, p0

    invoke-direct {v1, v2, v4, v5, v0}, LV/d;-><init>(FFFF)V

    return-object v1
.end method

.method public static final e(LU/q;ZZ)Z
    .locals 4

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, LU/p;->f:LU/p;

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 p0, 0x3

    if-ne v0, p0, :cond_1

    :cond_0
    :goto_0
    move p1, v2

    goto :goto_2

    :cond_1
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_2
    if-eqz p1, :cond_7

    invoke-virtual {p0, v1}, LU/q;->l0(LU/p;)V

    if-eqz p2, :cond_7

    invoke-static {p0}, LU/c;->A(LU/q;)V

    goto :goto_2

    :cond_3
    invoke-static {p0}, LU/c;->n(LU/q;)LU/q;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0, p1, p2}, LU/c;->e(LU/q;ZZ)Z

    move-result p1

    goto :goto_1

    :cond_4
    move p1, v2

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p0, v1}, LU/q;->l0(LU/p;)V

    if-eqz p2, :cond_0

    invoke-static {p0}, LU/c;->A(LU/q;)V

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    goto :goto_2

    :cond_6
    invoke-virtual {p0, v1}, LU/q;->l0(LU/p;)V

    if-eqz p2, :cond_0

    invoke-static {p0}, LU/c;->A(LU/q;)V

    goto :goto_0

    :cond_7
    :goto_2
    return p1
.end method

.method public static final f(LU/q;LF/d;)V
    .locals 8

    iget-object p0, p0, LP/k;->d:LP/k;

    iget-boolean v0, p0, LP/k;->p:Z

    if-eqz v0, :cond_e

    new-instance v0, LF/d;

    const/16 v1, 0x10

    new-array v2, v1, [LP/k;

    invoke-direct {v0, v2}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v2, p0, LP/k;->i:LP/k;

    if-nez v2, :cond_0

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, LF/d;->b(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {v0}, LF/d;->k()Z

    move-result p0

    if-eqz p0, :cond_d

    iget p0, v0, LF/d;->f:I

    const/4 v2, 0x1

    sub-int/2addr p0, v2

    invoke-virtual {v0, p0}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP/k;

    iget v3, p0, LP/k;->g:I

    and-int/lit16 v3, v3, 0x400

    if-nez v3, :cond_2

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p0, :cond_1

    iget v3, p0, LP/k;->f:I

    and-int/lit16 v3, v3, 0x400

    if-eqz v3, :cond_c

    const/4 v3, 0x0

    move-object v4, v3

    :goto_2
    if-eqz p0, :cond_1

    instance-of v5, p0, LU/q;

    if-eqz v5, :cond_5

    check-cast p0, LU/q;

    iget-boolean v5, p0, LP/k;->p:Z

    if-eqz v5, :cond_b

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v5

    iget-boolean v5, v5, Ln0/z;->E:Z

    if-eqz v5, :cond_3

    goto :goto_5

    :cond_3
    invoke-virtual {p0}, LU/q;->f0()LU/j;

    move-result-object v5

    iget-boolean v5, v5, LU/j;->a:Z

    if-eqz v5, :cond_4

    invoke-virtual {p1, p0}, LF/d;->b(Ljava/lang/Object;)V

    goto :goto_5

    :cond_4
    invoke-static {p0, p1}, LU/c;->f(LU/q;LF/d;)V

    goto :goto_5

    :cond_5
    iget v5, p0, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_b

    instance-of v5, p0, Ln0/i;

    if-eqz v5, :cond_b

    move-object v5, p0

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    const/4 v6, 0x0

    :goto_3
    if-eqz v5, :cond_a

    iget v7, v5, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_9

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v2, :cond_6

    move-object p0, v5

    goto :goto_4

    :cond_6
    if-nez v4, :cond_7

    new-instance v4, LF/d;

    new-array v7, v1, [LP/k;

    invoke-direct {v4, v7}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz p0, :cond_8

    invoke-virtual {v4, p0}, LF/d;->b(Ljava/lang/Object;)V

    move-object p0, v3

    :cond_8
    invoke-virtual {v4, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_4
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_3

    :cond_a
    if-ne v6, v2, :cond_b

    goto :goto_2

    :cond_b
    :goto_5
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object p0

    goto :goto_2

    :cond_c
    iget-object p0, p0, LP/k;->i:LP/k;

    goto :goto_1

    :cond_d
    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitChildren called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final g(LU/q;)LU/q;
    .locals 8

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_f

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_f

    const/4 p0, 0x3

    if-ne v0, p0, :cond_0

    return-object v2

    :cond_0
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1
    iget-object p0, p0, LP/k;->d:LP/k;

    iget-boolean v0, p0, LP/k;->p:Z

    if-eqz v0, :cond_e

    new-instance v0, LF/d;

    const/16 v3, 0x10

    new-array v4, v3, [LP/k;

    invoke-direct {v0, v4}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v4, p0, LP/k;->i:LP/k;

    if-nez v4, :cond_2

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v4}, LF/d;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    invoke-virtual {v0}, LF/d;->k()Z

    move-result p0

    if-eqz p0, :cond_d

    iget p0, v0, LF/d;->f:I

    sub-int/2addr p0, v1

    invoke-virtual {v0, p0}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP/k;

    iget v4, p0, LP/k;->g:I

    and-int/lit16 v4, v4, 0x400

    if-nez v4, :cond_4

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_4
    :goto_1
    if-eqz p0, :cond_3

    iget v4, p0, LP/k;->f:I

    and-int/lit16 v4, v4, 0x400

    if-eqz v4, :cond_c

    move-object v4, v2

    :goto_2
    if-eqz p0, :cond_3

    instance-of v5, p0, LU/q;

    if-eqz v5, :cond_5

    check-cast p0, LU/q;

    invoke-static {p0}, LU/c;->g(LU/q;)LU/q;

    move-result-object p0

    if-eqz p0, :cond_b

    return-object p0

    :cond_5
    iget v5, p0, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_b

    instance-of v5, p0, Ln0/i;

    if-eqz v5, :cond_b

    move-object v5, p0

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    const/4 v6, 0x0

    :goto_3
    if-eqz v5, :cond_a

    iget v7, v5, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_9

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v1, :cond_6

    move-object p0, v5

    goto :goto_4

    :cond_6
    if-nez v4, :cond_7

    new-instance v4, LF/d;

    new-array v7, v3, [LP/k;

    invoke-direct {v4, v7}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz p0, :cond_8

    invoke-virtual {v4, p0}, LF/d;->b(Ljava/lang/Object;)V

    move-object p0, v2

    :cond_8
    invoke-virtual {v4, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_4
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_3

    :cond_a
    if-ne v6, v1, :cond_b

    goto :goto_2

    :cond_b
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object p0

    goto :goto_2

    :cond_c
    iget-object p0, p0, LP/k;->i:LP/k;

    goto :goto_1

    :cond_d
    return-object v2

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitChildren called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_f
    return-object p0
.end method

.method public static final h(LF/d;LV/d;I)LU/q;
    .locals 10

    const/4 v0, 0x3

    invoke-static {p2, v0}, LU/a;->a(II)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LV/d;->c()F

    move-result v0

    int-to-float v2, v2

    add-float/2addr v0, v2

    invoke-virtual {p1, v0, v1}, LV/d;->d(FF)LV/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    invoke-static {p2, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LV/d;->c()F

    move-result v0

    int-to-float v2, v2

    add-float/2addr v0, v2

    neg-float v0, v0

    invoke-virtual {p1, v0, v1}, LV/d;->d(FF)LV/d;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    invoke-static {p2, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LV/d;->b()F

    move-result v0

    int-to-float v2, v2

    add-float/2addr v0, v2

    invoke-virtual {p1, v1, v0}, LV/d;->d(FF)LV/d;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x6

    invoke-static {p2, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, LV/d;->b()F

    move-result v0

    int-to-float v2, v2

    add-float/2addr v0, v2

    neg-float v0, v0

    invoke-virtual {p1, v1, v0}, LV/d;->d(FF)LV/d;

    move-result-object v0

    :goto_0
    iget v1, p0, LF/d;->f:I

    const/4 v2, 0x0

    if-lez v1, :cond_9

    iget-object p0, p0, LF/d;->d:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_3
    aget-object v4, p0, v3

    check-cast v4, LU/q;

    invoke-static {v4}, LU/c;->t(LU/q;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-static {v4}, LU/c;->j(LU/q;)LV/d;

    move-result-object v5

    invoke-static {p2, v5, p1}, LU/c;->r(ILV/d;LV/d;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {p2, v0, p1}, LU/c;->r(ILV/d;LV/d;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {p1, v5, v0, p2}, LU/c;->b(LV/d;LV/d;LV/d;I)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {p1, v0, v5, p2}, LU/c;->b(LV/d;LV/d;LV/d;I)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {p2, p1, v5}, LU/c;->s(ILV/d;LV/d;)J

    move-result-wide v6

    invoke-static {p2, p1, v0}, LU/c;->s(ILV/d;LV/d;)J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-gez v6, :cond_8

    :goto_1
    move-object v2, v4

    move-object v0, v5

    :cond_8
    :goto_2
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_3

    :cond_9
    return-object v2

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This function should only be used for 2-D focus search"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(LU/q;ILo2/c;)Z
    .locals 5

    new-instance v0, LF/d;

    const/16 v1, 0x10

    new-array v1, v1, [LU/q;

    invoke-direct {v0, v1}, LF/d;-><init>([Ljava/lang/Object;)V

    invoke-static {p0, v0}, LU/c;->f(LU/q;LF/d;)V

    iget v1, v0, LF/d;->f:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gt v1, v3, :cond_2

    invoke-virtual {v0}, LF/d;->j()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    iget-object p0, v0, LF/d;->d:[Ljava/lang/Object;

    aget-object p0, p0, v2

    :goto_0
    check-cast p0, LU/q;

    if-eqz p0, :cond_1

    invoke-interface {p2, p0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_1
    return v2

    :cond_2
    const/4 v1, 0x7

    invoke-static {p1, v1}, LU/a;->a(II)Z

    move-result v1

    const/4 v4, 0x4

    if-eqz v1, :cond_3

    move p1, v4

    :cond_3
    invoke-static {p1, v4}, LU/a;->a(II)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v3

    goto :goto_1

    :cond_4
    const/4 v1, 0x6

    invoke-static {p1, v1}, LU/a;->a(II)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_5

    invoke-static {p0}, LU/c;->j(LU/q;)LV/d;

    move-result-object p0

    new-instance v1, LV/d;

    iget v3, p0, LV/d;->b:F

    iget p0, p0, LV/d;->a:F

    invoke-direct {v1, p0, v3, p0, v3}, LV/d;-><init>(FFFF)V

    goto :goto_3

    :cond_5
    const/4 v1, 0x3

    invoke-static {p1, v1}, LU/a;->a(II)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v1, 0x5

    invoke-static {p1, v1}, LU/a;->a(II)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_8

    invoke-static {p0}, LU/c;->j(LU/q;)LV/d;

    move-result-object p0

    new-instance v1, LV/d;

    iget v3, p0, LV/d;->d:F

    iget p0, p0, LV/d;->c:F

    invoke-direct {v1, p0, v3, p0, v3}, LV/d;-><init>(FFFF)V

    :goto_3
    invoke-static {v0, v1, p1}, LU/c;->h(LF/d;LV/d;I)LU/q;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-interface {p2, p0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_7
    return v2

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This function should only be used for 2-D focus search"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final j(LU/q;)LV/d;
    .locals 2

    iget-object p0, p0, LP/k;->k:Ln0/Y;

    if-eqz p0, :cond_0

    invoke-static {p0}, LZ0/d;->v(Ll0/g;)Ll0/g;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Ll0/g;->h(Ll0/g;Z)LV/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, LV/d;->e:LV/d;

    :goto_0
    return-object p0
.end method

.method public static final k(LU/q;LD2/p;)Z
    .locals 3

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LU/q;->f0()LU/j;

    move-result-object v0

    iget-boolean v0, v0, LU/j;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, LD2/p;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LU/c;->z(LU/q;LD2/p;)Z

    move-result v1

    goto :goto_0

    :cond_1
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_2
    invoke-static {p0}, LU/c;->n(LU/q;)LU/q;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0, p1}, LU/c;->k(LU/q;LD2/p;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {p0, v0, v1, p1}, LU/c;->m(LU/q;LU/q;ILD2/p;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "ActiveParent must have a focusedChild"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    invoke-static {p0, p1}, LU/c;->z(LU/q;LD2/p;)Z

    move-result v1

    :cond_6
    :goto_0
    return v1
.end method

.method public static final l(ILD2/p;LU/q;LV/d;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, LU/c;->G(ILD2/p;LU/q;LV/d;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-static {p2}, LU/c;->F(LU/q;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static final m(LU/q;LU/q;ILD2/p;)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual/range {p0 .. p0}, LU/q;->h0()LU/p;

    move-result-object v4

    sget-object v5, LU/p;->e:LU/p;

    if-ne v4, v5, :cond_24

    const/16 v4, 0x10

    new-array v5, v4, [LU/q;

    iget-object v6, v0, LP/k;->d:LP/k;

    iget-boolean v7, v6, LP/k;->p:Z

    if-eqz v7, :cond_23

    new-instance v7, LF/d;

    new-array v8, v4, [LP/k;

    invoke-direct {v7, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v8, v6, LP/k;->i:LP/k;

    const/4 v9, 0x0

    if-nez v8, :cond_0

    invoke-static {v7, v6}, Ln0/C;->b(LF/d;LP/k;)V

    :goto_0
    move v6, v9

    goto :goto_1

    :cond_0
    invoke-virtual {v7, v8}, LF/d;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v7}, LF/d;->k()Z

    move-result v8

    const/4 v10, 0x1

    const/4 v11, 0x2

    if-eqz v8, :cond_c

    iget v8, v7, LF/d;->f:I

    sub-int/2addr v8, v10

    invoke-virtual {v7, v8}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LP/k;

    iget v13, v8, LP/k;->g:I

    and-int/lit16 v13, v13, 0x400

    if-nez v13, :cond_2

    invoke-static {v7, v8}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_1

    :cond_2
    :goto_2
    if-eqz v8, :cond_1

    iget v13, v8, LP/k;->f:I

    and-int/lit16 v13, v13, 0x400

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    :goto_3
    if-eqz v8, :cond_1

    instance-of v14, v8, LU/q;

    if-eqz v14, :cond_4

    check-cast v8, LU/q;

    add-int/lit8 v14, v6, 0x1

    array-length v15, v5

    if-ge v15, v14, :cond_3

    array-length v15, v5

    mul-int/2addr v15, v11

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v15

    invoke-static {v5, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const-string v15, "copyOf(this, newSize)"

    invoke-static {v5, v15}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    aput-object v8, v5, v6

    move v6, v14

    goto :goto_6

    :cond_4
    iget v14, v8, LP/k;->f:I

    and-int/lit16 v14, v14, 0x400

    if-eqz v14, :cond_a

    instance-of v14, v8, Ln0/i;

    if-eqz v14, :cond_a

    move-object v14, v8

    check-cast v14, Ln0/i;

    iget-object v14, v14, Ln0/i;->r:LP/k;

    move v15, v9

    :goto_4
    if-eqz v14, :cond_9

    iget v12, v14, LP/k;->f:I

    and-int/lit16 v12, v12, 0x400

    if-eqz v12, :cond_8

    add-int/lit8 v15, v15, 0x1

    if-ne v15, v10, :cond_5

    move-object v8, v14

    goto :goto_5

    :cond_5
    if-nez v13, :cond_6

    new-instance v13, LF/d;

    new-array v12, v4, [LP/k;

    invoke-direct {v13, v12}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v8, :cond_7

    invoke-virtual {v13, v8}, LF/d;->b(Ljava/lang/Object;)V

    const/4 v8, 0x0

    :cond_7
    invoke-virtual {v13, v14}, LF/d;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_5
    iget-object v14, v14, LP/k;->i:LP/k;

    goto :goto_4

    :cond_9
    if-ne v15, v10, :cond_a

    goto :goto_3

    :cond_a
    :goto_6
    invoke-static {v13}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v8

    goto :goto_3

    :cond_b
    iget-object v8, v8, LP/k;->i:LP/k;

    goto :goto_2

    :cond_c
    sget-object v7, LU/s;->a:LU/s;

    const-string v8, "<this>"

    invoke-static {v5, v8}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v9, v6, v7}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    invoke-static {v2, v10}, LU/a;->a(II)Z

    move-result v7

    if-eqz v7, :cond_f

    new-instance v7, Lu2/d;

    sub-int/2addr v6, v10

    invoke-direct {v7, v9, v6, v10}, Lu2/b;-><init>(III)V

    iget v6, v7, Lu2/b;->e:I

    if-ltz v6, :cond_12

    move v7, v9

    move v8, v7

    :goto_7
    if-eqz v7, :cond_d

    aget-object v11, v5, v8

    check-cast v11, LU/q;

    invoke-static {v11}, LU/c;->t(LU/q;)Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-static {v11, v3}, LU/c;->k(LU/q;LD2/p;)Z

    move-result v11

    if-eqz v11, :cond_d

    :goto_8
    move v9, v10

    goto/16 :goto_10

    :cond_d
    aget-object v11, v5, v8

    invoke-static {v11, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    move v7, v10

    :cond_e
    if-eq v8, v6, :cond_12

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_f
    invoke-static {v2, v11}, LU/a;->a(II)Z

    move-result v7

    if-eqz v7, :cond_22

    new-instance v7, Lu2/d;

    sub-int/2addr v6, v10

    invoke-direct {v7, v9, v6, v10}, Lu2/b;-><init>(III)V

    iget v6, v7, Lu2/b;->e:I

    if-ltz v6, :cond_12

    move v7, v9

    :goto_9
    if-eqz v7, :cond_10

    aget-object v8, v5, v6

    check-cast v8, LU/q;

    invoke-static {v8}, LU/c;->t(LU/q;)Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-static {v8, v3}, LU/c;->a(LU/q;LD2/p;)Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_8

    :cond_10
    aget-object v8, v5, v6

    invoke-static {v8, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    move v7, v10

    :cond_11
    if-eqz v6, :cond_12

    add-int/lit8 v6, v6, -0x1

    goto :goto_9

    :cond_12
    invoke-static {v2, v10}, LU/a;->a(II)Z

    move-result v1

    if-nez v1, :cond_20

    invoke-virtual/range {p0 .. p0}, LU/q;->f0()LU/j;

    move-result-object v1

    iget-boolean v1, v1, LU/j;->a:Z

    if-eqz v1, :cond_20

    iget-object v1, v0, LP/k;->d:LP/k;

    iget-boolean v2, v1, LP/k;->p:Z

    if-eqz v2, :cond_1f

    iget-object v1, v1, LP/k;->h:LP/k;

    invoke-static/range {p0 .. p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v2

    :goto_a
    if-eqz v2, :cond_1d

    iget-object v5, v2, Ln0/z;->x:LD/s;

    iget-object v5, v5, LD/s;->f:Ljava/lang/Object;

    check-cast v5, LP/k;

    iget v5, v5, LP/k;->g:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_1b

    :goto_b
    if-eqz v1, :cond_1b

    iget v5, v1, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_1a

    move-object v5, v1

    const/4 v6, 0x0

    :goto_c
    if-eqz v5, :cond_1a

    instance-of v7, v5, LU/q;

    if-eqz v7, :cond_13

    move-object v12, v5

    goto :goto_f

    :cond_13
    iget v7, v5, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_19

    instance-of v7, v5, Ln0/i;

    if-eqz v7, :cond_19

    move-object v7, v5

    check-cast v7, Ln0/i;

    iget-object v7, v7, Ln0/i;->r:LP/k;

    move v8, v9

    :goto_d
    if-eqz v7, :cond_18

    iget v11, v7, LP/k;->f:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_17

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v10, :cond_14

    move-object v5, v7

    goto :goto_e

    :cond_14
    if-nez v6, :cond_15

    new-instance v6, LF/d;

    new-array v11, v4, [LP/k;

    invoke-direct {v6, v11}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_15
    if-eqz v5, :cond_16

    invoke-virtual {v6, v5}, LF/d;->b(Ljava/lang/Object;)V

    const/4 v5, 0x0

    :cond_16
    invoke-virtual {v6, v7}, LF/d;->b(Ljava/lang/Object;)V

    :cond_17
    :goto_e
    iget-object v7, v7, LP/k;->i:LP/k;

    goto :goto_d

    :cond_18
    if-ne v8, v10, :cond_19

    goto :goto_c

    :cond_19
    invoke-static {v6}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v5

    goto :goto_c

    :cond_1a
    iget-object v1, v1, LP/k;->h:LP/k;

    goto :goto_b

    :cond_1b
    invoke-virtual {v2}, Ln0/z;->k()Ln0/z;

    move-result-object v2

    if-eqz v2, :cond_1c

    iget-object v1, v2, Ln0/z;->x:LD/s;

    if-eqz v1, :cond_1c

    iget-object v1, v1, LD/s;->e:Ljava/lang/Object;

    check-cast v1, Ln0/m0;

    goto :goto_a

    :cond_1c
    const/4 v1, 0x0

    goto :goto_a

    :cond_1d
    const/4 v12, 0x0

    :goto_f
    if-nez v12, :cond_1e

    goto :goto_10

    :cond_1e
    invoke-virtual {v3, v0}, LD2/p;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    goto :goto_10

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitAncestors called on an unattached node"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    :goto_10
    if-eqz v9, :cond_21

    const/4 v0, 0x1

    return v0

    :cond_21
    invoke-static/range {p0 .. p0}, LU/c;->F(LU/q;)V

    const/4 v0, 0x0

    return v0

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This function should only be used for 1-D focus search"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitChildren called on an unattached node"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This function should only be used within a parent that has focus."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final n(LU/q;)LU/q;
    .locals 8

    iget-object p0, p0, LP/k;->d:LP/k;

    iget-boolean v0, p0, LP/k;->p:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-eqz v0, :cond_e

    new-instance v0, LF/d;

    const/16 v2, 0x10

    new-array v3, v2, [LP/k;

    invoke-direct {v0, v3}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v3, p0, LP/k;->i:LP/k;

    if-nez v3, :cond_1

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v3}, LF/d;->b(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-virtual {v0}, LF/d;->k()Z

    move-result p0

    if-eqz p0, :cond_d

    iget p0, v0, LF/d;->f:I

    const/4 v3, 0x1

    sub-int/2addr p0, v3

    invoke-virtual {v0, p0}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP/k;

    iget v4, p0, LP/k;->g:I

    and-int/lit16 v4, v4, 0x400

    if-nez v4, :cond_3

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz p0, :cond_2

    iget v4, p0, LP/k;->f:I

    and-int/lit16 v4, v4, 0x400

    if-eqz v4, :cond_c

    move-object v4, v1

    :goto_2
    if-eqz p0, :cond_2

    instance-of v5, p0, LU/q;

    if-eqz v5, :cond_5

    check-cast p0, LU/q;

    iget-object v5, p0, LP/k;->d:LP/k;

    iget-boolean v5, v5, LP/k;->p:Z

    if-eqz v5, :cond_b

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_4

    if-eq v5, v3, :cond_4

    const/4 v6, 0x2

    if-eq v5, v6, :cond_4

    goto :goto_5

    :cond_4
    return-object p0

    :cond_5
    iget v5, p0, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_b

    instance-of v5, p0, Ln0/i;

    if-eqz v5, :cond_b

    move-object v5, p0

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    const/4 v6, 0x0

    :goto_3
    if-eqz v5, :cond_a

    iget v7, v5, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_9

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v3, :cond_6

    move-object p0, v5

    goto :goto_4

    :cond_6
    if-nez v4, :cond_7

    new-instance v4, LF/d;

    new-array v7, v2, [LP/k;

    invoke-direct {v4, v7}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz p0, :cond_8

    invoke-virtual {v4, p0}, LF/d;->b(Ljava/lang/Object;)V

    move-object p0, v1

    :cond_8
    invoke-virtual {v4, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_4
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_3

    :cond_a
    if-ne v6, v3, :cond_b

    goto :goto_2

    :cond_b
    :goto_5
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object p0

    goto :goto_2

    :cond_c
    iget-object p0, p0, LP/k;->i:LP/k;

    goto :goto_1

    :cond_d
    return-object v1

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitChildren called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final o(LU/b;)LU/p;
    .locals 10

    check-cast p0, LP/k;

    iget-object v0, p0, LP/k;->d:LP/k;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    const/4 v3, 0x1

    const/4 v4, 0x2

    const/16 v5, 0x10

    const/4 v6, 0x0

    if-eqz v0, :cond_8

    instance-of v7, v0, LU/q;

    if-eqz v7, :cond_1

    check-cast v0, LU/q;

    invoke-virtual {v0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_0

    if-eq v5, v3, :cond_0

    if-eq v5, v4, :cond_0

    goto :goto_3

    :cond_0
    return-object v0

    :cond_1
    iget v4, v0, LP/k;->f:I

    and-int/lit16 v4, v4, 0x400

    if-eqz v4, :cond_7

    instance-of v4, v0, Ln0/i;

    if-eqz v4, :cond_7

    move-object v4, v0

    check-cast v4, Ln0/i;

    iget-object v4, v4, Ln0/i;->r:LP/k;

    :goto_1
    if-eqz v4, :cond_6

    iget v7, v4, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_5

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v3, :cond_2

    move-object v0, v4

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, LF/d;

    new-array v7, v5, [LP/k;

    invoke-direct {v2, v7}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v2, v0}, LF/d;->b(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_4
    invoke-virtual {v2, v4}, LF/d;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    iget-object v4, v4, LP/k;->i:LP/k;

    goto :goto_1

    :cond_6
    if-ne v6, v3, :cond_7

    goto :goto_0

    :cond_7
    :goto_3
    invoke-static {v2}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v0

    goto :goto_0

    :cond_8
    iget-object p0, p0, LP/k;->d:LP/k;

    iget-boolean v0, p0, LP/k;->p:Z

    if-eqz v0, :cond_16

    new-instance v0, LF/d;

    new-array v2, v5, [LP/k;

    invoke-direct {v0, v2}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v2, p0, LP/k;->i:LP/k;

    if-nez v2, :cond_9

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v0, v2}, LF/d;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_4
    invoke-virtual {v0}, LF/d;->k()Z

    move-result p0

    if-eqz p0, :cond_15

    iget p0, v0, LF/d;->f:I

    sub-int/2addr p0, v3

    invoke-virtual {v0, p0}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LP/k;

    iget v2, p0, LP/k;->g:I

    and-int/lit16 v2, v2, 0x400

    if-nez v2, :cond_b

    invoke-static {v0, p0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_4

    :cond_b
    :goto_5
    if-eqz p0, :cond_a

    iget v2, p0, LP/k;->f:I

    and-int/lit16 v2, v2, 0x400

    if-eqz v2, :cond_14

    move-object v2, v1

    :goto_6
    if-eqz p0, :cond_a

    instance-of v7, p0, LU/q;

    if-eqz v7, :cond_d

    check-cast p0, LU/q;

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eqz v7, :cond_c

    if-eq v7, v3, :cond_c

    if-eq v7, v4, :cond_c

    goto :goto_9

    :cond_c
    return-object p0

    :cond_d
    iget v7, p0, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_13

    instance-of v7, p0, Ln0/i;

    if-eqz v7, :cond_13

    move-object v7, p0

    check-cast v7, Ln0/i;

    iget-object v7, v7, Ln0/i;->r:LP/k;

    move v8, v6

    :goto_7
    if-eqz v7, :cond_12

    iget v9, v7, LP/k;->f:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_11

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v3, :cond_e

    move-object p0, v7

    goto :goto_8

    :cond_e
    if-nez v2, :cond_f

    new-instance v2, LF/d;

    new-array v9, v5, [LP/k;

    invoke-direct {v2, v9}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_f
    if-eqz p0, :cond_10

    invoke-virtual {v2, p0}, LF/d;->b(Ljava/lang/Object;)V

    move-object p0, v1

    :cond_10
    invoke-virtual {v2, v7}, LF/d;->b(Ljava/lang/Object;)V

    :cond_11
    :goto_8
    iget-object v7, v7, LP/k;->i:LP/k;

    goto :goto_7

    :cond_12
    if-ne v8, v3, :cond_13

    goto :goto_6

    :cond_13
    :goto_9
    invoke-static {v2}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object p0

    goto :goto_6

    :cond_14
    iget-object p0, p0, LP/k;->i:LP/k;

    goto :goto_5

    :cond_15
    sget-object p0, LU/p;->f:LU/p;

    return-object p0

    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitChildren called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final p(LU/q;)V
    .locals 2

    new-instance v0, LU/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LU/r;-><init>(LU/q;I)V

    invoke-static {p0, v0}, Ln0/C;->o(LP/k;Lo2/a;)V

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LU/p;->d:LU/p;

    invoke-virtual {p0, v0}, LU/q;->l0(LU/p;)V

    :goto_0
    return-void
.end method

.method public static final q(LU/q;)V
    .locals 2

    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object v0

    check-cast v0, Lo0/u;

    invoke-virtual {v0}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/a;

    iget-object v0, v0, Landroidx/compose/ui/focus/a;->e:LU/e;

    iget-object v1, v0, LU/e;->c:Ln/B;

    invoke-virtual {v0, v1, p0}, LU/e;->b(Ln/B;Ljava/lang/Object;)V

    return-void
.end method

.method public static final r(ILV/d;LV/d;)Z
    .locals 5

    const/4 v0, 0x3

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    iget v1, p1, LV/d;->a:F

    iget v2, p1, LV/d;->c:F

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    iget p0, p2, LV/d;->c:F

    cmpl-float p0, p0, v2

    iget p1, p2, LV/d;->a:F

    if-gtz p0, :cond_0

    cmpl-float p0, p1, v2

    if-ltz p0, :cond_7

    :cond_0
    cmpl-float p0, p1, v1

    if-lez p0, :cond_7

    :goto_0
    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v0, 0x4

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget p0, p2, LV/d;->a:F

    cmpg-float p0, p0, v1

    iget p1, p2, LV/d;->c:F

    if-ltz p0, :cond_2

    cmpg-float p0, p1, v1

    if-gtz p0, :cond_7

    :cond_2
    cmpg-float p0, p1, v2

    if-gez p0, :cond_7

    goto :goto_0

    :cond_3
    const/4 v0, 0x5

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    iget v1, p1, LV/d;->b:F

    iget p1, p1, LV/d;->d:F

    if-eqz v0, :cond_5

    iget p0, p2, LV/d;->d:F

    cmpl-float p0, p0, p1

    iget p2, p2, LV/d;->b:F

    if-gtz p0, :cond_4

    cmpl-float p0, p2, p1

    if-ltz p0, :cond_7

    :cond_4
    cmpl-float p0, p2, v1

    if-lez p0, :cond_7

    goto :goto_0

    :cond_5
    const/4 v0, 0x6

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result p0

    if-eqz p0, :cond_8

    iget p0, p2, LV/d;->b:F

    cmpg-float p0, p0, v1

    iget p2, p2, LV/d;->d:F

    if-ltz p0, :cond_6

    cmpg-float p0, p2, v1

    if-gtz p0, :cond_7

    :cond_6
    cmpg-float p0, p2, p1

    if-gez p0, :cond_7

    goto :goto_0

    :cond_7
    :goto_1
    return v3

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This function should only be used for 2-D focus search"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final s(ILV/d;LV/d;)J
    .locals 10

    const/4 v0, 0x3

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v1

    iget v2, p2, LV/d;->b:F

    iget v3, p2, LV/d;->a:F

    const-string v4, "This function should only be used for 2-D focus search"

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x4

    if-eqz v1, :cond_0

    iget v1, p1, LV/d;->a:F

    iget v8, p2, LV/d;->c:F

    :goto_0
    sub-float/2addr v1, v8

    goto :goto_1

    :cond_0
    invoke-static {p0, v7}, LU/a;->a(II)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p1, LV/d;->c:F

    sub-float v1, v3, v1

    goto :goto_1

    :cond_1
    invoke-static {p0, v6}, LU/a;->a(II)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p1, LV/d;->b:F

    iget v8, p2, LV/d;->d:F

    goto :goto_0

    :cond_2
    invoke-static {p0, v5}, LU/a;->a(II)Z

    move-result v1

    if-eqz v1, :cond_7

    iget v1, p1, LV/d;->d:F

    sub-float v1, v2, v1

    :goto_1
    const/4 v8, 0x0

    invoke-static {v8, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    float-to-long v8, v1

    invoke-static {p0, v0}, LU/a;->a(II)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    move v0, v1

    goto :goto_2

    :cond_3
    invoke-static {p0, v7}, LU/a;->a(II)Z

    move-result v0

    :goto_2
    const/4 v7, 0x2

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LV/d;->b()F

    move-result p0

    int-to-float v0, v7

    div-float/2addr p0, v0

    iget p1, p1, LV/d;->b:F

    add-float/2addr p0, p1

    invoke-virtual {p2}, LV/d;->b()F

    move-result p1

    div-float/2addr p1, v0

    add-float/2addr p1, v2

    :goto_3
    sub-float/2addr p0, p1

    goto :goto_5

    :cond_4
    invoke-static {p0, v6}, LU/a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {p0, v5}, LU/a;->a(II)Z

    move-result v1

    :goto_4
    if-eqz v1, :cond_6

    invoke-virtual {p1}, LV/d;->c()F

    move-result p0

    int-to-float v0, v7

    div-float/2addr p0, v0

    iget p1, p1, LV/d;->a:F

    add-float/2addr p0, p1

    invoke-virtual {p2}, LV/d;->c()F

    move-result p1

    div-float/2addr p1, v0

    add-float/2addr p1, v3

    goto :goto_3

    :goto_5
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    float-to-long p0, p0

    const/16 p2, 0xd

    int-to-long v0, p2

    mul-long/2addr v0, v8

    mul-long/2addr v0, v8

    mul-long/2addr p0, p0

    add-long/2addr p0, v0

    return-wide p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final t(LU/q;)Z
    .locals 2

    iget-object v0, p0, LP/k;->k:Ln0/Y;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln0/Y;->n:Ln0/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/z;->v()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p0, p0, LP/k;->k:Ln0/Y;

    if-eqz p0, :cond_0

    iget-object p0, p0, Ln0/Y;->n:Ln0/z;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ln0/z;->u()Z

    move-result p0

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static final u(LU/q;I)I
    .locals 2

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v1, :cond_2

    const/4 p0, 0x2

    if-eq v0, p0, :cond_1

    const/4 p0, 0x3

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1
    move v1, p0

    goto :goto_0

    :cond_2
    invoke-static {p0}, LU/c;->n(LU/q;)LU/q;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0, p1}, LU/c;->u(LU/q;I)I

    move-result p1

    const/4 v0, 0x0

    if-ne p1, v1, :cond_3

    move p1, v0

    :cond_3
    if-nez p1, :cond_4

    iget-boolean p1, p0, LU/q;->q:Z

    if-nez p1, :cond_6

    iput-boolean v1, p0, LU/q;->q:Z

    :try_start_0
    invoke-virtual {p0}, LU/q;->f0()LU/j;

    move-result-object p1

    iget-object p1, p1, LU/j;->k:LU/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, LU/n;->b:LU/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, LU/q;->q:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, LU/q;->q:Z

    throw p1

    :cond_4
    move v1, p1

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "ActiveParent with no focused child"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_0
    return v1
.end method

.method public static final v(LU/q;)V
    .locals 2

    iget-boolean v0, p0, LU/q;->r:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LU/q;->r:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, LU/q;->f0()LU/j;

    move-result-object v1

    iget-object v1, v1, LU/j;->j:LU/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LU/n;->b:LU/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, LU/q;->r:Z

    goto :goto_0

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, LU/q;->r:Z

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method public static final w(LU/q;I)I
    .locals 11

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_16

    if-eq v0, v1, :cond_14

    const/4 v2, 0x2

    if-eq v0, v2, :cond_16

    const/4 v3, 0x3

    if-ne v0, v3, :cond_13

    iget-object v0, p0, LP/k;->d:LP/k;

    iget-boolean v4, v0, LP/k;->p:Z

    if-eqz v4, :cond_12

    iget-object v0, v0, LP/k;->h:LP/k;

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object p0

    :goto_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz p0, :cond_a

    iget-object v6, p0, Ln0/z;->x:LD/s;

    iget-object v6, v6, LD/s;->f:Ljava/lang/Object;

    check-cast v6, LP/k;

    iget v6, v6, LP/k;->g:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_8

    :goto_1
    if-eqz v0, :cond_8

    iget v6, v0, LP/k;->f:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_7

    move-object v6, v0

    move-object v7, v5

    :goto_2
    if-eqz v6, :cond_7

    instance-of v8, v6, LU/q;

    if-eqz v8, :cond_0

    move-object v5, v6

    goto :goto_5

    :cond_0
    iget v8, v6, LP/k;->f:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_6

    instance-of v8, v6, Ln0/i;

    if-eqz v8, :cond_6

    move-object v8, v6

    check-cast v8, Ln0/i;

    iget-object v8, v8, Ln0/i;->r:LP/k;

    move v9, v4

    :goto_3
    if-eqz v8, :cond_5

    iget v10, v8, LP/k;->f:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_4

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v1, :cond_1

    move-object v6, v8

    goto :goto_4

    :cond_1
    if-nez v7, :cond_2

    new-instance v7, LF/d;

    const/16 v10, 0x10

    new-array v10, v10, [LP/k;

    invoke-direct {v7, v10}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v6, :cond_3

    invoke-virtual {v7, v6}, LF/d;->b(Ljava/lang/Object;)V

    move-object v6, v5

    :cond_3
    invoke-virtual {v7, v8}, LF/d;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    iget-object v8, v8, LP/k;->i:LP/k;

    goto :goto_3

    :cond_5
    if-ne v9, v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v7}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v6

    goto :goto_2

    :cond_7
    iget-object v0, v0, LP/k;->h:LP/k;

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, Ln0/z;->k()Ln0/z;

    move-result-object p0

    if-eqz p0, :cond_9

    iget-object v0, p0, Ln0/z;->x:LD/s;

    if-eqz v0, :cond_9

    iget-object v0, v0, LD/s;->e:Ljava/lang/Object;

    check-cast v0, Ln0/m0;

    goto :goto_0

    :cond_9
    move-object v0, v5

    goto :goto_0

    :cond_a
    :goto_5
    check-cast v5, LU/q;

    if-nez v5, :cond_b

    return v1

    :cond_b
    invoke-virtual {v5}, LU/q;->h0()LU/p;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_11

    if-eq p0, v1, :cond_10

    if-eq p0, v2, :cond_f

    if-ne p0, v3, :cond_e

    invoke-static {v5, p1}, LU/c;->w(LU/q;I)I

    move-result p0

    if-ne p0, v1, :cond_c

    goto :goto_6

    :cond_c
    move v4, p0

    :goto_6
    if-nez v4, :cond_d

    invoke-static {v5}, LU/c;->v(LU/q;)V

    goto :goto_7

    :cond_d
    move v1, v4

    goto :goto_7

    :cond_e
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_f
    move v1, v2

    goto :goto_7

    :cond_10
    invoke-static {v5, p1}, LU/c;->w(LU/q;I)I

    move-result v1

    goto :goto_7

    :cond_11
    invoke-static {v5}, LU/c;->v(LU/q;)V

    :goto_7
    return v1

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitAncestors called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_14
    invoke-static {p0}, LU/c;->n(LU/q;)LU/q;

    move-result-object p0

    if-eqz p0, :cond_15

    invoke-static {p0, p1}, LU/c;->u(LU/q;I)I

    move-result p0

    return p0

    :cond_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "ActiveParent with no focused child"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_16
    return v1
.end method

.method public static final x(LU/q;)Z
    .locals 10

    invoke-virtual {p0}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_11

    const/4 v2, 0x0

    if-eq v0, v1, :cond_f

    const/4 v3, 0x2

    if-eq v0, v3, :cond_11

    const/4 v3, 0x3

    if-ne v0, v3, :cond_e

    iget-object v0, p0, LP/k;->d:LP/k;

    iget-boolean v3, v0, LP/k;->p:Z

    if-eqz v3, :cond_d

    iget-object v0, v0, LP/k;->h:LP/k;

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_a

    iget-object v5, v3, Ln0/z;->x:LD/s;

    iget-object v5, v5, LD/s;->f:Ljava/lang/Object;

    check-cast v5, LP/k;

    iget v5, v5, LP/k;->g:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_8

    :goto_1
    if-eqz v0, :cond_8

    iget v5, v0, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_7

    move-object v5, v0

    move-object v6, v4

    :goto_2
    if-eqz v5, :cond_7

    instance-of v7, v5, LU/q;

    if-eqz v7, :cond_0

    goto :goto_5

    :cond_0
    iget v7, v5, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_6

    instance-of v7, v5, Ln0/i;

    if-eqz v7, :cond_6

    move-object v7, v5

    check-cast v7, Ln0/i;

    iget-object v7, v7, Ln0/i;->r:LP/k;

    move v8, v2

    :goto_3
    if-eqz v7, :cond_5

    iget v9, v7, LP/k;->f:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_4

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v1, :cond_1

    move-object v5, v7

    goto :goto_4

    :cond_1
    if-nez v6, :cond_2

    new-instance v6, LF/d;

    const/16 v9, 0x10

    new-array v9, v9, [LP/k;

    invoke-direct {v6, v9}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v6, v5}, LF/d;->b(Ljava/lang/Object;)V

    move-object v5, v4

    :cond_3
    invoke-virtual {v6, v7}, LF/d;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    iget-object v7, v7, LP/k;->i:LP/k;

    goto :goto_3

    :cond_5
    if-ne v8, v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v6}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v5

    goto :goto_2

    :cond_7
    iget-object v0, v0, LP/k;->h:LP/k;

    goto :goto_1

    :cond_8
    invoke-virtual {v3}, Ln0/z;->k()Ln0/z;

    move-result-object v3

    if-eqz v3, :cond_9

    iget-object v0, v3, Ln0/z;->x:LD/s;

    if-eqz v0, :cond_9

    iget-object v0, v0, LD/s;->e:Ljava/lang/Object;

    check-cast v0, Ln0/m0;

    goto :goto_0

    :cond_9
    move-object v0, v4

    goto :goto_0

    :cond_a
    move-object v5, v4

    :goto_5
    check-cast v5, LU/q;

    if-eqz v5, :cond_b

    invoke-virtual {v5}, LU/q;->h0()LU/p;

    move-result-object v0

    invoke-static {v5, p0}, LU/c;->D(LU/q;LU/q;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v5}, LU/q;->h0()LU/p;

    move-result-object v2

    if-eq v0, v2, :cond_11

    invoke-static {v5}, LU/c;->A(LU/q;)V

    goto :goto_7

    :cond_b
    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object v0

    check-cast v0, Lo0/u;

    invoke-virtual {v0}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/a;

    iget-object v0, v0, Landroidx/compose/ui/focus/a;->a:Lo0/o;

    invoke-virtual {v0, v4, v4}, Lo0/o;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {p0}, LU/c;->p(LU/q;)V

    goto :goto_7

    :cond_c
    move v1, v2

    goto :goto_7

    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    new-instance p0, LB1/c;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_f
    invoke-static {p0}, LU/c;->n(LU/q;)LU/q;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-static {v0, v2, v1}, LU/c;->e(LU/q;ZZ)Z

    move-result v0

    goto :goto_6

    :cond_10
    move v0, v1

    :goto_6
    if-eqz v0, :cond_c

    invoke-static {p0}, LU/c;->p(LU/q;)V

    :cond_11
    :goto_7
    if-eqz v1, :cond_12

    invoke-static {p0}, LU/c;->A(LU/q;)V

    :cond_12
    return v1
.end method

.method public static final y(LU/q;LD2/p;)Z
    .locals 11

    const/16 v0, 0x10

    new-array v1, v0, [LU/q;

    iget-object p0, p0, LP/k;->d:LP/k;

    iget-boolean v2, p0, LP/k;->p:Z

    if-eqz v2, :cond_10

    new-instance v2, LF/d;

    new-array v3, v0, [LP/k;

    invoke-direct {v2, v3}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v3, p0, LP/k;->i:LP/k;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-static {v2, p0}, Ln0/C;->b(LF/d;LP/k;)V

    :goto_0
    move p0, v4

    goto :goto_1

    :cond_0
    invoke-virtual {v2, v3}, LF/d;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v2}, LF/d;->k()Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_c

    iget v3, v2, LF/d;->f:I

    sub-int/2addr v3, v5

    invoke-virtual {v2, v3}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP/k;

    iget v6, v3, LP/k;->g:I

    and-int/lit16 v6, v6, 0x400

    if-nez v6, :cond_2

    invoke-static {v2, v3}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_1

    :cond_2
    :goto_2
    if-eqz v3, :cond_1

    iget v6, v3, LP/k;->f:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_b

    const/4 v6, 0x0

    move-object v7, v6

    :goto_3
    if-eqz v3, :cond_1

    instance-of v8, v3, LU/q;

    if-eqz v8, :cond_4

    check-cast v3, LU/q;

    add-int/lit8 v8, p0, 0x1

    array-length v9, v1

    if-ge v9, v8, :cond_3

    array-length v9, v1

    mul-int/lit8 v9, v9, 0x2

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v9, "copyOf(this, newSize)"

    invoke-static {v1, v9}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    aput-object v3, v1, p0

    move p0, v8

    goto :goto_6

    :cond_4
    iget v8, v3, LP/k;->f:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_a

    instance-of v8, v3, Ln0/i;

    if-eqz v8, :cond_a

    move-object v8, v3

    check-cast v8, Ln0/i;

    iget-object v8, v8, Ln0/i;->r:LP/k;

    move v9, v4

    :goto_4
    if-eqz v8, :cond_9

    iget v10, v8, LP/k;->f:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_8

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v5, :cond_5

    move-object v3, v8

    goto :goto_5

    :cond_5
    if-nez v7, :cond_6

    new-instance v7, LF/d;

    new-array v10, v0, [LP/k;

    invoke-direct {v7, v10}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {v7, v3}, LF/d;->b(Ljava/lang/Object;)V

    move-object v3, v6

    :cond_7
    invoke-virtual {v7, v8}, LF/d;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_5
    iget-object v8, v8, LP/k;->i:LP/k;

    goto :goto_4

    :cond_9
    if-ne v9, v5, :cond_a

    goto :goto_3

    :cond_a
    :goto_6
    invoke-static {v7}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v3

    goto :goto_3

    :cond_b
    iget-object v3, v3, LP/k;->i:LP/k;

    goto :goto_2

    :cond_c
    sget-object v0, LU/s;->a:LU/s;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4, p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    if-lez p0, :cond_f

    sub-int/2addr p0, v5

    :cond_d
    aget-object v0, v1, p0

    check-cast v0, LU/q;

    invoke-static {v0}, LU/c;->t(LU/q;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-static {v0, p1}, LU/c;->a(LU/q;LD2/p;)Z

    move-result v0

    if-eqz v0, :cond_e

    return v5

    :cond_e
    add-int/lit8 p0, p0, -0x1

    if-gez p0, :cond_d

    :cond_f
    return v4

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitChildren called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final z(LU/q;LD2/p;)Z
    .locals 11

    const/16 v0, 0x10

    new-array v1, v0, [LU/q;

    iget-object p0, p0, LP/k;->d:LP/k;

    iget-boolean v2, p0, LP/k;->p:Z

    if-eqz v2, :cond_10

    new-instance v2, LF/d;

    new-array v3, v0, [LP/k;

    invoke-direct {v2, v3}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v3, p0, LP/k;->i:LP/k;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-static {v2, p0}, Ln0/C;->b(LF/d;LP/k;)V

    :goto_0
    move p0, v4

    goto :goto_1

    :cond_0
    invoke-virtual {v2, v3}, LF/d;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v2}, LF/d;->k()Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_c

    iget v3, v2, LF/d;->f:I

    sub-int/2addr v3, v5

    invoke-virtual {v2, v3}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP/k;

    iget v6, v3, LP/k;->g:I

    and-int/lit16 v6, v6, 0x400

    if-nez v6, :cond_2

    invoke-static {v2, v3}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_1

    :cond_2
    :goto_2
    if-eqz v3, :cond_1

    iget v6, v3, LP/k;->f:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_b

    const/4 v6, 0x0

    move-object v7, v6

    :goto_3
    if-eqz v3, :cond_1

    instance-of v8, v3, LU/q;

    if-eqz v8, :cond_4

    check-cast v3, LU/q;

    add-int/lit8 v8, p0, 0x1

    array-length v9, v1

    if-ge v9, v8, :cond_3

    array-length v9, v1

    mul-int/lit8 v9, v9, 0x2

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v9, "copyOf(this, newSize)"

    invoke-static {v1, v9}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    aput-object v3, v1, p0

    move p0, v8

    goto :goto_6

    :cond_4
    iget v8, v3, LP/k;->f:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_a

    instance-of v8, v3, Ln0/i;

    if-eqz v8, :cond_a

    move-object v8, v3

    check-cast v8, Ln0/i;

    iget-object v8, v8, Ln0/i;->r:LP/k;

    move v9, v4

    :goto_4
    if-eqz v8, :cond_9

    iget v10, v8, LP/k;->f:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_8

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v5, :cond_5

    move-object v3, v8

    goto :goto_5

    :cond_5
    if-nez v7, :cond_6

    new-instance v7, LF/d;

    new-array v10, v0, [LP/k;

    invoke-direct {v7, v10}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {v7, v3}, LF/d;->b(Ljava/lang/Object;)V

    move-object v3, v6

    :cond_7
    invoke-virtual {v7, v8}, LF/d;->b(Ljava/lang/Object;)V

    :cond_8
    :goto_5
    iget-object v8, v8, LP/k;->i:LP/k;

    goto :goto_4

    :cond_9
    if-ne v9, v5, :cond_a

    goto :goto_3

    :cond_a
    :goto_6
    invoke-static {v7}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v3

    goto :goto_3

    :cond_b
    iget-object v3, v3, LP/k;->i:LP/k;

    goto :goto_2

    :cond_c
    sget-object v0, LU/s;->a:LU/s;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4, p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    if-lez p0, :cond_f

    move v0, v4

    :cond_d
    aget-object v2, v1, v0

    check-cast v2, LU/q;

    invoke-static {v2}, LU/c;->t(LU/q;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {v2, p1}, LU/c;->k(LU/q;LD2/p;)Z

    move-result v2

    if-eqz v2, :cond_e

    move v4, v5

    goto :goto_7

    :cond_e
    add-int/lit8 v0, v0, 0x1

    if-lt v0, p0, :cond_d

    :cond_f
    :goto_7
    return v4

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitChildren called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
