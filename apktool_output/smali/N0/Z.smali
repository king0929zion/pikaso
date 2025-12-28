.class public abstract Ln0/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ln/C;->a:Ln/w;

    new-instance v0, Ln/w;

    invoke-direct {v0}, Ln/w;-><init>()V

    sput-object v0, Ln0/Z;->a:Ln/w;

    return-void
.end method

.method public static final a(LP/k;)V
    .locals 2

    iget-boolean v0, p0, LP/k;->p:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Ln0/Z;->b(LP/k;II)V

    return-void

    :cond_0
    const-string p0, "autoInvalidateInsertedNode called on unattached node"

    invoke-static {p0}, LZ0/d;->S(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final b(LP/k;II)V
    .locals 2

    instance-of v0, p0, Ln0/i;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ln0/i;

    iget v1, v0, Ln0/i;->q:I

    and-int/2addr v1, p1

    invoke-static {p0, v1, p2}, Ln0/Z;->c(LP/k;II)V

    iget p0, v0, Ln0/i;->q:I

    not-int p0, p0

    and-int/2addr p0, p1

    iget-object p1, v0, Ln0/i;->r:LP/k;

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1, p0, p2}, Ln0/Z;->b(LP/k;II)V

    iget-object p1, p1, LP/k;->i:LP/k;

    goto :goto_0

    :cond_0
    iget v0, p0, LP/k;->f:I

    and-int/2addr p1, v0

    invoke-static {p0, p1, p2}, Ln0/Z;->c(LP/k;II)V

    :cond_1
    return-void
.end method

