.class public final LD/q0;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    iput p2, p0, LD/q0;->e:I

    iput-object p1, p0, LD/q0;->f:Ljava/lang/Object;

    iput-object p3, p0, LD/q0;->g:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 14

    iget v0, p0, LD/q0;->e:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ll0/m;->a:LD/H;

    iget-object v1, p0, LD/q0;->g:Ljava/lang/Object;

    check-cast v1, Lq/v;

    invoke-static {v1, v0}, Ln0/C;->h(Ln0/g;LD/k0;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LD/q0;->f:Ljava/lang/Object;

    check-cast v1, Lp2/o;

    iput-object v0, v1, Lp2/o;->d:Ljava/lang/Object;

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LD/q0;->f:Ljava/lang/Object;

    check-cast v0, Lo0/u;

    iget-object v1, p0, LD/q0;->g:Ljava/lang/Object;

    check-cast v1, Landroid/view/KeyEvent;

    invoke-static {v0, v1}, Lo0/u;->e(Lo0/u;Landroid/view/KeyEvent;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, LD/q0;->f:Ljava/lang/Object;

    check-cast v0, Ln0/i0;

    iget-object v0, v0, Ln0/i0;->d:LM1/j;

    invoke-virtual {v0}, LM1/j;->d()Lo2/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LD/q0;->g:Ljava/lang/Object;

    check-cast v1, Ln0/L;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ln0/K;

    invoke-direct {v2, v1}, Ln0/K;-><init>(Ln0/L;)V

    invoke-interface {v0, v2}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_2
    iget-object v0, p0, LD/q0;->f:Ljava/lang/Object;

    check-cast v0, Ln0/I;

    invoke-virtual {v0}, Ln0/I;->a()Ln0/Y;

    move-result-object v1

    iget-object v1, v1, Ln0/Y;->p:Ln0/Y;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ln0/L;->k:Ll0/h;

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, v0, Ln0/I;->a:Ln0/z;

    invoke-static {v1}, Ln0/C;->s(Ln0/z;)Ln0/e0;

    move-result-object v1

    check-cast v1, Lo0/u;

    invoke-virtual {v1}, Lo0/u;->getPlacementScope()Ll0/n;

    move-result-object v1

    :cond_2
    iget-object v2, p0, LD/q0;->g:Ljava/lang/Object;

    check-cast v2, Ln0/G;

    iget-object v3, v2, Ln0/G;->C:Lo2/c;

    if-nez v3, :cond_3

    invoke-virtual {v0}, Ln0/I;->a()Ln0/Y;

    move-result-object v0

    iget-wide v3, v2, Ln0/G;->D:J

    iget v2, v2, Ln0/G;->E:F

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v0}, Ll0/n;->a(Ll0/n;Ll0/o;)V

    iget-wide v5, v0, Ll0/o;->h:J

    invoke-static {v3, v4, v5, v6}, La/a;->X(JJ)J

    move-result-wide v3

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v4, v2, v1}, Ll0/o;->G(JFLo2/c;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ln0/I;->a()Ln0/Y;

    move-result-object v0

    iget-wide v4, v2, Ln0/G;->D:J

    iget v2, v2, Ln0/G;->E:F

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v0}, Ll0/n;->a(Ll0/n;Ll0/o;)V

    iget-wide v6, v0, Ll0/o;->h:J

    invoke-static {v4, v5, v6, v7}, La/a;->X(JJ)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5, v2, v3}, Ll0/o;->G(JFLo2/c;)V

    :goto_0
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_3
    iget-object v0, p0, LD/q0;->f:Ljava/lang/Object;

    check-cast v0, Ln0/z;

    iget-object v0, v0, Ln0/z;->x:LD/s;

    iget-object v1, v0, LD/s;->f:Ljava/lang/Object;

    check-cast v1, LP/k;

    iget v1, v1, LP/k;->g:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_e

    iget-object v0, v0, LD/s;->e:Ljava/lang/Object;

    check-cast v0, Ln0/m0;

    :goto_1
    if-eqz v0, :cond_e

    iget v1, v0, LP/k;->f:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    move-object v2, v0

    move-object v3, v1

    :goto_2
    if-eqz v2, :cond_d

    instance-of v4, v2, Ln0/l0;

    const/4 v5, 0x1

    if-eqz v4, :cond_6

    check-cast v2, Ln0/l0;

    invoke-interface {v2}, Ln0/l0;->D()Z

    move-result v4

    iget-object v6, p0, LD/q0;->g:Ljava/lang/Object;

    check-cast v6, Lp2/o;

    if-eqz v4, :cond_4

    new-instance v4, Lt0/g;

    invoke-direct {v4}, Lt0/g;-><init>()V

    iput-object v4, v6, Lp2/o;->d:Ljava/lang/Object;

    iput-boolean v5, v4, Lt0/g;->f:Z

    :cond_4
    invoke-interface {v2}, Ln0/l0;->G()Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v6, Lp2/o;->d:Ljava/lang/Object;

    check-cast v4, Lt0/g;

    iput-boolean v5, v4, Lt0/g;->e:Z

    :cond_5
    iget-object v4, v6, Lp2/o;->d:Ljava/lang/Object;

    check-cast v4, Lt0/g;

    invoke-interface {v2, v4}, Ln0/l0;->A(Lt0/g;)V

    goto :goto_5

    :cond_6
    iget v4, v2, LP/k;->f:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_c

    instance-of v4, v2, Ln0/i;

    if-eqz v4, :cond_c

    move-object v4, v2

    check-cast v4, Ln0/i;

    iget-object v4, v4, Ln0/i;->r:LP/k;

    const/4 v6, 0x0

    :goto_3
    if-eqz v4, :cond_b

    iget v7, v4, LP/k;->f:I

    and-int/lit8 v7, v7, 0x8

    if-eqz v7, :cond_a

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v5, :cond_7

    move-object v2, v4

    goto :goto_4

    :cond_7
    if-nez v3, :cond_8

    new-instance v3, LF/d;

    const/16 v7, 0x10

    new-array v7, v7, [LP/k;

    invoke-direct {v3, v7}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_8
    if-eqz v2, :cond_9

    invoke-virtual {v3, v2}, LF/d;->b(Ljava/lang/Object;)V

    move-object v2, v1

    :cond_9
    invoke-virtual {v3, v4}, LF/d;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_4
    iget-object v4, v4, LP/k;->i:LP/k;

    goto :goto_3

    :cond_b
    if-ne v6, v5, :cond_c

    goto :goto_2

    :cond_c
    :goto_5
    invoke-static {v3}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v2

    goto :goto_2

    :cond_d
    iget-object v0, v0, LP/k;->h:LP/k;

    goto :goto_1

    :cond_e
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_4
    iget-object v0, p0, LD/q0;->g:Ljava/lang/Object;

    check-cast v0, LU/q;

    invoke-virtual {v0}, LU/q;->f0()LU/j;

    move-result-object v0

    iget-object v1, p0, LD/q0;->f:Ljava/lang/Object;

    check-cast v1, Lp2/o;

    iput-object v0, v1, Lp2/o;->d:Ljava/lang/Object;

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_5
    iget-object v0, p0, LD/q0;->f:Ljava/lang/Object;

    check-cast v0, Ln/B;

    iget-object v1, v0, Ln/B;->b:[Ljava/lang/Object;

    iget-object v0, v0, Ln/B;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_12

    const/4 v3, 0x0

    move v4, v3

    :goto_6
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_11

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_7
    if-ge v9, v7, :cond_10

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_f

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    iget-object v11, p0, LD/q0;->g:Ljava/lang/Object;

    check-cast v11, LD/t;

    invoke-virtual {v11, v10}, LD/t;->u(Ljava/lang/Object;)V

    :cond_f
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_10
    if-ne v7, v8, :cond_12

    :cond_11
    if-eq v4, v2, :cond_12

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_12
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
