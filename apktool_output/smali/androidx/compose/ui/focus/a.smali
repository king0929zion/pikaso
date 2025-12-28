.class public final Landroidx/compose/ui/focus/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU/g;


# instance fields
.field public final a:Lo0/o;

.field public final b:LU/d;

.field public final c:Lo0/p;

.field public final d:LU/q;

.field public final e:LU/e;

.field public final f:LA1/f;

.field public final g:LP/l;

.field public h:Ln/u;


# direct methods
.method public constructor <init>(Lo0/n;Lo0/o;LU/d;Lo0/p;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/focus/a;->a:Lo0/o;

    iput-object p3, p0, Landroidx/compose/ui/focus/a;->b:LU/d;

    iput-object p4, p0, Landroidx/compose/ui/focus/a;->c:Lo0/p;

    new-instance p2, LU/q;

    invoke-direct {p2}, LP/k;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/focus/a;->d:LU/q;

    new-instance p2, LU/e;

    new-instance p3, LU/d;

    const-class v3, Landroidx/compose/ui/focus/a;

    const-string v4, "invalidateOwnerFocusState"

    const/4 v1, 0x0

    const-string v5, "invalidateOwnerFocusState()V"

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p3

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, LU/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {p2, p1, p3}, LU/e;-><init>(Lo0/n;LU/d;)V

    iput-object p2, p0, Landroidx/compose/ui/focus/a;->e:LU/e;

    new-instance p1, LA1/f;

    invoke-direct {p1}, LA1/f;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/a;->f:LA1/f;

    new-instance p1, Landroidx/compose/ui/focus/FocusPropertiesElement;

    new-instance p2, LU/k;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-direct {p1, p2}, Landroidx/compose/ui/focus/FocusPropertiesElement;-><init>(LU/k;)V

    new-instance p2, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;

    invoke-direct {p2, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;-><init>(Landroidx/compose/ui/focus/a;)V

    invoke-interface {p1, p2}, LP/l;->c(LP/l;)LP/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/focus/a;->g:LP/l;

    return-void
.end method


# virtual methods
.method public final a(IZZ)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/focus/a;->f:LA1/f;

    sget-object v1, LU/f;->g:LU/f;

    :try_start_0
    iget-boolean v2, v0, LA1/f;->a:Z

    if-eqz v2, :cond_0

    invoke-static {v0}, LA1/f;->a(LA1/f;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    const/4 v2, 0x1

    iput-boolean v2, v0, LA1/f;->a:Z

    iget-object v3, v0, LA1/f;->c:Ljava/lang/Object;

    check-cast v3, LF/d;

    invoke-virtual {v3, v1}, LF/d;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Landroidx/compose/ui/focus/a;->d:LU/q;

    if-nez p2, :cond_2

    :try_start_1
    invoke-static {v1, p1}, LU/c;->u(LU/q;I)I

    move-result p1

    invoke-static {p1}, Lp/f;->b(I)I

    move-result p1

    if-eq p1, v2, :cond_1

    const/4 v3, 0x2

    if-eq p1, v3, :cond_1

    const/4 v3, 0x3

    if-eq p1, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-static {v1, p2, v2}, LU/c;->e(LU/q;ZZ)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-static {v0}, LA1/f;->b(LA1/f;)V

    if-eqz p1, :cond_3

    if-eqz p3, :cond_3

    iget-object p2, p0, Landroidx/compose/ui/focus/a;->b:LU/d;

    invoke-virtual {p2}, LU/d;->c()Ljava/lang/Object;

    :cond_3
    return p1

    :goto_3
    invoke-static {v0}, LA1/f;->b(LA1/f;)V

    throw p1
.end method

.method public final b(Landroid/view/KeyEvent;Lo2/a;)Z
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/ui/focus/a;->e:LU/e;

    invoke-virtual {v2}, LU/e;->a()Z

    move-result v2

    if-nez v2, :cond_58

    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-static {v2}, LZ/b;->a(I)J

    move-result-wide v2

    invoke-static/range {p1 .. p1}, LZ0/d;->A(Landroid/view/KeyEvent;)I

    move-result v4

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-ne v4, v7, :cond_0

    move v7, v6

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    const/4 v9, 0x3

    const/4 v15, 0x6

    const-wide/16 v16, 0x1

    const-wide/16 v18, 0x0

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const-wide v22, 0x101010101010101L

    const/16 v24, 0x3f

    const v25, -0x3361d2af    # -8.2930312E7f

    if-eqz v7, :cond_9

    iget-object v4, v0, Landroidx/compose/ui/focus/a;->h:Ln/u;

    if-nez v4, :cond_1

    new-instance v4, Ln/u;

    invoke-direct {v4, v9}, Ln/u;-><init>(I)V

    iput-object v4, v0, Landroidx/compose/ui/focus/a;->h:Ln/u;

    :cond_1
    move-object v7, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    mul-int v4, v4, v25

    shl-int/lit8 v25, v4, 0x10

    xor-int v4, v4, v25

    ushr-int/lit8 v8, v4, 0x7

    and-int/lit8 v4, v4, 0x7f

    iget v5, v7, Ln/u;->c:I

    and-int v25, v8, v5

    const/16 v26, 0x0

    :goto_1
    iget-object v14, v7, Ln/u;->a:[J

    shr-int/lit8 v28, v25, 0x3

    and-int/lit8 v29, v25, 0x7

    shl-int/lit8 v10, v29, 0x3

    aget-wide v30, v14, v28

    ushr-long v30, v30, v10

    add-int/lit8 v28, v28, 0x1

    aget-wide v28, v14, v28

    rsub-int/lit8 v11, v10, 0x40

    shl-long v28, v28, v11

    int-to-long v10, v10

    neg-long v10, v10

    shr-long v10, v10, v24

    and-long v10, v28, v10

    or-long v10, v30, v10

    int-to-long v12, v4

    mul-long v30, v12, v22

    move-object/from16 v32, v7

    xor-long v6, v10, v30

    sub-long v30, v6, v22

    not-long v6, v6

    and-long v6, v30, v6

    and-long v6, v6, v20

    :goto_2
    cmp-long v30, v6, v18

    if-eqz v30, :cond_3

    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v30

    shr-int/lit8 v30, v30, 0x3

    add-int v30, v25, v30

    and-int v30, v30, v5

    move-object/from16 v14, v32

    iget-object v9, v14, Ln/u;->b:[J

    aget-wide v33, v9, v30

    cmp-long v9, v33, v2

    if-nez v9, :cond_2

    goto/16 :goto_6

    :cond_2
    sub-long v33, v6, v16

    and-long v6, v6, v33

    move-object/from16 v32, v14

    const/4 v9, 0x3

    goto :goto_2

    :cond_3
    move-object/from16 v14, v32

    not-long v6, v10

    shl-long/2addr v6, v15

    and-long/2addr v6, v10

    and-long v6, v6, v20

    cmp-long v6, v6, v18

    if-eqz v6, :cond_8

    invoke-virtual {v14, v8}, Ln/u;->b(I)I

    move-result v4

    iget v5, v14, Ln/u;->e:I

    if-nez v5, :cond_6

    iget-object v5, v14, Ln/u;->a:[J

    shr-int/lit8 v6, v4, 0x3

    aget-wide v6, v5, v6

    and-int/lit8 v5, v4, 0x7

    const/4 v9, 0x3

    shl-int/2addr v5, v9

    shr-long v5, v6, v5

    const-wide/16 v9, 0xff

    and-long/2addr v5, v9

    const-wide/16 v9, 0xfe

    cmp-long v5, v5, v9

    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    iget v4, v14, Ln/u;->c:I

    const/16 v5, 0x8

    if-le v4, v5, :cond_5

    iget v5, v14, Ln/u;->d:I

    int-to-long v5, v5

    const-wide/16 v9, 0x20

    mul-long/2addr v5, v9

    int-to-long v9, v4

    const-wide/16 v15, 0x19

    mul-long/2addr v9, v15

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v4

    if-gtz v4, :cond_5

    iget v4, v14, Ln/u;->c:I

    invoke-static {v4}, Ln/D;->b(I)I

    move-result v4

    invoke-virtual {v14, v4}, Ln/u;->d(I)V

    goto :goto_3

    :cond_5
    iget v4, v14, Ln/u;->c:I

    invoke-static {v4}, Ln/D;->b(I)I

    move-result v4

    invoke-virtual {v14, v4}, Ln/u;->d(I)V

    :goto_3
    invoke-virtual {v14, v8}, Ln/u;->b(I)I

    move-result v4

    :cond_6
    :goto_4
    move/from16 v30, v4

    iget v4, v14, Ln/u;->d:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v14, Ln/u;->d:I

    iget v4, v14, Ln/u;->e:I

    iget-object v5, v14, Ln/u;->a:[J

    shr-int/lit8 v7, v30, 0x3

    aget-wide v8, v5, v7

    and-int/lit8 v10, v30, 0x7

    const/4 v11, 0x3

    shl-int/2addr v10, v11

    shr-long v15, v8, v10

    const-wide/16 v17, 0xff

    and-long v15, v15, v17

    const-wide/16 v19, 0x80

    cmp-long v11, v15, v19

    if-nez v11, :cond_7

    const/4 v11, 0x1

    goto :goto_5

    :cond_7
    const/4 v11, 0x0

    :goto_5
    sub-int/2addr v4, v11

    iput v4, v14, Ln/u;->e:I

    move v4, v7

    shl-long v6, v17, v10

    not-long v6, v6

    and-long/2addr v6, v8

    shl-long v8, v12, v10

    or-long/2addr v6, v8

    aput-wide v6, v5, v4

    iget v4, v14, Ln/u;->c:I

    add-int/lit8 v6, v30, -0x7

    and-int/2addr v6, v4

    and-int/lit8 v4, v4, 0x7

    add-int/2addr v6, v4

    shr-int/lit8 v4, v6, 0x3

    and-int/lit8 v6, v6, 0x7

    const/4 v7, 0x3

    shl-int/2addr v6, v7

    aget-wide v7, v5, v4

    const-wide/16 v9, 0xff

    shl-long/2addr v9, v6

    not-long v9, v9

    and-long/2addr v7, v9

    shl-long v9, v12, v6

    or-long v6, v7, v9

    aput-wide v6, v5, v4

    :goto_6
    iget-object v4, v14, Ln/u;->b:[J

    aput-wide v2, v4, v30

    goto/16 :goto_a

    :cond_8
    const/16 v6, 0x8

    add-int/lit8 v26, v26, 0x8

    add-int v25, v25, v26

    and-int v25, v25, v5

    move-object v7, v14

    const/4 v6, 0x1

    const/4 v9, 0x3

    goto/16 :goto_1

    :cond_9
    if-ne v4, v6, :cond_e

    iget-object v4, v0, Landroidx/compose/ui/focus/a;->h:Ln/u;

    if-eqz v4, :cond_d

    invoke-virtual {v4, v2, v3}, Ln/u;->a(J)Z

    move-result v4

    if-ne v4, v6, :cond_d

    iget-object v4, v0, Landroidx/compose/ui/focus/a;->h:Ln/u;

    if-eqz v4, :cond_e

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    mul-int v5, v5, v25

    shl-int/lit8 v6, v5, 0x10

    xor-int/2addr v5, v6

    and-int/lit8 v6, v5, 0x7f

    iget v7, v4, Ln/u;->c:I

    ushr-int/lit8 v5, v5, 0x7

    and-int/2addr v5, v7

    const/4 v8, 0x0

    :goto_7
    iget-object v9, v4, Ln/u;->a:[J

    shr-int/lit8 v10, v5, 0x3

    and-int/lit8 v11, v5, 0x7

    const/4 v12, 0x3

    shl-int/2addr v11, v12

    aget-wide v12, v9, v10

    ushr-long/2addr v12, v11

    const/4 v14, 0x1

    add-int/2addr v10, v14

    aget-wide v30, v9, v10

    rsub-int/lit8 v9, v11, 0x40

    shl-long v9, v30, v9

    int-to-long v14, v11

    neg-long v14, v14

    shr-long v14, v14, v24

    and-long/2addr v9, v14

    or-long/2addr v9, v12

    int-to-long v11, v6

    mul-long v11, v11, v22

    xor-long/2addr v11, v9

    sub-long v13, v11, v22

    not-long v11, v11

    and-long/2addr v11, v13

    and-long v11, v11, v20

    :goto_8
    cmp-long v13, v11, v18

    if-eqz v13, :cond_b

    invoke-static {v11, v12}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v13

    const/4 v14, 0x3

    shr-int/2addr v13, v14

    add-int/2addr v13, v5

    and-int/2addr v13, v7

    iget-object v14, v4, Ln/u;->b:[J

    aget-wide v33, v14, v13

    cmp-long v14, v33, v2

    if-nez v14, :cond_a

    goto :goto_9

    :cond_a
    sub-long v13, v11, v16

    and-long/2addr v11, v13

    goto :goto_8

    :cond_b
    not-long v11, v9

    const/4 v13, 0x6

    shl-long/2addr v11, v13

    and-long/2addr v9, v11

    and-long v9, v9, v20

    cmp-long v9, v9, v18

    if-eqz v9, :cond_c

    const/4 v13, -0x1

    :goto_9
    if-ltz v13, :cond_e

    iget v2, v4, Ln/u;->d:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    iput v2, v4, Ln/u;->d:I

    iget-object v2, v4, Ln/u;->a:[J

    shr-int/lit8 v3, v13, 0x3

    and-int/lit8 v5, v13, 0x7

    const/4 v6, 0x3

    shl-int/2addr v5, v6

    aget-wide v6, v2, v3

    const-wide/16 v8, 0xff

    shl-long v10, v8, v5

    not-long v8, v10

    and-long/2addr v6, v8

    const-wide/16 v8, 0xfe

    shl-long v10, v8, v5

    or-long v5, v6, v10

    aput-wide v5, v2, v3

    iget v3, v4, Ln/u;->c:I

    add-int/lit8 v13, v13, -0x7

    and-int v4, v13, v3

    and-int/lit8 v3, v3, 0x7

    add-int/2addr v4, v3

    shr-int/lit8 v3, v4, 0x3

    and-int/lit8 v4, v4, 0x7

    const/4 v9, 0x3

    shl-int/2addr v4, v9

    aget-wide v5, v2, v3

    const-wide/16 v10, 0xff

    shl-long v7, v10, v4

    not-long v7, v7

    and-long/2addr v5, v7

    const-wide/16 v26, 0xfe

    shl-long v7, v26, v4

    or-long v4, v5, v7

    aput-wide v4, v2, v3

    goto :goto_a

    :cond_c
    const/4 v9, 0x3

    const-wide/16 v10, 0xff

    const/16 v12, 0x8

    const-wide/16 v26, 0xfe

    add-int/2addr v8, v12

    add-int/2addr v5, v8

    and-int/2addr v5, v7

    move v15, v13

    goto/16 :goto_7

    :cond_d
    const/4 v1, 0x0

    return v1

    :cond_e
    :goto_a
    iget-object v2, v0, Landroidx/compose/ui/focus/a;->d:LU/q;

    invoke-static {v2}, LU/c;->g(LU/q;)LU/q;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x10

    const-string v6, "visitAncestors called on an unattached node"

    if-eqz v3, :cond_14

    iget-object v7, v3, LP/k;->d:LP/k;

    iget-boolean v8, v7, LP/k;->p:Z

    if-eqz v8, :cond_13

    iget v8, v7, LP/k;->g:I

    and-int/lit16 v8, v8, 0x2400

    if-eqz v8, :cond_11

    iget-object v7, v7, LP/k;->i:LP/k;

    move-object v8, v4

    :goto_b
    if-eqz v7, :cond_12

    iget v9, v7, LP/k;->f:I

    and-int/lit16 v10, v9, 0x2400

    if-eqz v10, :cond_10

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_f

    goto :goto_c

    :cond_f
    move-object v8, v7

    :cond_10
    iget-object v7, v7, LP/k;->i:LP/k;

    goto :goto_b

    :cond_11
    move-object v8, v4

    :cond_12
    :goto_c
    if-nez v8, :cond_30

    goto :goto_d

    :cond_13
    const-string v1, "visitLocalDescendants called on an unattached node"

    invoke-static {v1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v4

    :cond_14
    :goto_d
    if-eqz v3, :cond_22

    iget-object v7, v3, LP/k;->d:LP/k;

    iget-boolean v8, v7, LP/k;->p:Z

    if-eqz v8, :cond_21

    invoke-static {v3}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v3

    :goto_e
    if-eqz v3, :cond_20

    iget-object v8, v3, Ln0/z;->x:LD/s;

    iget-object v8, v8, LD/s;->f:Ljava/lang/Object;

    check-cast v8, LP/k;

    iget v8, v8, LP/k;->g:I

    and-int/lit16 v8, v8, 0x2000

    if-eqz v8, :cond_1e

    :goto_f
    if-eqz v7, :cond_1e

    iget v8, v7, LP/k;->f:I

    and-int/lit16 v8, v8, 0x2000

    if-eqz v8, :cond_1d

    move-object v9, v4

    move-object v8, v7

    :goto_10
    if-eqz v8, :cond_1d

    instance-of v10, v8, Lg0/c;

    if-eqz v10, :cond_15

    goto/16 :goto_13

    :cond_15
    iget v10, v8, LP/k;->f:I

    and-int/lit16 v10, v10, 0x2000

    if-eqz v10, :cond_1c

    instance-of v10, v8, Ln0/i;

    if-eqz v10, :cond_1c

    move-object v10, v8

    check-cast v10, Ln0/i;

    iget-object v10, v10, Ln0/i;->r:LP/k;

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    const/4 v8, 0x0

    :goto_11
    if-eqz v11, :cond_1a

    iget v12, v11, LP/k;->f:I

    and-int/lit16 v12, v12, 0x2000

    if-eqz v12, :cond_19

    add-int/lit8 v8, v8, 0x1

    const/4 v12, 0x1

    if-ne v8, v12, :cond_16

    move-object v9, v11

    goto :goto_12

    :cond_16
    if-nez v10, :cond_17

    new-instance v10, LF/d;

    new-array v12, v5, [LP/k;

    invoke-direct {v10, v12}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_17
    if-eqz v9, :cond_18

    invoke-virtual {v10, v9}, LF/d;->b(Ljava/lang/Object;)V

    move-object v9, v4

    :cond_18
    invoke-virtual {v10, v11}, LF/d;->b(Ljava/lang/Object;)V

    :cond_19
    :goto_12
    iget-object v11, v11, LP/k;->i:LP/k;

    goto :goto_11

    :cond_1a
    const/4 v11, 0x1

    if-ne v8, v11, :cond_1b

    move-object v8, v9

    move-object v9, v10

    goto :goto_10

    :cond_1b
    move-object v9, v10

    :cond_1c
    invoke-static {v9}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v8

    goto :goto_10

    :cond_1d
    iget-object v7, v7, LP/k;->h:LP/k;

    goto :goto_f

    :cond_1e
    invoke-virtual {v3}, Ln0/z;->k()Ln0/z;

    move-result-object v3

    if-eqz v3, :cond_1f

    iget-object v7, v3, Ln0/z;->x:LD/s;

    if-eqz v7, :cond_1f

    iget-object v7, v7, LD/s;->e:Ljava/lang/Object;

    check-cast v7, Ln0/m0;

    goto :goto_e

    :cond_1f
    move-object v7, v4

    goto :goto_e

    :cond_20
    move-object v8, v4

    :goto_13
    check-cast v8, Lg0/c;

    if-eqz v8, :cond_22

    check-cast v8, LP/k;

    iget-object v8, v8, LP/k;->d:LP/k;

    goto/16 :goto_1a

    :cond_21
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_22
    iget-object v3, v2, LP/k;->d:LP/k;

    iget-boolean v7, v3, LP/k;->p:Z

    if-eqz v7, :cond_57

    iget-object v3, v3, LP/k;->h:LP/k;

    invoke-static {v2}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v2

    :goto_14
    if-eqz v2, :cond_2e

    iget-object v7, v2, Ln0/z;->x:LD/s;

    iget-object v7, v7, LD/s;->f:Ljava/lang/Object;

    check-cast v7, LP/k;

    iget v7, v7, LP/k;->g:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_2c

    :goto_15
    if-eqz v3, :cond_2c

    iget v7, v3, LP/k;->f:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_2b

    move-object v7, v3

    move-object v8, v4

    :goto_16
    if-eqz v7, :cond_2b

    instance-of v9, v7, Lg0/c;

    if-eqz v9, :cond_23

    goto/16 :goto_19

    :cond_23
    iget v9, v7, LP/k;->f:I

    and-int/lit16 v9, v9, 0x2000

    if-eqz v9, :cond_2a

    instance-of v9, v7, Ln0/i;

    if-eqz v9, :cond_2a

    move-object v9, v7

    check-cast v9, Ln0/i;

    iget-object v9, v9, Ln0/i;->r:LP/k;

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    const/4 v7, 0x0

    :goto_17
    if-eqz v10, :cond_28

    iget v11, v10, LP/k;->f:I

    and-int/lit16 v11, v11, 0x2000

    if-eqz v11, :cond_27

    add-int/lit8 v7, v7, 0x1

    const/4 v11, 0x1

    if-ne v7, v11, :cond_24

    move-object v8, v10

    goto :goto_18

    :cond_24
    if-nez v9, :cond_25

    new-instance v9, LF/d;

    new-array v11, v5, [LP/k;

    invoke-direct {v9, v11}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_25
    if-eqz v8, :cond_26

    invoke-virtual {v9, v8}, LF/d;->b(Ljava/lang/Object;)V

    move-object v8, v4

    :cond_26
    invoke-virtual {v9, v10}, LF/d;->b(Ljava/lang/Object;)V

    :cond_27
    :goto_18
    iget-object v10, v10, LP/k;->i:LP/k;

    goto :goto_17

    :cond_28
    const/4 v10, 0x1

    if-ne v7, v10, :cond_29

    move-object v7, v8

    move-object v8, v9

    goto :goto_16

    :cond_29
    move-object v8, v9

    :cond_2a
    invoke-static {v8}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v7

    goto :goto_16

    :cond_2b
    iget-object v3, v3, LP/k;->h:LP/k;

    goto :goto_15

    :cond_2c
    invoke-virtual {v2}, Ln0/z;->k()Ln0/z;

    move-result-object v2

    if-eqz v2, :cond_2d

    iget-object v3, v2, Ln0/z;->x:LD/s;

    if-eqz v3, :cond_2d

    iget-object v3, v3, LD/s;->e:Ljava/lang/Object;

    check-cast v3, Ln0/m0;

    goto :goto_14

    :cond_2d
    move-object v3, v4

    goto :goto_14

    :cond_2e
    move-object v7, v4

    :goto_19
    check-cast v7, Lg0/c;

    if-eqz v7, :cond_2f

    check-cast v7, LP/k;

    iget-object v8, v7, LP/k;->d:LP/k;

    goto :goto_1a

    :cond_2f
    move-object v8, v4

    :cond_30
    :goto_1a
    if-eqz v8, :cond_55

    iget-object v2, v8, LP/k;->d:LP/k;

    iget-boolean v3, v2, LP/k;->p:Z

    if-eqz v3, :cond_56

    iget-object v2, v2, LP/k;->h:LP/k;

    invoke-static {v8}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v3

    move-object v6, v4

    :goto_1b
    if-eqz v3, :cond_3d

    iget-object v7, v3, Ln0/z;->x:LD/s;

    iget-object v7, v7, LD/s;->f:Ljava/lang/Object;

    check-cast v7, LP/k;

    iget v7, v7, LP/k;->g:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_3b

    :goto_1c
    if-eqz v2, :cond_3b

    iget v7, v2, LP/k;->f:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_3a

    move-object v7, v2

    move-object v9, v4

    :goto_1d
    if-eqz v7, :cond_3a

    instance-of v10, v7, Lg0/c;

    if-eqz v10, :cond_32

    if-nez v6, :cond_31

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :cond_31
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_20

    :cond_32
    iget v10, v7, LP/k;->f:I

    and-int/lit16 v10, v10, 0x2000

    if-eqz v10, :cond_39

    instance-of v10, v7, Ln0/i;

    if-eqz v10, :cond_39

    move-object v10, v7

    check-cast v10, Ln0/i;

    iget-object v10, v10, Ln0/i;->r:LP/k;

    move-object v11, v10

    move-object v10, v9

    move-object v9, v7

    const/4 v7, 0x0

    :goto_1e
    if-eqz v11, :cond_37

    iget v12, v11, LP/k;->f:I

    and-int/lit16 v12, v12, 0x2000

    if-eqz v12, :cond_36

    add-int/lit8 v7, v7, 0x1

    const/4 v12, 0x1

    if-ne v7, v12, :cond_33

    move-object v9, v11

    goto :goto_1f

    :cond_33
    if-nez v10, :cond_34

    new-instance v10, LF/d;

    new-array v12, v5, [LP/k;

    invoke-direct {v10, v12}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_34
    if-eqz v9, :cond_35

    invoke-virtual {v10, v9}, LF/d;->b(Ljava/lang/Object;)V

    move-object v9, v4

    :cond_35
    invoke-virtual {v10, v11}, LF/d;->b(Ljava/lang/Object;)V

    :cond_36
    :goto_1f
    iget-object v11, v11, LP/k;->i:LP/k;

    goto :goto_1e

    :cond_37
    const/4 v11, 0x1

    if-ne v7, v11, :cond_38

    move-object v7, v9

    move-object v9, v10

    goto :goto_1d

    :cond_38
    move-object v9, v10

    :cond_39
    :goto_20
    invoke-static {v9}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v7

    goto :goto_1d

    :cond_3a
    iget-object v2, v2, LP/k;->h:LP/k;

    goto :goto_1c

    :cond_3b
    invoke-virtual {v3}, Ln0/z;->k()Ln0/z;

    move-result-object v3

    if-eqz v3, :cond_3c

    iget-object v2, v3, Ln0/z;->x:LD/s;

    if-eqz v2, :cond_3c

    iget-object v2, v2, LD/s;->e:Ljava/lang/Object;

    check-cast v2, Ln0/m0;

    goto :goto_1b

    :cond_3c
    move-object v2, v4

    goto :goto_1b

    :cond_3d
    if-eqz v6, :cond_40

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, -0x1

    add-int/2addr v2, v3

    if-ltz v2, :cond_40

    :goto_21
    add-int/lit8 v3, v2, -0x1

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/c;

    invoke-interface {v2, v1}, Lg0/c;->d(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_3e

    const/4 v2, 0x1

    return v2

    :cond_3e
    if-gez v3, :cond_3f

    goto :goto_22

    :cond_3f
    move v2, v3

    goto :goto_21

    :cond_40
    :goto_22
    iget-object v2, v8, LP/k;->d:LP/k;

    move-object v3, v4

    :goto_23
    if-eqz v2, :cond_49

    instance-of v7, v2, Lg0/c;

    if-eqz v7, :cond_41

    check-cast v2, Lg0/c;

    invoke-interface {v2, v1}, Lg0/c;->d(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_48

    const/4 v2, 0x1

    return v2

    :cond_41
    iget v7, v2, LP/k;->f:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_48

    instance-of v7, v2, Ln0/i;

    if-eqz v7, :cond_48

    move-object v7, v2

    check-cast v7, Ln0/i;

    iget-object v7, v7, Ln0/i;->r:LP/k;

    move-object v9, v7

    move-object v7, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_24
    if-eqz v9, :cond_46

    iget v10, v9, LP/k;->f:I

    and-int/lit16 v10, v10, 0x2000

    if-eqz v10, :cond_45

    add-int/lit8 v2, v2, 0x1

    const/4 v10, 0x1

    if-ne v2, v10, :cond_42

    move-object v3, v9

    goto :goto_25

    :cond_42
    if-nez v7, :cond_43

    new-instance v7, LF/d;

    new-array v10, v5, [LP/k;

    invoke-direct {v7, v10}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_43
    if-eqz v3, :cond_44

    invoke-virtual {v7, v3}, LF/d;->b(Ljava/lang/Object;)V

    move-object v3, v4

    :cond_44
    invoke-virtual {v7, v9}, LF/d;->b(Ljava/lang/Object;)V

    :cond_45
    :goto_25
    iget-object v9, v9, LP/k;->i:LP/k;

    goto :goto_24

    :cond_46
    const/4 v9, 0x1

    if-ne v2, v9, :cond_47

    move-object v2, v3

    move-object v3, v7

    goto :goto_23

    :cond_47
    move-object v3, v7

    :cond_48
    invoke-static {v3}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v2

    goto :goto_23

    :cond_49
    invoke-interface/range {p2 .. p2}, Lo2/a;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4a

    const/4 v2, 0x1

    return v2

    :cond_4a
    const/4 v2, 0x1

    iget-object v3, v8, LP/k;->d:LP/k;

    move-object v7, v4

    :goto_26
    if-eqz v3, :cond_53

    instance-of v8, v3, Lg0/c;

    if-eqz v8, :cond_4b

    check-cast v3, Lg0/c;

    invoke-interface {v3, v1}, Lg0/c;->g(Landroid/view/KeyEvent;)Z

    move-result v3

    if-eqz v3, :cond_52

    return v2

    :cond_4b
    iget v2, v3, LP/k;->f:I

    and-int/lit16 v2, v2, 0x2000

    if-eqz v2, :cond_52

    instance-of v2, v3, Ln0/i;

    if-eqz v2, :cond_52

    move-object v2, v3

    check-cast v2, Ln0/i;

    iget-object v2, v2, Ln0/i;->r:LP/k;

    move-object v8, v7

    move-object v7, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_27
    if-eqz v3, :cond_50

    iget v9, v3, LP/k;->f:I

    and-int/lit16 v9, v9, 0x2000

    if-eqz v9, :cond_4f

    add-int/lit8 v2, v2, 0x1

    const/4 v9, 0x1

    if-ne v2, v9, :cond_4c

    move-object v7, v3

    goto :goto_28

    :cond_4c
    if-nez v8, :cond_4d

    new-instance v8, LF/d;

    new-array v9, v5, [LP/k;

    invoke-direct {v8, v9}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_4d
    if-eqz v7, :cond_4e

    invoke-virtual {v8, v7}, LF/d;->b(Ljava/lang/Object;)V

    move-object v7, v4

    :cond_4e
    invoke-virtual {v8, v3}, LF/d;->b(Ljava/lang/Object;)V

    :cond_4f
    :goto_28
    iget-object v3, v3, LP/k;->i:LP/k;

    goto :goto_27

    :cond_50
    const/4 v3, 0x1

    if-ne v2, v3, :cond_51

    move v2, v3

    move-object v3, v7

    move-object v7, v8

    goto :goto_26

    :cond_51
    move-object v7, v8

    :cond_52
    invoke-static {v7}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v3

    const/4 v2, 0x1

    goto :goto_26

    :cond_53
    if-eqz v6, :cond_55

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_29
    if-ge v3, v2, :cond_55

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg0/c;

    invoke-interface {v4, v1}, Lg0/c;->g(Landroid/view/KeyEvent;)Z

    move-result v4

    if-eqz v4, :cond_54

    const/4 v4, 0x1

    return v4

    :cond_54
    const/4 v4, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_29

    :cond_55
    const/4 v1, 0x0

    goto :goto_2a

    :cond_56
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_2a
    return v1

    :cond_57
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_58
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Dispatching key event while focus system is invalidated."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c(ILV/d;Lo2/c;)Ljava/lang/Boolean;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v0, Landroidx/compose/ui/focus/a;->d:LU/q;

    invoke-static {v4}, LU/c;->g(LU/q;)LU/q;

    move-result-object v5

    iget-object v6, v0, Landroidx/compose/ui/focus/a;->c:Lo0/p;

    const/16 v9, 0x8

    const/4 v10, 0x7

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x2

    const/4 v8, 0x1

    const/16 v16, 0x0

    if-eqz v5, :cond_25

    invoke-virtual {v6}, Lo0/p;->g()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, LG0/f;

    invoke-virtual {v5}, LU/q;->f0()LU/j;

    move-result-object v7

    invoke-static {v1, v8}, LU/a;->a(II)Z

    move-result v18

    if-eqz v18, :cond_0

    iget-object v7, v7, LU/j;->b:LU/n;

    goto/16 :goto_2

    :cond_0
    invoke-static {v1, v15}, LU/a;->a(II)Z

    move-result v18

    if-eqz v18, :cond_1

    iget-object v7, v7, LU/j;->c:LU/n;

    goto/16 :goto_2

    :cond_1
    invoke-static {v1, v14}, LU/a;->a(II)Z

    move-result v18

    if-eqz v18, :cond_2

    iget-object v7, v7, LU/j;->d:LU/n;

    goto/16 :goto_2

    :cond_2
    invoke-static {v1, v13}, LU/a;->a(II)Z

    move-result v18

    if-eqz v18, :cond_3

    iget-object v7, v7, LU/j;->e:LU/n;

    goto/16 :goto_2

    :cond_3
    invoke-static {v1, v12}, LU/a;->a(II)Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_5

    if-ne v13, v8, :cond_4

    iget-object v13, v7, LU/j;->i:LU/n;

    goto :goto_0

    :cond_4
    new-instance v1, LB1/c;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_5
    iget-object v13, v7, LU/j;->h:LU/n;

    :goto_0
    sget-object v14, LU/n;->b:LU/n;

    if-ne v13, v14, :cond_6

    move-object/from16 v13, v16

    :cond_6
    if-nez v13, :cond_7

    iget-object v7, v7, LU/j;->f:LU/n;

    goto :goto_2

    :cond_7
    move-object v7, v13

    goto :goto_2

    :cond_8
    invoke-static {v1, v11}, LU/a;->a(II)Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    if-eqz v13, :cond_a

    if-ne v13, v8, :cond_9

    iget-object v13, v7, LU/j;->h:LU/n;

    goto :goto_1

    :cond_9
    new-instance v1, LB1/c;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_a
    iget-object v13, v7, LU/j;->i:LU/n;

    :goto_1
    sget-object v14, LU/n;->b:LU/n;

    if-ne v13, v14, :cond_b

    move-object/from16 v13, v16

    :cond_b
    if-nez v13, :cond_7

    iget-object v7, v7, LU/j;->g:LU/n;

    goto :goto_2

    :cond_c
    invoke-static {v1, v10}, LU/a;->a(II)Z

    move-result v13

    if-eqz v13, :cond_d

    iget-object v7, v7, LU/j;->j:LU/h;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, LU/n;->b:LU/n;

    goto :goto_2

    :cond_d
    invoke-static {v1, v9}, LU/a;->a(II)Z

    move-result v13

    if-eqz v13, :cond_24

    iget-object v7, v7, LU/j;->k:LU/h;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, LU/n;->b:LU/n;

    :goto_2
    sget-object v13, LU/n;->c:LU/n;

    invoke-static {v7, v13}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    return-object v16

    :cond_e
    sget-object v14, LU/n;->b:LU/n;

    invoke-static {v7, v14}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_26

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    if-eq v7, v14, :cond_23

    if-eq v7, v13, :cond_22

    iget-object v1, v7, LU/n;->a:LF/d;

    invoke-virtual {v1}, LF/d;->k()Z

    move-result v2

    if-eqz v2, :cond_21

    iget v2, v1, LF/d;->f:I

    if-lez v2, :cond_20

    iget-object v1, v1, LF/d;->d:[Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_f
    aget-object v6, v1, v4

    check-cast v6, LU/o;

    check-cast v6, LP/k;

    iget-object v6, v6, LP/k;->d:LP/k;

    iget-boolean v7, v6, LP/k;->p:Z

    if-eqz v7, :cond_1f

    new-instance v7, LF/d;

    const/16 v9, 0x10

    new-array v11, v9, [LP/k;

    invoke-direct {v7, v11}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v9, v6, LP/k;->i:LP/k;

    if-nez v9, :cond_10

    invoke-static {v7, v6}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_3

    :cond_10
    invoke-virtual {v7, v9}, LF/d;->b(Ljava/lang/Object;)V

    :cond_11
    :goto_3
    invoke-virtual {v7}, LF/d;->k()Z

    move-result v6

    if-eqz v6, :cond_1e

    iget v6, v7, LF/d;->f:I

    sub-int/2addr v6, v8

    invoke-virtual {v7, v6}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LP/k;

    iget v9, v6, LP/k;->g:I

    and-int/lit16 v9, v9, 0x400

    if-nez v9, :cond_12

    invoke-static {v7, v6}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_3

    :cond_12
    :goto_4
    if-eqz v6, :cond_11

    iget v9, v6, LP/k;->f:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_1d

    move-object/from16 v9, v16

    :goto_5
    if-eqz v6, :cond_11

    instance-of v11, v6, LU/q;

    if-eqz v11, :cond_14

    check-cast v6, LU/q;

    invoke-virtual {v6}, LU/q;->f0()LU/j;

    move-result-object v11

    iget-boolean v11, v11, LU/j;->a:Z

    if-eqz v11, :cond_13

    invoke-interface {v3, v6}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_6

    :cond_13
    invoke-static {v6, v10, v3}, LU/c;->i(LU/q;ILo2/c;)Z

    move-result v6

    :goto_6
    if-eqz v6, :cond_1c

    move v5, v8

    goto :goto_b

    :cond_14
    iget v11, v6, LP/k;->f:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_15

    move v11, v8

    goto :goto_7

    :cond_15
    const/4 v11, 0x0

    :goto_7
    if-eqz v11, :cond_1c

    instance-of v11, v6, Ln0/i;

    if-eqz v11, :cond_1c

    move-object v11, v6

    check-cast v11, Ln0/i;

    iget-object v11, v11, Ln0/i;->r:LP/k;

    const/4 v12, 0x0

    :goto_8
    if-eqz v11, :cond_1b

    iget v13, v11, LP/k;->f:I

    and-int/lit16 v13, v13, 0x400

    if-eqz v13, :cond_16

    move v13, v8

    goto :goto_9

    :cond_16
    const/4 v13, 0x0

    :goto_9
    if-eqz v13, :cond_1a

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v8, :cond_17

    move-object v6, v11

    goto :goto_a

    :cond_17
    if-nez v9, :cond_18

    new-instance v9, LF/d;

    const/16 v13, 0x10

    new-array v14, v13, [LP/k;

    invoke-direct {v9, v14}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_18
    if-eqz v6, :cond_19

    invoke-virtual {v9, v6}, LF/d;->b(Ljava/lang/Object;)V

    move-object/from16 v6, v16

    :cond_19
    invoke-virtual {v9, v11}, LF/d;->b(Ljava/lang/Object;)V

    :cond_1a
    :goto_a
    iget-object v11, v11, LP/k;->i:LP/k;

    goto :goto_8

    :cond_1b
    if-ne v12, v8, :cond_1c

    goto :goto_5

    :cond_1c
    invoke-static {v9}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v6

    goto :goto_5

    :cond_1d
    iget-object v6, v6, LP/k;->i:LP/k;

    goto :goto_4

    :cond_1e
    :goto_b
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v2, :cond_f

    move v8, v5

    goto :goto_c

    :cond_1f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "visitChildren called on an unattached node"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    const/4 v8, 0x0

    :goto_c
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :cond_21
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_22
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_23
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_24
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "invalid FocusDirection"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_25
    move-object/from16 v5, v16

    :cond_26
    invoke-virtual {v6}, Lo0/p;->g()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LG0/f;

    new-instance v7, LD2/p;

    invoke-direct {v7, v5, v0, v3}, LD2/p;-><init>(LU/q;Landroidx/compose/ui/focus/a;Lo2/c;)V

    invoke-static {v1, v8}, LU/a;->a(II)Z

    move-result v3

    if-eqz v3, :cond_27

    move v3, v8

    goto :goto_d

    :cond_27
    invoke-static {v1, v15}, LU/a;->a(II)Z

    move-result v3

    :goto_d
    if-eqz v3, :cond_2a

    invoke-static {v1, v8}, LU/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-static {v4, v7}, LU/c;->k(LU/q;LD2/p;)Z

    move-result v1

    goto :goto_e

    :cond_28
    invoke-static {v1, v15}, LU/a;->a(II)Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-static {v4, v7}, LU/c;->a(LU/q;LD2/p;)Z

    move-result v1

    :goto_e
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    goto/16 :goto_1e

    :cond_29
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "This function should only be used for 1-D focus search"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2a
    invoke-static {v1, v12}, LU/a;->a(II)Z

    move-result v3

    if-eqz v3, :cond_2b

    move v3, v8

    goto :goto_f

    :cond_2b
    invoke-static {v1, v11}, LU/a;->a(II)Z

    move-result v3

    :goto_f
    if-eqz v3, :cond_2c

    move v3, v8

    goto :goto_10

    :cond_2c
    const/4 v3, 0x5

    invoke-static {v1, v3}, LU/a;->a(II)Z

    move-result v3

    :goto_10
    if-eqz v3, :cond_2d

    move v3, v8

    goto :goto_11

    :cond_2d
    const/4 v3, 0x6

    invoke-static {v1, v3}, LU/a;->a(II)Z

    move-result v3

    :goto_11
    if-eqz v3, :cond_2e

    invoke-static {v1, v7, v4, v2}, LU/c;->J(ILD2/p;LU/q;LV/d;)Ljava/lang/Boolean;

    move-result-object v16

    goto/16 :goto_1e

    :cond_2e
    invoke-static {v1, v10}, LU/a;->a(II)Z

    move-result v3

    if-eqz v3, :cond_31

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_30

    if-ne v1, v8, :cond_2f

    move v11, v12

    goto :goto_12

    :cond_2f
    new-instance v1, LB1/c;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_30
    :goto_12
    invoke-static {v4}, LU/c;->g(LU/q;)LU/q;

    move-result-object v1

    if-eqz v1, :cond_41

    invoke-static {v11, v7, v1, v2}, LU/c;->J(ILD2/p;LU/q;LV/d;)Ljava/lang/Boolean;

    move-result-object v16

    goto/16 :goto_1e

    :cond_31
    invoke-static {v1, v9}, LU/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_42

    invoke-static {v4}, LU/c;->g(LU/q;)LU/q;

    move-result-object v1

    if-eqz v1, :cond_3d

    iget-object v2, v1, LP/k;->d:LP/k;

    iget-boolean v3, v2, LP/k;->p:Z

    if-eqz v3, :cond_3e

    iget-object v2, v2, LP/k;->h:LP/k;

    invoke-static {v1}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object v1

    :goto_13
    if-eqz v1, :cond_3d

    iget-object v3, v1, Ln0/z;->x:LD/s;

    iget-object v3, v3, LD/s;->f:Ljava/lang/Object;

    check-cast v3, LP/k;

    iget v3, v3, LP/k;->g:I

    and-int/lit16 v3, v3, 0x400

    if-eqz v3, :cond_3b

    :goto_14
    if-eqz v2, :cond_3b

    iget v3, v2, LP/k;->f:I

    and-int/lit16 v3, v3, 0x400

    if-eqz v3, :cond_3a

    move-object v3, v2

    move-object/from16 v5, v16

    :goto_15
    if-eqz v3, :cond_3a

    instance-of v6, v3, LU/q;

    if-eqz v6, :cond_33

    check-cast v3, LU/q;

    invoke-virtual {v3}, LU/q;->f0()LU/j;

    move-result-object v6

    iget-boolean v6, v6, LU/j;->a:Z

    if-eqz v6, :cond_32

    move-object/from16 v16, v3

    goto/16 :goto_1a

    :cond_32
    const/16 v10, 0x10

    goto :goto_19

    :cond_33
    iget v6, v3, LP/k;->f:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_32

    instance-of v6, v3, Ln0/i;

    if-eqz v6, :cond_32

    move-object v6, v3

    check-cast v6, Ln0/i;

    iget-object v6, v6, Ln0/i;->r:LP/k;

    const/4 v9, 0x0

    :goto_16
    if-eqz v6, :cond_38

    iget v10, v6, LP/k;->f:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_34

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v8, :cond_35

    move-object v3, v6

    :cond_34
    const/16 v10, 0x10

    goto :goto_18

    :cond_35
    if-nez v5, :cond_36

    new-instance v5, LF/d;

    const/16 v10, 0x10

    new-array v11, v10, [LP/k;

    invoke-direct {v5, v11}, LF/d;-><init>([Ljava/lang/Object;)V

    goto :goto_17

    :cond_36
    const/16 v10, 0x10

    :goto_17
    if-eqz v3, :cond_37

    invoke-virtual {v5, v3}, LF/d;->b(Ljava/lang/Object;)V

    move-object/from16 v3, v16

    :cond_37
    invoke-virtual {v5, v6}, LF/d;->b(Ljava/lang/Object;)V

    :goto_18
    iget-object v6, v6, LP/k;->i:LP/k;

    goto :goto_16

    :cond_38
    const/16 v10, 0x10

    if-ne v9, v8, :cond_39

    goto :goto_15

    :cond_39
    :goto_19
    invoke-static {v5}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v3

    goto :goto_15

    :cond_3a
    const/16 v10, 0x10

    iget-object v2, v2, LP/k;->h:LP/k;

    goto :goto_14

    :cond_3b
    const/16 v10, 0x10

    invoke-virtual {v1}, Ln0/z;->k()Ln0/z;

    move-result-object v1

    if-eqz v1, :cond_3c

    iget-object v2, v1, Ln0/z;->x:LD/s;

    if-eqz v2, :cond_3c

    iget-object v2, v2, LD/s;->e:Ljava/lang/Object;

    check-cast v2, Ln0/m0;

    goto/16 :goto_13

    :cond_3c
    move-object/from16 v2, v16

    goto/16 :goto_13

    :cond_3d
    :goto_1a
    move-object/from16 v1, v16

    goto :goto_1b

    :cond_3e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "visitAncestors called on an unattached node"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_1b
    if-eqz v1, :cond_40

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3f

    goto :goto_1c

    :cond_3f
    invoke-virtual {v7, v1}, LD2/p;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_1d

    :cond_40
    :goto_1c
    const/4 v8, 0x0

    :goto_1d
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    :cond_41
    :goto_1e
    return-object v16

    :cond_42
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Focus search invoked with invalid FocusDirection "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, LU/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
