.class public final Ln0/O;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln0/z;

.field public final b:LB2/i;

.field public c:Z

.field public d:Z

.field public final e:LB2/i;

.field public final f:LF/d;

.field public final g:J

.field public final h:LF/d;

.field public i:LG0/a;


# direct methods
.method public constructor <init>(Ln0/z;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/O;->a:Ln0/z;

    new-instance p1, LB2/i;

    const/16 v0, 0xc

    invoke-direct {p1, v0}, LB2/i;-><init>(I)V

    iput-object p1, p0, Ln0/O;->b:LB2/i;

    new-instance p1, LB2/i;

    const/16 v0, 0xe

    invoke-direct {p1, v0}, LB2/i;-><init>(I)V

    iput-object p1, p0, Ln0/O;->e:LB2/i;

    new-instance p1, LF/d;

    const/16 v0, 0x10

    new-array v1, v0, [Ln0/z;

    invoke-direct {p1, v1}, LF/d;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Ln0/O;->f:LF/d;

    const-wide/16 v1, 0x1

    iput-wide v1, p0, Ln0/O;->g:J

    new-instance p1, LF/d;

    new-array v0, v0, [Ln0/N;

    invoke-direct {p1, v0}, LF/d;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Ln0/O;->h:LF/d;

    return-void
.end method

.method public static b(Ln0/z;LG0/a;)Z
    .locals 5

    iget-object v0, p0, Ln0/z;->f:Ln0/z;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, Ln0/z;->y:Ln0/I;

    if-eqz p1, :cond_2

    if-eqz v0, :cond_1

    iget-object v0, v2, Ln0/I;->r:Ln0/F;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-wide v2, p1, LG0/a;->a:J

    invoke-virtual {v0, v2, v3}, Ln0/F;->V(J)Z

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    goto :goto_1

    :cond_2
    iget-object p1, v2, Ln0/I;->r:Ln0/F;

    if-eqz p1, :cond_3

    iget-object v2, p1, Ln0/F;->o:LG0/a;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    invoke-static {p1}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-wide v2, v2, LG0/a;->a:J

    invoke-virtual {p1, v2, v3}, Ln0/F;->V(J)Z

    move-result p1

    :goto_1
    invoke-virtual {p0}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    if-eqz p1, :cond_6

    if-eqz v0, :cond_6

    iget-object v2, v0, Ln0/z;->f:Ln0/z;

    const/4 v3, 0x3

    if-nez v2, :cond_4

    invoke-static {v0, v1, v3}, Ln0/z;->F(Ln0/z;ZI)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Ln0/z;->j()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_5

    invoke-static {v0, v1, v3}, Ln0/z;->D(Ln0/z;ZI)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Ln0/z;->j()I

    move-result p0

    const/4 v2, 0x2

    if-ne p0, v2, :cond_6

    invoke-virtual {v0, v1}, Ln0/z;->C(Z)V

    :cond_6
    :goto_2
    return p1
.end method

.method public static c(Ln0/z;LG0/a;)Z
    .locals 4

    const/4 v0, 0x3

    if-eqz p1, :cond_1

    iget v1, p0, Ln0/z;->F:I

    if-ne v1, v0, :cond_0

    invoke-virtual {p0}, Ln0/z;->c()V

    :cond_0
    iget-object v1, p0, Ln0/z;->y:Ln0/I;

    iget-object v1, v1, Ln0/I;->q:Ln0/G;

    iget-wide v2, p1, LG0/a;->a:J

    invoke-virtual {v1, v2, v3}, Ln0/G;->V(J)Z

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Ln0/z;->B(Ln0/z;)Z

    move-result p1

    :goto_0
    invoke-virtual {p0}, Ln0/z;->k()Ln0/z;

    move-result-object v1

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    iget-object p0, p0, Ln0/z;->y:Ln0/I;

    iget-object p0, p0, Ln0/I;->q:Ln0/G;

    iget p0, p0, Ln0/G;->n:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p0, v2, :cond_2

    invoke-static {v1, v3, v0}, Ln0/z;->F(Ln0/z;ZI)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    if-ne p0, v0, :cond_3

    invoke-virtual {v1, v3}, Ln0/z;->E(Z)V

    :cond_3
    :goto_1
    return p1
.end method

.method public static f(Ln0/z;)Z
    .locals 1

    iget-object v0, p0, Ln0/z;->y:Ln0/I;

    iget-boolean v0, v0, Ln0/I;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Ln0/O;->g(Ln0/z;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g(Ln0/z;)Z
    .locals 2

    iget-object p0, p0, Ln0/z;->y:Ln0/I;

    iget-object p0, p0, Ln0/I;->q:Ln0/G;

    iget v0, p0, Ln0/G;->n:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object p0, p0, Ln0/G;->v:Ln0/A;

    invoke-virtual {p0}, Ln0/A;->e()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public final a(Z)V
    .locals 6

    iget-object v0, p0, Ln0/O;->e:LB2/i;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-object p1, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast p1, LF/d;

    invoke-virtual {p1}, LF/d;->g()V

    iget-object v2, p0, Ln0/O;->a:Ln0/z;

    invoke-virtual {p1, v2}, LF/d;->b(Ljava/lang/Object;)V

    iput-boolean v1, v2, Ln0/z;->D:Z

    :cond_0
    sget-object p1, Ln0/c0;->b:Ln0/c0;

    iget-object v2, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v2, LF/d;

    invoke-virtual {v2, p1}, LF/d;->o(Ljava/util/Comparator;)V

    iget p1, v2, LF/d;->f:I

    iget-object v3, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v3, [Ln0/z;

    if-eqz v3, :cond_1

    array-length v4, v3

    if-ge v4, p1, :cond_2

    :cond_1
    const/16 v3, 0x10

    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result v3

    new-array v3, v3, [Ln0/z;

    :cond_2
    const/4 v4, 0x0

    iput-object v4, v0, LB2/i;->f:Ljava/lang/Object;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_3

    iget-object v5, v2, LF/d;->d:[Ljava/lang/Object;

    aget-object v5, v5, v4

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, LF/d;->g()V

    sub-int/2addr p1, v1

    :goto_1
    const/4 v1, -0x1

    if-ge v1, p1, :cond_5

    aget-object v1, v3, p1

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-boolean v2, v1, Ln0/z;->D:Z

    if-eqz v2, :cond_4

    invoke-static {v1}, LB2/i;->h(Ln0/z;)V

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_5
    iput-object v3, v0, LB2/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public final d(Ln0/z;Z)V
    .locals 2

    iget-object v0, p0, Ln0/O;->b:LB2/i;

    if-eqz p2, :cond_0

    iget-object v0, v0, LB2/i;->e:Ljava/lang/Object;

    :goto_0
    check-cast v0, LB2/i;

    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    goto :goto_1

    :cond_0
    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Ln0/O;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    if-eqz p2, :cond_2

    iget-object v0, p1, Ln0/z;->y:Ln0/I;

    iget-boolean v0, v0, Ln0/I;->f:Z

    goto :goto_2

    :cond_2
    iget-object v0, p1, Ln0/z;->y:Ln0/I;

    iget-boolean v0, v0, Ln0/I;->c:Z

    :goto_2
    if-nez v0, :cond_3

    invoke-virtual {p0, p1, p2}, Ln0/O;->e(Ln0/z;Z)V

    return-void

    :cond_3
    const-string p1, "node not yet measured"

    invoke-static {p1}, LZ0/d;->R(Ljava/lang/String;)V

    throw v1

    :cond_4
    const-string p1, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1
.end method

.method public final e(Ln0/z;Z)V
    .locals 9

    invoke-virtual {p1}, Ln0/z;->n()LF/d;

    move-result-object v0

    iget v1, v0, LF/d;->f:I

    iget-object v2, p0, Ln0/O;->b:LB2/i;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lez v1, :cond_c

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    move v5, v3

    :cond_0
    aget-object v6, v0, v5

    check-cast v6, Ln0/z;

    if-nez p2, :cond_1

    invoke-static {v6}, Ln0/O;->g(Ln0/z;)Z

    move-result v7

    if-nez v7, :cond_2

    :cond_1
    if-eqz p2, :cond_b

    invoke-virtual {v6}, Ln0/z;->j()I

    move-result v7

    if-eq v7, v4, :cond_2

    iget-object v7, v6, Ln0/z;->y:Ln0/I;

    iget-object v7, v7, Ln0/I;->r:Ln0/F;

    if-eqz v7, :cond_b

    iget-object v7, v7, Ln0/F;->s:Ln0/A;

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Ln0/A;->e()Z

    move-result v7

    if-ne v7, v4, :cond_b

    :cond_2
    invoke-static {v6}, Ln0/C;->n(Ln0/z;)Z

    move-result v7

    iget-object v8, v6, Ln0/z;->y:Ln0/I;

    if-eqz v7, :cond_4

    if-nez p2, :cond_4

    iget-boolean v7, v8, Ln0/I;->f:Z

    if-eqz v7, :cond_3

    iget-object v7, v2, LB2/i;->e:Ljava/lang/Object;

    check-cast v7, LB2/i;

    iget-object v7, v7, LB2/i;->f:Ljava/lang/Object;

    check-cast v7, Ln0/p0;

    invoke-virtual {v7, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {p0, v6, v4, v3}, Ln0/O;->j(Ln0/z;ZZ)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v6, v4}, Ln0/O;->d(Ln0/z;Z)V

    :cond_4
    :goto_0
    if-eqz p2, :cond_5

    iget-boolean v7, v8, Ln0/I;->f:Z

    goto :goto_1

    :cond_5
    iget-boolean v7, v8, Ln0/I;->c:Z

    :goto_1
    if-eqz v7, :cond_9

    iget-object v7, v2, LB2/i;->e:Ljava/lang/Object;

    check-cast v7, LB2/i;

    iget-object v7, v7, LB2/i;->f:Ljava/lang/Object;

    check-cast v7, Ln0/p0;

    invoke-virtual {v7, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    if-nez v7, :cond_8

    iget-object v7, v2, LB2/i;->f:Ljava/lang/Object;

    check-cast v7, LB2/i;

    iget-object v7, v7, LB2/i;->f:Ljava/lang/Object;

    check-cast v7, Ln0/p0;

    invoke-virtual {v7, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_2

    :cond_7
    move v7, v3

    goto :goto_3

    :cond_8
    :goto_2
    move v7, v4

    :goto_3
    if-eqz v7, :cond_9

    invoke-virtual {p0, v6, p2, v3}, Ln0/O;->j(Ln0/z;ZZ)Z

    :cond_9
    if-eqz p2, :cond_a

    iget-boolean v7, v8, Ln0/I;->f:Z

    goto :goto_4

    :cond_a
    iget-boolean v7, v8, Ln0/I;->c:Z

    :goto_4
    if-nez v7, :cond_b

    invoke-virtual {p0, v6, p2}, Ln0/O;->e(Ln0/z;Z)V

    :cond_b
    add-int/lit8 v5, v5, 0x1

    if-lt v5, v1, :cond_0

    :cond_c
    iget-object v0, p1, Ln0/z;->y:Ln0/I;

    if-eqz p2, :cond_d

    iget-boolean v0, v0, Ln0/I;->f:Z

    goto :goto_5

    :cond_d
    iget-boolean v0, v0, Ln0/I;->c:Z

    :goto_5
    if-eqz v0, :cond_11

    iget-object v0, v2, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p2, :cond_e

    move v4, v0

    goto :goto_6

    :cond_e
    if-nez v0, :cond_10

    iget-object v0, v2, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_6

    :cond_f
    move v4, v3

    :cond_10
    :goto_6
    if-eqz v4, :cond_11

    invoke-virtual {p0, p1, p2, v3}, Ln0/O;->j(Ln0/z;ZZ)Z

    :cond_11
    return-void
.end method

.method public final h(Lo2/a;)Z
    .locals 16

    move-object/from16 v1, p0

    const/4 v0, 0x1

    iget-object v2, v1, Ln0/O;->b:LB2/i;

    iget-object v3, v1, Ln0/O;->a:Ln0/z;

    invoke-virtual {v3}, Ln0/z;->u()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v3}, Ln0/z;->v()Z

    move-result v4

    if-eqz v4, :cond_14

    iget-boolean v4, v1, Ln0/O;->c:Z

    if-nez v4, :cond_13

    iget-object v4, v1, Ln0/O;->i:LG0/a;

    const/4 v6, 0x0

    if-eqz v4, :cond_5

    iput-boolean v0, v1, Ln0/O;->c:Z

    iput-boolean v0, v1, Ln0/O;->d:Z

    :try_start_0
    invoke-virtual {v2}, LB2/i;->l()Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v6

    :cond_0
    :goto_0
    invoke-virtual {v2}, LB2/i;->l()Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v8, v2, LB2/i;->e:Ljava/lang/Object;

    check-cast v8, LB2/i;

    if-eqz v7, :cond_2

    :try_start_1
    iget-object v7, v8, LB2/i;->f:Ljava/lang/Object;

    check-cast v7, Ln0/p0;

    invoke-virtual {v7}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v7

    xor-int/lit8 v9, v7, 0x1

    if-nez v7, :cond_1

    iget-object v7, v8, LB2/i;->f:Ljava/lang/Object;

    check-cast v7, Ln0/p0;

    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln0/z;

    invoke-virtual {v8, v7}, LB2/i;->s(Ln0/z;)Z

    goto :goto_1

    :cond_1
    iget-object v7, v2, LB2/i;->f:Ljava/lang/Object;

    check-cast v7, LB2/i;

    iget-object v8, v7, LB2/i;->f:Ljava/lang/Object;

    check-cast v8, Ln0/p0;

    invoke-virtual {v8}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ln0/z;

    invoke-virtual {v7, v8}, LB2/i;->s(Ln0/z;)Z

    move-object v7, v8

    :goto_1
    invoke-virtual {v1, v7, v9, v0}, Ln0/O;->j(Ln0/z;ZZ)Z

    move-result v8

    if-ne v7, v3, :cond_0

    if-eqz v8, :cond_0

    move v4, v0

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_4

    invoke-interface/range {p1 .. p1}, Lo2/a;->c()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_3
    move v4, v6

    :cond_4
    :goto_2
    iput-boolean v6, v1, Ln0/O;->c:Z

    iput-boolean v6, v1, Ln0/O;->d:Z

    goto :goto_4

    :goto_3
    iput-boolean v6, v1, Ln0/O;->c:Z

    iput-boolean v6, v1, Ln0/O;->d:Z

    throw v0

    :cond_5
    move v4, v6

    :goto_4
    iget-object v2, v1, Ln0/O;->f:LF/d;

    iget v3, v2, LF/d;->f:I

    if-lez v3, :cond_12

    iget-object v7, v2, LF/d;->d:[Ljava/lang/Object;

    move v8, v6

    :goto_5
    aget-object v9, v7, v8

    check-cast v9, Ln0/z;

    iget-object v9, v9, Ln0/z;->x:LD/s;

    iget-object v10, v9, LD/s;->c:Ljava/lang/Object;

    check-cast v10, Ln0/p;

    const/16 v11, 0x80

    invoke-static {v11}, Ln0/Z;->g(I)Z

    move-result v12

    if-eqz v12, :cond_6

    iget-object v13, v10, Ln0/p;->K:Ln0/m0;

    goto :goto_6

    :cond_6
    iget-object v13, v10, Ln0/p;->K:Ln0/m0;

    iget-object v13, v13, LP/k;->h:LP/k;

    if-nez v13, :cond_7

    goto/16 :goto_d

    :cond_7
    :goto_6
    sget-object v14, Ln0/Y;->G:LW/F;

    invoke-virtual {v10, v12}, Ln0/Y;->s0(Z)LP/k;

    move-result-object v10

    :goto_7
    if-eqz v10, :cond_10

    iget v12, v10, LP/k;->g:I

    and-int/2addr v12, v11

    if-eqz v12, :cond_10

    iget v12, v10, LP/k;->f:I

    and-int/2addr v12, v11

    if-eqz v12, :cond_f

    move-object v12, v10

    const/4 v14, 0x0

    :goto_8
    if-eqz v12, :cond_f

    instance-of v15, v12, Ln0/r;

    if-eqz v15, :cond_8

    check-cast v12, Ln0/r;

    iget-object v15, v9, LD/s;->c:Ljava/lang/Object;

    check-cast v15, Ln0/p;

    invoke-interface {v12, v15}, Ln0/r;->K(Ln0/Y;)V

    goto :goto_c

    :cond_8
    iget v15, v12, LP/k;->f:I

    and-int/2addr v15, v11

    if-eqz v15, :cond_e

    instance-of v15, v12, Ln0/i;

    if-eqz v15, :cond_e

    move-object v15, v12

    check-cast v15, Ln0/i;

    iget-object v15, v15, Ln0/i;->r:LP/k;

    :goto_9
    if-eqz v15, :cond_d

    iget v5, v15, LP/k;->f:I

    and-int/2addr v5, v11

    if-eqz v5, :cond_c

    add-int/2addr v6, v0

    if-ne v6, v0, :cond_9

    move-object v12, v15

    goto :goto_a

    :cond_9
    if-nez v14, :cond_a

    new-instance v14, LF/d;

    const/16 v5, 0x10

    new-array v5, v5, [LP/k;

    invoke-direct {v14, v5}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_a
    if-eqz v12, :cond_b

    invoke-virtual {v14, v12}, LF/d;->b(Ljava/lang/Object;)V

    const/4 v12, 0x0

    :cond_b
    invoke-virtual {v14, v15}, LF/d;->b(Ljava/lang/Object;)V

    :cond_c
    :goto_a
    iget-object v15, v15, LP/k;->i:LP/k;

    goto :goto_9

    :cond_d
    if-ne v6, v0, :cond_e

    :goto_b
    const/4 v6, 0x0

    goto :goto_8

    :cond_e
    :goto_c
    invoke-static {v14}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v12

    goto :goto_b

    :cond_f
    if-eq v10, v13, :cond_10

    iget-object v10, v10, LP/k;->i:LP/k;

    const/4 v6, 0x0

    goto :goto_7

    :cond_10
    :goto_d
    add-int/2addr v8, v0

    if-lt v8, v3, :cond_11

    goto :goto_e

    :cond_11
    const/4 v6, 0x0

    goto/16 :goto_5

    :cond_12
    :goto_e
    invoke-virtual {v2}, LF/d;->g()V

    return v4

    :cond_13
    const-string v0, "performMeasureAndLayout called during measure layout"

    invoke-static {v0}, LZ0/d;->R(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_14
    const/4 v0, 0x0

    const-string v2, "performMeasureAndLayout called with unplaced root"

    invoke-static {v2}, LZ0/d;->R(Ljava/lang/String;)V

    throw v0

    :cond_15
    const/4 v0, 0x0

    const-string v2, "performMeasureAndLayout called with unattached root"

    invoke-static {v2}, LZ0/d;->R(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Ln0/O;->b:LB2/i;

    invoke-virtual {v0}, LB2/i;->l()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Ln0/O;->a:Ln0/z;

    invoke-virtual {v1}, Ln0/z;->u()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ln0/z;->v()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Ln0/O;->c:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Ln0/O;->i:LG0/a;

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    iput-boolean v2, p0, Ln0/O;->c:Z

    const/4 v3, 0x0

    iput-boolean v3, p0, Ln0/O;->d:Z

    :try_start_0
    iget-object v0, v0, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, LB2/i;

    iget-object v0, v0, LB2/i;->f:Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v1, Ln0/z;->f:Ln0/z;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, v2}, Ln0/O;->l(Ln0/z;Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Ln0/O;->k(Ln0/z;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, v1, v3}, Ln0/O;->l(Ln0/z;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v3, p0, Ln0/O;->c:Z

    iput-boolean v3, p0, Ln0/O;->d:Z

    goto :goto_2

    :goto_1
    iput-boolean v3, p0, Ln0/O;->c:Z

    iput-boolean v3, p0, Ln0/O;->d:Z

    throw v0

    :cond_2
    const-string v0, "performMeasureAndLayout called during measure layout"

    invoke-static {v0}, LZ0/d;->R(Ljava/lang/String;)V

    throw v3

    :cond_3
    const-string v0, "performMeasureAndLayout called with unplaced root"

    invoke-static {v0}, LZ0/d;->R(Ljava/lang/String;)V

    throw v3

    :cond_4
    const-string v0, "performMeasureAndLayout called with unattached root"

    invoke-static {v0}, LZ0/d;->R(Ljava/lang/String;)V

    throw v3

    :cond_5
    :goto_2
    return-void
.end method

.method public final j(Ln0/z;ZZ)Z
    .locals 7

    iget-boolean v0, p1, Ln0/z;->E:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Ln0/z;->v()Z

    move-result v0

    const/4 v2, 0x1

    iget-object v3, p1, Ln0/z;->y:Ln0/I;

    if-nez v0, :cond_2

    iget-object v0, v3, Ln0/I;->q:Ln0/G;

    iget-boolean v0, v0, Ln0/G;->u:Z

    if-nez v0, :cond_2

    invoke-static {p1}, Ln0/O;->f(Ln0/z;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ln0/z;->x()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, v3, Ln0/I;->f:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ln0/z;->j()I

    move-result v0

    if-eq v0, v2, :cond_2

    iget-object v0, v3, Ln0/I;->r:Ln0/F;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ln0/F;->s:Ln0/A;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/A;->e()Z

    move-result v0

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v3, Ln0/I;->q:Ln0/G;

    iget-object v0, v0, Ln0/G;->v:Ln0/A;

    invoke-virtual {v0}, Ln0/A;->e()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v3, Ln0/I;->r:Ln0/F;

    if-eqz v0, :cond_19

    iget-object v0, v0, Ln0/F;->s:Ln0/A;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Ln0/A;->e()Z

    move-result v0

    if-ne v0, v2, :cond_19

    :cond_2
    :goto_0
    const/4 v0, 0x0

    iget-object v4, p0, Ln0/O;->a:Ln0/z;

    if-ne p1, v4, :cond_3

    iget-object v5, p0, Ln0/O;->i:LG0/a;

    invoke-static {v5}, Lp2/g;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    move-object v5, v0

    :goto_1
    const/4 v6, 0x3

    if-eqz p2, :cond_9

    iget-boolean p2, v3, Ln0/I;->f:Z

    if-eqz p2, :cond_4

    invoke-static {p1, v5}, Ln0/O;->b(Ln0/z;LG0/a;)Z

    move-result p2

    goto :goto_2

    :cond_4
    move p2, v1

    :goto_2
    if-eqz p3, :cond_13

    if-nez p2, :cond_5

    iget-boolean p3, v3, Ln0/I;->g:Z

    if-eqz p3, :cond_13

    :cond_5
    invoke-virtual {p1}, Ln0/z;->x()Ljava/lang/Boolean;

    move-result-object p3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_13

    iget p3, p1, Ln0/z;->F:I

    if-ne p3, v6, :cond_6

    invoke-virtual {p1}, Ln0/z;->d()V

    :cond_6
    iget-object p1, v3, Ln0/I;->r:Ln0/F;

    invoke-static {p1}, Lp2/g;->b(Ljava/lang/Object;)V

    :try_start_0
    iput-boolean v2, p1, Ln0/F;->i:Z

    iget-boolean p3, p1, Ln0/F;->m:Z

    if-eqz p3, :cond_8

    iput-boolean v1, p1, Ln0/F;->y:Z

    iget-boolean p3, p1, Ln0/F;->r:Z

    iget-wide v2, p1, Ln0/F;->p:J

    iget-object v0, p1, Ln0/F;->q:Lo2/c;

    invoke-virtual {p1, v2, v3, v0}, Ln0/F;->U(JLo2/c;)V

    if-eqz p3, :cond_7

    iget-boolean p3, p1, Ln0/F;->y:Z

    if-nez p3, :cond_7

    iget-object p3, p1, Ln0/F;->z:Ln0/I;

    iget-object p3, p3, Ln0/I;->a:Ln0/z;

    invoke-virtual {p3}, Ln0/z;->k()Ln0/z;

    move-result-object p3

    if-eqz p3, :cond_7

    invoke-virtual {p3, v1}, Ln0/z;->C(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_7
    :goto_3
    iput-boolean v1, p1, Ln0/F;->i:Z

    goto/16 :goto_9

    :cond_8
    :try_start_1
    const-string p2, "replace() called on item that was not placed"

    invoke-static {p2}, LZ0/d;->S(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    iput-boolean v1, p1, Ln0/F;->i:Z

    throw p2

    :cond_9
    iget-boolean p2, v3, Ln0/I;->c:Z

    if-eqz p2, :cond_a

    invoke-static {p1, v5}, Ln0/O;->c(Ln0/z;LG0/a;)Z

    move-result p2

    goto :goto_5

    :cond_a
    move p2, v1

    :goto_5
    if-eqz p3, :cond_13

    iget-boolean p3, v3, Ln0/I;->d:Z

    if-eqz p3, :cond_13

    if-eq p1, v4, :cond_b

    invoke-virtual {p1}, Ln0/z;->k()Ln0/z;

    move-result-object p3

    if-eqz p3, :cond_13

    invoke-virtual {p3}, Ln0/z;->v()Z

    move-result p3

    if-ne p3, v2, :cond_13

    iget-object p3, v3, Ln0/I;->q:Ln0/G;

    iget-boolean p3, p3, Ln0/G;->u:Z

    if-eqz p3, :cond_13

    :cond_b
    iget-object p3, v3, Ln0/I;->q:Ln0/G;

    if-ne p1, v4, :cond_f

    iget v0, p1, Ln0/z;->F:I

    if-ne v0, v6, :cond_c

    invoke-virtual {p1}, Ln0/z;->d()V

    :cond_c
    invoke-virtual {p1}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v0, v0, Ln0/z;->x:LD/s;

    iget-object v0, v0, LD/s;->c:Ljava/lang/Object;

    check-cast v0, Ln0/p;

    if-eqz v0, :cond_d

    iget-object v0, v0, Ln0/L;->k:Ll0/h;

    if-nez v0, :cond_e

    :cond_d
    invoke-static {p1}, Ln0/C;->s(Ln0/z;)Ln0/e0;

    move-result-object v0

    check-cast v0, Lo0/u;

    invoke-virtual {v0}, Lo0/u;->getPlacementScope()Ll0/n;

    move-result-object v0

    :cond_e
    invoke-static {v0, p3, v1, v1}, Ll0/n;->f(Ll0/n;Ll0/o;II)V

    goto :goto_7

    :cond_f
    iget v3, p1, Ln0/z;->F:I

    if-ne v3, v6, :cond_10

    invoke-virtual {p1}, Ln0/z;->d()V

    :cond_10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2
    iput-boolean v2, p3, Ln0/G;->i:Z

    iget-boolean v3, p3, Ln0/G;->m:Z

    if-eqz v3, :cond_12

    iget-boolean v0, p3, Ln0/G;->t:Z

    iget-wide v3, p3, Ln0/G;->o:J

    iget v5, p3, Ln0/G;->q:F

    iget-object v6, p3, Ln0/G;->p:Lo2/c;

    invoke-virtual {p3, v3, v4, v5, v6}, Ln0/G;->U(JFLo2/c;)V

    if-eqz v0, :cond_11

    iget-boolean v0, p3, Ln0/G;->B:Z

    if-nez v0, :cond_11

    iget-object v0, p3, Ln0/G;->H:Ln0/I;

    iget-object v0, v0, Ln0/I;->a:Ln0/z;

    invoke-virtual {v0}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0, v1}, Ln0/z;->E(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_8

    :cond_11
    :goto_6
    iput-boolean v1, p3, Ln0/G;->i:Z

    :goto_7
    iget-object p3, p0, Ln0/O;->e:LB2/i;

    iget-object p3, p3, LB2/i;->e:Ljava/lang/Object;

    check-cast p3, LF/d;

    invoke-virtual {p3, p1}, LF/d;->b(Ljava/lang/Object;)V

    iput-boolean v2, p1, Ln0/z;->D:Z

    goto :goto_9

    :cond_12
    :try_start_3
    const-string p1, "replace called on unplaced item"

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_8
    iput-boolean v1, p3, Ln0/G;->i:Z

    throw p1

    :cond_13
    :goto_9
    iget-object p1, p0, Ln0/O;->h:LF/d;

    invoke-virtual {p1}, LF/d;->k()Z

    move-result p3

    if-eqz p3, :cond_18

    iget p3, p1, LF/d;->f:I

    if-lez p3, :cond_17

    iget-object v0, p1, LF/d;->d:[Ljava/lang/Object;

    :cond_14
    aget-object v2, v0, v1

    check-cast v2, Ln0/N;

    iget-object v3, v2, Ln0/N;->a:Ln0/z;

    invoke-virtual {v3}, Ln0/z;->u()Z

    move-result v3

    if-eqz v3, :cond_16

    iget-boolean v3, v2, Ln0/N;->b:Z

    const/4 v4, 0x2

    iget-boolean v5, v2, Ln0/N;->c:Z

    iget-object v2, v2, Ln0/N;->a:Ln0/z;

    if-nez v3, :cond_15

    invoke-static {v2, v5, v4}, Ln0/z;->F(Ln0/z;ZI)V

    goto :goto_a

    :cond_15
    invoke-static {v2, v5, v4}, Ln0/z;->D(Ln0/z;ZI)V

    :cond_16
    :goto_a
    add-int/lit8 v1, v1, 0x1

    if-lt v1, p3, :cond_14

    :cond_17
    invoke-virtual {p1}, LF/d;->g()V

    :cond_18
    move v1, p2

    :cond_19
    return v1
.end method

.method public final k(Ln0/z;)V
    .locals 4

    invoke-virtual {p1}, Ln0/z;->n()LF/d;

    move-result-object p1

    iget v0, p1, LF/d;->f:I

    if-lez v0, :cond_3

    iget-object p1, p1, LF/d;->d:[Ljava/lang/Object;

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, Ln0/z;

    invoke-static {v2}, Ln0/O;->g(Ln0/z;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Ln0/C;->n(Ln0/z;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v3}, Ln0/O;->l(Ln0/z;Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Ln0/O;->k(Ln0/z;)V

    :cond_2
    :goto_0
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_3
    return-void
.end method

.method public final l(Ln0/z;Z)V
    .locals 1

    iget-boolean v0, p1, Ln0/z;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln0/O;->a:Ln0/z;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Ln0/O;->i:LG0/a;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p2, :cond_2

    invoke-static {p1, v0}, Ln0/O;->b(Ln0/z;LG0/a;)Z

    goto :goto_1

    :cond_2
    invoke-static {p1, v0}, Ln0/O;->c(Ln0/z;LG0/a;)Z

    :goto_1
    return-void
.end method

.method public final m(Ln0/z;Z)Z
    .locals 4

    iget-object v0, p1, Ln0/z;->y:Ln0/I;

    iget v0, v0, Ln0/I;->b:I

    invoke-static {v0}, Lp/f;->b(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/4 v3, 0x2

    if-eq v0, v3, :cond_5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    const/4 v3, 0x4

    if-ne v0, v3, :cond_4

    iget-object v0, p1, Ln0/z;->y:Ln0/I;

    iget-boolean v3, v0, Ln0/I;->c:Z

    if-eqz v3, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iput-boolean v2, v0, Ln0/I;->c:Z

    iget-boolean p2, p1, Ln0/z;->E:Z

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ln0/z;->v()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, Ln0/O;->f(Ln0/z;)Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_2
    invoke-virtual {p1}, Ln0/z;->k()Ln0/z;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object p2, p2, Ln0/z;->y:Ln0/I;

    iget-boolean p2, p2, Ln0/I;->c:Z

    if-ne p2, v2, :cond_3

    goto :goto_0

    :cond_3
    iget-object p2, p0, Ln0/O;->b:LB2/i;

    invoke-virtual {p2, p1, v1}, LB2/i;->g(Ln0/z;Z)V

    :goto_0
    iget-boolean p1, p0, Ln0/O;->d:Z

    if-nez p1, :cond_6

    move v1, v2

    goto :goto_1

    :cond_4
    new-instance p1, LB1/c;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_5
    new-instance v0, Ln0/N;

    invoke-direct {v0, p1, v1, p2}, Ln0/N;-><init>(Ln0/z;ZZ)V

    iget-object p1, p0, Ln0/O;->h:LF/d;

    invoke-virtual {p1, v0}, LF/d;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_1
    return v1
.end method

.method public final n(J)V
    .locals 4

    iget-object v0, p0, Ln0/O;->i:LG0/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    iget-wide v2, v0, LG0/a;->a:J

    invoke-static {v2, v3, p1, p2}, LG0/a;->b(JJ)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_4

    iget-boolean v0, p0, Ln0/O;->c:Z

    if-nez v0, :cond_3

    new-instance v0, LG0/a;

    invoke-direct {v0, p1, p2}, LG0/a;-><init>(J)V

    iput-object v0, p0, Ln0/O;->i:LG0/a;

    iget-object p1, p0, Ln0/O;->a:Ln0/z;

    iget-object p2, p1, Ln0/z;->f:Ln0/z;

    const/4 v0, 0x1

    iget-object v2, p1, Ln0/z;->y:Ln0/I;

    if-eqz p2, :cond_1

    iput-boolean v0, v2, Ln0/I;->f:Z

    :cond_1
    iput-boolean v0, v2, Ln0/I;->c:Z

    if-eqz p2, :cond_2

    move v1, v0

    :cond_2
    iget-object p2, p0, Ln0/O;->b:LB2/i;

    invoke-virtual {p2, p1, v1}, LB2/i;->g(Ln0/z;Z)V

    goto :goto_1

    :cond_3
    const-string p1, "updateRootConstraints called while measuring"

    invoke-static {p1}, LZ0/d;->R(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_4
    :goto_1
    return-void
.end method
