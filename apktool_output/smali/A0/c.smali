.class public final LA0/c;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA0/c;->e:I

    iput-object p2, p0, LA0/c;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LW/D;J)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, LA0/c;->e:I

    .line 2
    iput-object p1, p0, LA0/c;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lo0/z0;Lo0/E;)V
    .locals 0

    const/16 p2, 0xf

    iput p2, p0, LA0/c;->e:I

    .line 3
    iput-object p1, p0, LA0/c;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    iget v0, v1, LA0/c;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, LD/Z;

    invoke-interface {v0}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/h;

    return-object v0

    :pswitch_0
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Lz/b;

    invoke-static {v0}, Ln0/C;->k(Ln0/k;)V

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_1
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Lz/a;

    iget-object v2, v0, Lz/a;->m:LD/f0;

    invoke-virtual {v2}, LD/f0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v0, v0, Lz/a;->m:LD/f0;

    invoke-virtual {v0, v2}, LD/f0;->setValue(Ljava/lang/Object;)V

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_2
    const/4 v0, 0x0

    iget-object v2, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v2, Lx/m;

    iput-object v0, v2, Lx/m;->B:Lx/k;

    invoke-static {v2}, Ln0/C;->m(Ln0/l0;)V

    invoke-static {v2}, Ln0/C;->l(Ln0/s;)V

    invoke-static {v2}, Ln0/C;->k(Ln0/k;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_3
    const/4 v0, 0x0

    iget-object v2, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v2, Lx/j;

    iput-object v0, v2, Lx/j;->F:Lx/h;

    invoke-static {v2}, Ln0/C;->m(Ln0/l0;)V

    invoke-static {v2}, Ln0/C;->l(Ln0/s;)V

    invoke-static {v2}, Ln0/C;->k(Ln0/k;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_4
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    return-object v0

    :pswitch_5
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Lq/u;

    iget-object v2, v0, LP/k;->d:LP/k;

    const/4 v3, 0x0

    move-object v4, v3

    :goto_0
    sget-object v5, LU/h;->i:LU/h;

    const/4 v6, 0x1

    const/4 v7, 0x7

    const/16 v8, 0x10

    const/4 v9, 0x0

    if-eqz v2, :cond_8

    instance-of v10, v2, LU/q;

    if-eqz v10, :cond_1

    check-cast v2, LU/q;

    invoke-virtual {v2}, LU/q;->f0()LU/j;

    move-result-object v0

    iget-boolean v0, v0, LU/j;->a:Z

    if-eqz v0, :cond_0

    invoke-static {v2}, LU/c;->B(LU/q;)Z

    move-result v0

    :goto_1
    move v9, v0

    goto/16 :goto_9

    :cond_0
    invoke-static {v2, v7, v5}, LU/c;->i(LU/q;ILo2/c;)Z

    move-result v0

    goto :goto_1

    :cond_1
    iget v5, v2, LP/k;->f:I

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_7

    instance-of v5, v2, Ln0/i;

    if-eqz v5, :cond_7

    move-object v5, v2

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    :goto_2
    if-eqz v5, :cond_6

    iget v7, v5, LP/k;->f:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_5

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v6, :cond_2

    move-object v2, v5

    goto :goto_3

    :cond_2
    if-nez v4, :cond_3

    new-instance v4, LF/d;

    new-array v7, v8, [LP/k;

    invoke-direct {v4, v7}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v4, v2}, LF/d;->b(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_4
    invoke-virtual {v4, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_3
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_2

    :cond_6
    if-ne v9, v6, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v2

    goto :goto_0

    :cond_8
    iget-object v0, v0, LP/k;->d:LP/k;

    iget-boolean v2, v0, LP/k;->p:Z

    if-eqz v2, :cond_16

    new-instance v2, LF/d;

    new-array v4, v8, [LP/k;

    invoke-direct {v2, v4}, LF/d;-><init>([Ljava/lang/Object;)V

    iget-object v4, v0, LP/k;->i:LP/k;

    if-nez v4, :cond_9

    invoke-static {v2, v0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v2, v4}, LF/d;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_4
    invoke-virtual {v2}, LF/d;->k()Z

    move-result v0

    if-eqz v0, :cond_15

    iget v0, v2, LF/d;->f:I

    sub-int/2addr v0, v6

    invoke-virtual {v2, v0}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP/k;

    iget v4, v0, LP/k;->g:I

    and-int/lit16 v4, v4, 0x400

    if-nez v4, :cond_b

    invoke-static {v2, v0}, Ln0/C;->b(LF/d;LP/k;)V

    goto :goto_4

    :cond_b
    :goto_5
    if-eqz v0, :cond_a

    iget v4, v0, LP/k;->f:I

    and-int/lit16 v4, v4, 0x400

    if-eqz v4, :cond_14

    move-object v4, v3

    :goto_6
    if-eqz v0, :cond_a

    instance-of v10, v0, LU/q;

    if-eqz v10, :cond_d

    check-cast v0, LU/q;

    invoke-virtual {v0}, LU/q;->f0()LU/j;

    move-result-object v2

    iget-boolean v2, v2, LU/j;->a:Z

    if-eqz v2, :cond_c

    invoke-static {v0}, LU/c;->B(LU/q;)Z

    move-result v0

    goto/16 :goto_1

    :cond_c
    invoke-static {v0, v7, v5}, LU/c;->i(LU/q;ILo2/c;)Z

    move-result v0

    goto/16 :goto_1

    :cond_d
    iget v10, v0, LP/k;->f:I

    and-int/lit16 v10, v10, 0x400

    if-eqz v10, :cond_13

    instance-of v10, v0, Ln0/i;

    if-eqz v10, :cond_13

    move-object v10, v0

    check-cast v10, Ln0/i;

    iget-object v10, v10, Ln0/i;->r:LP/k;

    move v11, v9

    :goto_7
    if-eqz v10, :cond_12

    iget v12, v10, LP/k;->f:I

    and-int/lit16 v12, v12, 0x400

    if-eqz v12, :cond_11

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v6, :cond_e

    move-object v0, v10

    goto :goto_8

    :cond_e
    if-nez v4, :cond_f

    new-instance v4, LF/d;

    new-array v12, v8, [LP/k;

    invoke-direct {v4, v12}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_f
    if-eqz v0, :cond_10

    invoke-virtual {v4, v0}, LF/d;->b(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_10
    invoke-virtual {v4, v10}, LF/d;->b(Ljava/lang/Object;)V

    :cond_11
    :goto_8
    iget-object v10, v10, LP/k;->i:LP/k;

    goto :goto_7

    :cond_12
    if-ne v11, v6, :cond_13

    goto :goto_6

    :cond_13
    invoke-static {v4}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v0

    goto :goto_6

    :cond_14
    iget-object v0, v0, LP/k;->i:LP/k;

    goto :goto_5

    :cond_15
    :goto_9
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "visitChildren called on an unattached node"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Lq/l;

    iget-object v0, v0, Lq/l;->x:LA0/c;

    invoke-virtual {v0}, LA0/c;->c()Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_7
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Lo0/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_8
    sget-object v0, Ln0/Y;->G:LW/F;

    iget-object v2, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v2, Lo2/c;

    invoke-interface {v2, v0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, LW/F;->r:LW/H;

    iget-wide v3, v0, LW/F;->u:J

    iget-object v5, v0, LW/F;->w:LG0/f;

    iget-object v6, v0, LW/F;->v:LG0/b;

    invoke-interface {v2, v3, v4, v5, v6}, LW/H;->b(JLG0/f;LG0/b;)LW/B;

    move-result-object v2

    iput-object v2, v0, LW/F;->x:LW/B;

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_9
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Ln0/Y;

    iget-object v0, v0, Ln0/Y;->p:Ln0/Y;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ln0/Y;->w0()V

    :cond_17
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_a
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Ln0/I;

    invoke-virtual {v0}, Ln0/I;->a()Ln0/Y;

    move-result-object v2

    iget-wide v3, v0, Ln0/I;->s:J

    invoke-interface {v2, v3, v4}, Ll0/j;->a(J)Ll0/o;

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_b
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Ln0/G;

    iget-object v2, v0, Ln0/G;->H:Ln0/I;

    const/4 v3, 0x0

    iput v3, v2, Ln0/I;->j:I

    iget-object v2, v2, Ln0/I;->a:Ln0/z;

    invoke-virtual {v2}, Ln0/z;->n()LF/d;

    move-result-object v2

    iget v4, v2, LF/d;->f:I

    const v5, 0x7fffffff

    if-lez v4, :cond_1a

    iget-object v2, v2, LF/d;->d:[Ljava/lang/Object;

    move v6, v3

    :cond_18
    aget-object v7, v2, v6

    check-cast v7, Ln0/z;

    iget-object v7, v7, Ln0/z;->y:Ln0/I;

    iget-object v7, v7, Ln0/I;->q:Ln0/G;

    iget v8, v7, Ln0/G;->k:I

    iput v8, v7, Ln0/G;->j:I

    iput v5, v7, Ln0/G;->k:I

    iput-boolean v3, v7, Ln0/G;->u:Z

    iget v8, v7, Ln0/G;->n:I

    const/4 v9, 0x2

    if-ne v8, v9, :cond_19

    const/4 v8, 0x3

    iput v8, v7, Ln0/G;->n:I

    :cond_19
    add-int/lit8 v6, v6, 0x1

    if-lt v6, v4, :cond_18

    :cond_1a
    iget-object v2, v0, Ln0/G;->H:Ln0/I;

    iget-object v4, v2, Ln0/I;->a:Ln0/z;

    invoke-virtual {v4}, Ln0/z;->n()LF/d;

    move-result-object v4

    iget v6, v4, LF/d;->f:I

    if-lez v6, :cond_1c

    iget-object v4, v4, LF/d;->d:[Ljava/lang/Object;

    move v7, v3

    :cond_1b
    aget-object v8, v4, v7

    check-cast v8, Ln0/z;

    iget-object v8, v8, Ln0/z;->y:Ln0/I;

    iget-object v8, v8, Ln0/I;->q:Ln0/G;

    iget-object v8, v8, Ln0/G;->v:Ln0/A;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v7, v7, 0x1

    if-lt v7, v6, :cond_1b

    :cond_1c
    invoke-virtual {v0}, Ln0/G;->A()Ln0/p;

    move-result-object v0

    invoke-virtual {v0}, Ln0/Y;->X()LM1/j;

    move-result-object v0

    invoke-virtual {v0}, LM1/j;->g()V

    iget-object v0, v2, Ln0/I;->a:Ln0/z;

    invoke-virtual {v0}, Ln0/z;->n()LF/d;

    move-result-object v2

    iget v4, v2, LF/d;->f:I

    if-lez v4, :cond_1f

    iget-object v2, v2, LF/d;->d:[Ljava/lang/Object;

    move v6, v3

    :cond_1d
    aget-object v7, v2, v6

    check-cast v7, Ln0/z;

    iget-object v8, v7, Ln0/z;->y:Ln0/I;

    iget-object v8, v8, Ln0/I;->q:Ln0/G;

    iget v8, v8, Ln0/G;->j:I

    invoke-virtual {v7}, Ln0/z;->l()I

    move-result v9

    if-eq v8, v9, :cond_1e

    invoke-virtual {v0}, Ln0/z;->A()V

    invoke-virtual {v0}, Ln0/z;->p()V

    invoke-virtual {v7}, Ln0/z;->l()I

    move-result v8

    if-ne v8, v5, :cond_1e

    iget-object v7, v7, Ln0/z;->y:Ln0/I;

    iget-object v7, v7, Ln0/I;->q:Ln0/G;

    invoke-virtual {v7}, Ln0/G;->N()V

    :cond_1e
    add-int/lit8 v6, v6, 0x1

    if-lt v6, v4, :cond_1d

    :cond_1f
    invoke-virtual {v0}, Ln0/z;->n()LF/d;

    move-result-object v0

    iget v2, v0, LF/d;->f:I

    if-lez v2, :cond_21

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    move v4, v3

    :cond_20
    aget-object v5, v0, v4

    check-cast v5, Ln0/z;

    iget-object v5, v5, Ln0/z;->y:Ln0/I;

    iget-object v5, v5, Ln0/I;->q:Ln0/G;

    iget-object v5, v5, Ln0/G;->v:Ln0/A;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v3, v5, Ln0/A;->c:Z

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v2, :cond_20

    :cond_21
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_c
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Ln0/z;

    iget-object v0, v0, Ln0/z;->y:Ln0/I;

    iget-object v2, v0, Ln0/I;->q:Ln0/G;

    const/4 v3, 0x1

    iput-boolean v3, v2, Ln0/G;->x:Z

    iget-object v0, v0, Ln0/I;->r:Ln0/F;

    if-eqz v0, :cond_22

    iput-boolean v3, v0, Ln0/F;->u:Z

    :cond_22
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_d
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Lc0/H;

    iget v2, v0, Lc0/H;->k:I

    iget-object v0, v0, Lc0/H;->h:LD/d0;

    iget-object v3, v0, LD/d0;->e:LD/F0;

    invoke-static {v3, v0}, LN/o;->t(LN/A;LN/y;)LN/A;

    move-result-object v3

    check-cast v3, LD/F0;

    iget v3, v3, LD/F0;->c:I

    if-ne v2, v3, :cond_23

    iget-object v2, v0, LD/d0;->e:LD/F0;

    invoke-static {v2, v0}, LN/o;->t(LN/A;LN/y;)LN/A;

    move-result-object v2

    check-cast v2, LD/F0;

    iget v2, v2, LD/F0;->c:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, LD/d0;->g(I)V

    :cond_23
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_e
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, Lb/k;

    new-instance v2, LX1/e;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, LX1/e;-><init>(I)V

    invoke-virtual {v0}, Lb/k;->e()Landroidx/lifecycle/I;

    move-result-object v3

    invoke-interface {v0}, Landroidx/lifecycle/i;->a()Lv1/b;

    move-result-object v0

    const-string v4, "store"

    invoke-static {v3, v4}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "defaultCreationExtras"

    invoke-static {v0, v4}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LB0/a;

    invoke-direct {v4, v3, v2, v0}, LB0/a;-><init>(Landroidx/lifecycle/I;Landroidx/lifecycle/H;Lv1/b;)V

    const-class v0, Landroidx/lifecycle/G;

    invoke-static {v0}, Lp2/p;->a(Ljava/lang/Class;)Lp2/d;

    move-result-object v0

    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesVM"

    const-string v3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    const-string v5, "key"

    invoke-static {v2, v5}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v4, LB0/a;->b:Ljava/lang/Object;

    check-cast v5, Landroidx/lifecycle/I;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v5, Landroidx/lifecycle/I;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/lifecycle/G;

    const-string v7, "jClass"

    iget-object v8, v0, Lp2/d;->a:Ljava/lang/Class;

    invoke-static {v8, v7}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lp2/d;->b:Ljava/util/Map;

    const-string v9, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"

    invoke-static {v7, v9}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_24

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-static {v7, v6}, Lp2/r;->d(ILjava/lang/Object;)Z

    move-result v7

    goto :goto_a

    :cond_24
    invoke-virtual {v8}, Ljava/lang/Class;->isPrimitive()Z

    move-result v7

    if-eqz v7, :cond_25

    invoke-static {v8}, Lp2/p;->a(Ljava/lang/Class;)Lp2/d;

    move-result-object v7

    invoke-static {v7}, LZ0/d;->x(Lv2/b;)Ljava/lang/Class;

    move-result-object v8

    :cond_25
    invoke-virtual {v8, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    :goto_a
    if-eqz v7, :cond_26

    const-string v0, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    invoke-static {v6, v0}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_d

    :cond_26
    new-instance v6, Lv1/c;

    iget-object v7, v4, LB0/a;->d:Ljava/lang/Object;

    check-cast v7, Lv1/b;

    invoke-direct {v6, v7}, Lv1/c;-><init>(Lv1/b;)V

    sget-object v7, Lw1/b;->a:Lw1/b;

    iget-object v8, v6, Lv1/b;->a:Ljava/lang/Object;

    check-cast v8, Ljava/util/LinkedHashMap;

    invoke-interface {v8, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v4, LB0/a;->c:Ljava/lang/Object;

    check-cast v4, Landroidx/lifecycle/H;

    :try_start_0
    invoke-virtual {v0}, Lp2/d;->a()Ljava/lang/Class;

    move-result-object v7

    invoke-static {v7, v3}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v7, v6}, Landroidx/lifecycle/H;->d(Ljava/lang/Class;Lv1/c;)Landroidx/lifecycle/G;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_b
    move-object v6, v0

    goto :goto_c

    :catch_0
    :try_start_1
    invoke-virtual {v0}, Lp2/d;->a()Ljava/lang/Class;

    move-result-object v7

    invoke-static {v7, v3}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v7, v6}, Landroidx/lifecycle/H;->d(Ljava/lang/Class;Lv1/c;)Landroidx/lifecycle/G;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_b

    :goto_c
    const-string v0, "viewModel"

    invoke-static {v6, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/G;

    if-eqz v0, :cond_27

    invoke-virtual {v0}, Landroidx/lifecycle/G;->a()V

    :cond_27
    :goto_d
    return-object v6

    :catch_1
    invoke-virtual {v0}, Lp2/d;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v3}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v2, "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error."

    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    :pswitch_f
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, LN/v;

    iget-object v3, v2, LN/v;->f:LF/d;

    monitor-enter v3

    :try_start_2
    iget-boolean v0, v2, LN/v;->c:Z

    if-nez v0, :cond_30

    const/4 v0, 0x1

    iput-boolean v0, v2, LN/v;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v0, v2, LN/v;->f:LF/d;

    iget v5, v0, LF/d;->f:I

    if-lez v5, :cond_2e

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    const/4 v6, 0x0

    :goto_e
    aget-object v7, v0, v6

    check-cast v7, LN/u;

    iget-object v8, v7, LN/u;->g:Ln/B;

    iget-object v9, v8, Ln/B;->b:[Ljava/lang/Object;

    iget-object v10, v8, Ln/B;->a:[J

    array-length v11, v10

    add-int/lit8 v11, v11, -0x2

    if-ltz v11, :cond_2c

    const/4 v12, 0x0

    :goto_f
    aget-wide v13, v10, v12

    move/from16 v16, v5

    not-long v4, v13

    const/16 v17, 0x7

    shl-long v4, v4, v17

    and-long/2addr v4, v13

    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v4, v4, v17

    cmp-long v4, v4, v17

    if-eqz v4, :cond_2b

    sub-int v4, v12, v11

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v4, 0x8

    const/4 v15, 0x0

    :goto_10
    if-ge v15, v4, :cond_2a

    const-wide/16 v18, 0xff

    and-long v18, v13, v18

    const-wide/16 v20, 0x80

    cmp-long v18, v18, v20

    if-gez v18, :cond_29

    shl-int/lit8 v18, v12, 0x3

    add-int v18, v18, v15

    aget-object v5, v9, v18

    move-object/from16 v18, v0

    iget-object v0, v7, LN/u;->a:Lo2/c;

    invoke-interface {v0, v5}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x8

    goto :goto_11

    :cond_29
    move-object/from16 v18, v0

    move v0, v5

    :goto_11
    shr-long/2addr v13, v0

    add-int/lit8 v15, v15, 0x1

    move v5, v0

    move-object/from16 v0, v18

    goto :goto_10

    :cond_2a
    move-object/from16 v18, v0

    move v0, v5

    if-ne v4, v0, :cond_2d

    goto :goto_12

    :cond_2b
    move-object/from16 v18, v0

    :goto_12
    if-eq v12, v11, :cond_2d

    add-int/lit8 v12, v12, 0x1

    move/from16 v5, v16

    move-object/from16 v0, v18

    goto :goto_f

    :cond_2c
    move-object/from16 v18, v0

    move/from16 v16, v5

    :cond_2d
    invoke-virtual {v8}, Ln/B;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v6, v6, 0x1

    move/from16 v0, v16

    if-lt v6, v0, :cond_2f

    :cond_2e
    const/4 v4, 0x0

    goto :goto_14

    :cond_2f
    move v5, v0

    move-object/from16 v0, v18

    goto :goto_e

    :goto_13
    const/4 v4, 0x0

    goto :goto_15

    :catchall_0
    move-exception v0

    goto :goto_13

    :goto_14
    :try_start_4
    iput-boolean v4, v2, LN/v;->c:Z

    goto :goto_16

    :goto_15
    iput-boolean v4, v2, LN/v;->c:Z

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_17

    :cond_30
    :goto_16
    monitor-exit v3

    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, LN/v;

    invoke-static {v0}, LN/v;->a(LN/v;)Z

    move-result v0

    if-nez v0, :cond_28

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :goto_17
    monitor-exit v3

    throw v0

    :pswitch_10
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.settings.ACCESSIBILITY_SETTINGS"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v2, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v2, Lp2/o;

    iget-object v2, v2, Lp2/o;->d:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_11
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, LE0/b;

    iget-object v2, v0, LE0/b;->c:LD/f0;

    invoke-virtual {v2}, LD/f0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV/f;

    iget-wide v2, v2, LV/f;->a:J

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v2, v4

    if-nez v2, :cond_31

    goto :goto_18

    :cond_31
    iget-object v2, v0, LE0/b;->c:LD/f0;

    invoke-virtual {v2}, LD/f0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LV/f;

    iget-wide v3, v3, LV/f;->a:J

    invoke-static {v3, v4}, LV/f;->e(J)Z

    move-result v3

    if-eqz v3, :cond_32

    :goto_18
    const/4 v0, 0x0

    goto :goto_19

    :cond_32
    invoke-virtual {v2}, LD/f0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV/f;

    iget-wide v2, v2, LV/f;->a:J

    iget-object v0, v0, LE0/b;->a:LW/n;

    iget-object v0, v0, LW/n;->g:Landroid/graphics/Shader;

    :goto_19
    return-object v0

    :pswitch_12
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, LD/v0;

    iget-object v2, v0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_5
    invoke-virtual {v0}, LD/v0;->e()Ly2/e;

    move-result-object v3

    iget-object v4, v0, LD/v0;->r:LB2/G;

    invoke-virtual {v4}, LB2/G;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD/o0;

    sget-object v5, LD/o0;->e:LD/o0;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-lez v4, :cond_34

    monitor-exit v2

    if-eqz v3, :cond_33

    sget-object v0, Lc2/m;->a:Lc2/m;

    check-cast v3, Ly2/f;

    invoke-virtual {v3, v0}, Ly2/f;->t(Ljava/lang/Object;)V

    :cond_33
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :cond_34
    :try_start_6
    const-string v3, "Recomposer shutdown; frame clock awaiter will never resume"

    iget-object v0, v0, LD/v0;->d:Ljava/lang/Throwable;

    new-instance v4, Ljava/util/concurrent/CancellationException;

    invoke-direct {v4, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

    :pswitch_13
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, LD/i0;

    iget-object v2, v0, LD/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-instance v3, Ln/y;

    invoke-direct {v3, v2}, Ln/y;-><init>(I)V

    iget-object v0, v0, LD/i0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    move v5, v4

    :goto_1a
    if-ge v5, v2, :cond_3c

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD/P;

    iget-object v7, v6, LD/P;->b:Ljava/lang/Object;

    iget v8, v6, LD/P;->a:I

    if-eqz v7, :cond_35

    new-instance v7, LD/O;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, v6, LD/P;->b:Ljava/lang/Object;

    invoke-direct {v7, v8, v9}, LD/O;-><init>(Ljava/lang/Integer;Ljava/lang/Object;)V

    goto :goto_1b

    :cond_35
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :goto_1b
    invoke-virtual {v3, v7}, Ln/y;->d(Ljava/lang/Object;)I

    move-result v8

    if-gez v8, :cond_36

    const/4 v9, 0x1

    goto :goto_1c

    :cond_36
    move v9, v4

    :goto_1c
    if-eqz v9, :cond_37

    const/4 v10, 0x0

    goto :goto_1d

    :cond_37
    iget-object v10, v3, Ln/y;->c:[Ljava/lang/Object;

    aget-object v10, v10, v8

    :goto_1d
    if-nez v10, :cond_38

    goto :goto_1e

    :cond_38
    instance-of v11, v10, Ljava/util/List;

    if-eqz v11, :cond_3a

    instance-of v11, v10, Lq2/a;

    if-eqz v11, :cond_39

    instance-of v11, v10, Lq2/c;

    if-eqz v11, :cond_3a

    :cond_39
    invoke-static {v10}, Lp2/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v6, v10

    goto :goto_1e

    :cond_3a
    filled-new-array {v10, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ld2/l;->V([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v6

    :goto_1e
    if-eqz v9, :cond_3b

    not-int v8, v8

    iget-object v9, v3, Ln/y;->b:[Ljava/lang/Object;

    aput-object v7, v9, v8

    iget-object v7, v3, Ln/y;->c:[Ljava/lang/Object;

    aput-object v6, v7, v8

    goto :goto_1f

    :cond_3b
    iget-object v7, v3, Ln/y;->c:[Ljava/lang/Object;

    aput-object v6, v7, v8

    :goto_1f
    add-int/lit8 v5, v5, 0x1

    goto :goto_1a

    :cond_3c
    new-instance v0, LD/Y;

    invoke-direct {v0, v3}, LD/Y;-><init>(Ln/y;)V

    return-object v0

    :pswitch_14
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, LW/D;

    check-cast v0, LW/n;

    iget-object v0, v0, LW/n;->g:Landroid/graphics/Shader;

    return-object v0

    :pswitch_15
    new-instance v0, Landroid/view/inputmethod/BaseInputConnection;

    iget-object v2, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v2, LA0/d;

    iget-object v2, v2, LA0/d;->a:Landroid/view/View;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    return-object v0

    :pswitch_16
    iget-object v0, v1, LA0/c;->f:Ljava/lang/Object;

    check-cast v0, LA0/d;

    iget-object v0, v0, LA0/d;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v2}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