.method public static final c(LP/k;II)V
    .locals 9

    if-nez p2, :cond_0

    invoke-virtual {p0}, LP/k;->V()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    and-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    instance-of v0, p0, Ln0/s;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ln0/s;

    invoke-static {v0}, Ln0/C;->l(Ln0/s;)V

    if-ne p2, v2, :cond_1

    invoke-static {p0, v2}, Ln0/C;->p(Ln0/h;I)Ln0/Y;

    move-result-object v0

    iput-boolean v4, v0, Ln0/Y;->q:Z

    iget-object v5, v0, Ln0/Y;->D:LA0/c;

    invoke-virtual {v5}, LA0/c;->c()Ljava/lang/Object;

    iget-object v5, v0, Ln0/Y;->F:Ln0/d0;

    if-eqz v5, :cond_1

    invoke-virtual {v0, v3, v1}, Ln0/Y;->J0(Lo2/c;Z)V

    iget-object v0, v0, Ln0/Y;->n:Ln0/z;

    invoke-virtual {v0, v1}, Ln0/z;->E(Z)V

    :cond_1
    and-int/lit16 v0, p1, 0x80

    if-eqz v0, :cond_2

    instance-of v0, p0, Ln0/r;

    if-eqz v0, :cond_2

    if-eq p2, v2, :cond_2

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v0

    invoke-virtual {v0}, Ln0/z;->r()V

    :cond_2
    and-int/lit16 v0, p1, 0x100

    if-eqz v0, :cond_4

    instance-of v0, p0, Ln0/l;

    if-eqz v0, :cond_4

    if-eq p2, v2, :cond_4

    invoke-static {p0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v0

    iget-object v5, v0, Ln0/z;->y:Ln0/I;

    iget-boolean v6, v5, Ln0/I;->d:Z

    if-nez v6, :cond_4

    iget-boolean v5, v5, Ln0/I;->c:Z

    if-nez v5, :cond_4

    iget-boolean v5, v0, Ln0/z;->D:Z

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v0}, Ln0/C;->s(Ln0/z;)Ln0/e0;

    move-result-object v5

    check-cast v5, Lo0/u;

    iget-object v6, v5, Lo0/u;->J:Ln0/O;

    iget-object v6, v6, Ln0/O;->e:LB2/i;

    iget-object v6, v6, LB2/i;->e:Ljava/lang/Object;

    check-cast v6, LF/d;

    invoke-virtual {v6, v0}, LF/d;->b(Ljava/lang/Object;)V

    iput-boolean v4, v0, Ln0/z;->D:Z

    invoke-virtual {v5, v3}, Lo0/u;->C(Ln0/z;)V

    :cond_4
    :goto_0
    and-int/lit8 v0, p1, 0x4

    if-eqz v0, :cond_5

    instance-of v0, p0, Ln0/k;

    if-eqz v0, :cond_5

    move-object v0, p0

    check-cast v0, Ln0/k;

    invoke-static {v0}, Ln0/C;->k(Ln0/k;)V

    :cond_5
    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_6

    instance-of v0, p0, Ln0/l0;

    if-eqz v0, :cond_6

    move-object v0, p0

    check-cast v0, Ln0/l0;

    invoke-static {v0}, Ln0/C;->m(Ln0/l0;)V

    :cond_6
    and-int/lit8 v0, p1, 0x40

    if-eqz v0, :cond_7

    instance-of v0, p0, Ln0/h0;

    if-eqz v0, :cond_7

    move-object v0, p0

    check-cast v0, Ln0/h0;

    invoke-static {v0}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v0

    iget-object v0, v0, Ln0/z;->y:Ln0/I;

    iget-object v5, v0, Ln0/I;->q:Ln0/G;

    iput-boolean v4, v5, Ln0/G;->r:Z

    iget-object v0, v0, Ln0/I;->r:Ln0/F;

    if-eqz v0, :cond_7

    iput-boolean v4, v0, Ln0/F;->w:Z

    :cond_7
    and-int/lit16 v0, p1, 0x400

    if-eqz v0, :cond_8

    instance-of v0, p0, LU/q;

    if-eqz v0, :cond_8

    if-eq p2, v2, :cond_8

    move-object v0, p0

    check-cast v0, LU/q;

    invoke-static {v0}, LU/c;->q(LU/q;)V

    :cond_8
    and-int/lit16 v0, p1, 0x800

    if-eqz v0, :cond_16

    instance-of v0, p0, LU/l;

    if-eqz v0, :cond_16

    move-object v0, p0

    check-cast v0, LU/l;

    sput-object v3, Ln0/c;->b:Ljava/lang/Boolean;

    sget-object v5, Ln0/c;->a:Ln0/c;

    invoke-interface {v0, v5}, LU/l;->h(LU/i;)V

    sget-object v5, Ln0/c;->b:Ljava/lang/Boolean;

    if-eqz v5, :cond_16

    if-ne p2, v2, :cond_15

    check-cast v0, LP/k;

    iget-object p2, v0, LP/k;->d:LP/k;

    iget-boolean v0, p2, LP/k;->p:Z

    if-eqz v0, :cond_14

    new-instance v0, LF/d;

    const/16 v2, 0x10

    new-array v5, v2, [LP/k;

    invoke-direct {v0, v5}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v5, p2, LP/k;->i:LP/k;

    if-nez v5, :cond_9

    invoke-static {v0, p2}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_1

    :cond_9
    invoke-virtual {v0, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_1
    invoke-virtual {v0}, LF/d;->k()Z

    move-result p2

    if-eqz p2, :cond_16

    iget p2, v0, LF/d;->f:I

    sub-int/2addr p2, v4

    invoke-virtual {v0, p2}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LP/k;

    iget v5, p2, LP/k;->g:I

    and-int/lit16 v5, v5, 0x400

    if-nez v5, :cond_b

    invoke-static {v0, p2}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_1

    :cond_b
    :goto_2
    if-eqz p2, :cond_a

    iget v5, p2, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_13

    move-object v5, v3

    :goto_3
    if-eqz p2, :cond_a

    instance-of v6, p2, LU/q;

    if-eqz v6, :cond_c

    check-cast p2, LU/q;

    invoke-static {p2}, LU/c;->q(LU/q;)V

    goto :goto_6

    :cond_c
    iget v6, p2, LP/k;->f:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_12

    instance-of v6, p2, Ln0/i;

    if-eqz v6, :cond_12

    move-object v6, p2

    check-cast v6, Ln0/i;

    iget-object v6, v6, Ln0/i;->r:LP/k;

    move v7, v1

    :goto_4
    if-eqz v6, :cond_11

    iget v8, v6, LP/k;->f:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_10

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v4, :cond_d

    move-object p2, v6

    goto :goto_5

    :cond_d
    if-nez v5, :cond_e

    new-instance v5, LF/d;

    new-array v8, v2, [LP/k;

    invoke-direct {v5, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_e
    if-eqz p2, :cond_f

    invoke-virtual {v5, p2}, LF/d;->b(Ljava/lang/Object;)V

    move-object p2, v3

    :cond_f
    invoke-virtual {v5, v6}, LF/d;->b(Ljava/lang/Object;)V

    :cond_10
    :goto_5
    iget-object v6, v6, LP/k;->i:LP/k;

    goto :goto_4

    :cond_11
    if-ne v7, v4, :cond_12

    goto :goto_3

    :cond_12
    :goto_6
    invoke-static {v5}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object p2

    goto :goto_3

    :cond_13
    iget-object p2, p2, LP/k;->i:LP/k;

    goto :goto_2

    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "visitChildren called on an unattached node"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_15
    invoke-static {v0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object p2

    check-cast p2, Lo0/u;

    invoke-virtual {p2}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object p2

    check-cast p2, Landroidx/compose/ui/focus/a;

    iget-object p2, p2, Landroidx/compose/ui/focus/a;->e:LU/e;

    iget-object v1, p2, LU/e;->e:Ln/B;

    invoke-virtual {p2, v1, v0}, LU/e;->b(Ln/B;Ljava/lang/Object;)V

    :cond_16
    and-int/lit16 p1, p1, 0x1000

    if-eqz p1, :cond_17

    instance-of p1, p0, LU/b;

    if-eqz p1, :cond_17

    check-cast p0, LU/b;

    invoke-static {p0}, Ln0/C;->r(Ln0/h;)Ln0/e0;

    move-result-object p1

    check-cast p1, Lo0/u;

    invoke-virtual {p1}, Lo0/u;->getFocusOwner()LU/g;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/focus/a;

    iget-object p1, p1, Landroidx/compose/ui/focus/a;->e:LU/e;

    iget-object p2, p1, LU/e;->d:Ln/B;

    invoke-virtual {p1, p2, p0}, LU/e;->b(Ln/B;Ljava/lang/Object;)V

    :cond_17
    return-void
.end method

.method public static final d(LP/k;)V
    .locals 2

    iget-boolean v0, p0, LP/k;->p:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ln0/Z;->b(LP/k;II)V

    return-void

    :cond_0
    const-string p0, "autoInvalidateUpdatedNode called on unattached node"

    invoke-static {p0}, LZ0/d;->S(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final e(LP/k;)I
    .locals 4

    iget v0, p0, LP/k;->f:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ln0/Z;->a:Ln/w;

    invoke-virtual {v1, v0}, Ln/w;->c(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_1

    iget-object p0, v1, Ln/w;->c:[I

    aget p0, p0, v2

    goto/16 :goto_2

    :cond_1
    instance-of v2, p0, Ln0/s;

    if-eqz v2, :cond_2

    const/4 v2, 0x3

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    :goto_0
    instance-of v3, p0, Ln0/k;

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x4

    :cond_3
    instance-of v3, p0, Ln0/l0;

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x8

    :cond_4
    instance-of v3, p0, Ln0/j0;

    if-eqz v3, :cond_5

    or-int/lit8 v2, v2, 0x10

    :cond_5
    instance-of v3, p0, Lm0/c;

    if-eqz v3, :cond_6

    or-int/lit8 v2, v2, 0x20

    :cond_6
    instance-of v3, p0, Ln0/h0;

    if-eqz v3, :cond_7

    or-int/lit8 v2, v2, 0x40

    :cond_7
    instance-of v3, p0, Ln0/r;

    if-eqz v3, :cond_8

    or-int/lit16 v2, v2, 0x80

    :cond_8
    instance-of v3, p0, Ln0/l;

    if-eqz v3, :cond_9

    or-int/lit16 v2, v2, 0x100

    :cond_9
    instance-of v3, p0, LU/q;

    if-eqz v3, :cond_a

    or-int/lit16 v2, v2, 0x400

    :cond_a
    instance-of v3, p0, LU/l;

    if-eqz v3, :cond_b

    or-int/lit16 v2, v2, 0x800

    :cond_b
    instance-of v3, p0, LU/b;

    if-eqz v3, :cond_c

    or-int/lit16 v2, v2, 0x1000

    :cond_c
    instance-of v3, p0, Lg0/c;

    if-eqz v3, :cond_d

    or-int/lit16 v2, v2, 0x2000

    :cond_d
    instance-of v3, p0, Lj0/a;

    if-eqz v3, :cond_e

    or-int/lit16 v2, v2, 0x4000

    :cond_e
    instance-of v3, p0, Ln0/g;

    if-eqz v3, :cond_f

    const v3, 0x8000

    or-int/2addr v2, v3

    :cond_f
    instance-of p0, p0, Ln0/o0;

    if-eqz p0, :cond_10

    const/high16 p0, 0x40000

    or-int/2addr p0, v2

    goto :goto_1

    :cond_10
    move p0, v2

    :goto_1
    invoke-virtual {v1, v0}, Ln/w;->b(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_11

    not-int v2, v2

    :cond_11
    iget-object v3, v1, Ln/w;->b:[Ljava/lang/Object;

    aput-object v0, v3, v2

    iget-object v0, v1, Ln/w;->c:[I

    aput p0, v0, v2

    :goto_2
    return p0
.end method

.method public static final f(LP/k;)I
    .locals 2

    instance-of v0, p0, Ln0/i;

    if-eqz v0, :cond_0

    check-cast p0, Ln0/i;

    iget v0, p0, Ln0/i;->q:I

    iget-object p0, p0, Ln0/i;->r:LP/k;

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Ln0/Z;->f(LP/k;)I

    move-result v1

    or-int/2addr v0, v1

    iget-object p0, p0, LP/k;->i:LP/k;

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ln0/Z;->e(LP/k;)I

    move-result v0

    :cond_1
    return v0
.end method

.method public static final g(I)Z
    .locals 0

    and-int/lit16 p0, p0, 0x80

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
