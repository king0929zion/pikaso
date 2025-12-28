.class public abstract Ln0/Y;
.super Ln0/L;
.source "SourceFile"

# interfaces
.implements Ll0/j;
.implements Ll0/g;
.implements Ln0/f0;


# static fields
.field public static final G:LW/F;

.field public static final H:Ln0/q;

.field public static final I:Ln0/V;

.field public static final J:Ln0/V;


# instance fields
.field public A:LV/b;

.field public B:Ln0/q;

.field public final C:LA/i;

.field public final D:LA0/c;

.field public E:Z

.field public F:Ln0/d0;

.field public final n:Ln0/z;

.field public o:Ln0/Y;

.field public p:Ln0/Y;

.field public q:Z

.field public r:Z

.field public s:Lo2/c;

.field public t:LG0/b;

.field public u:LG0/f;

.field public v:F

.field public w:LM1/j;

.field public x:Ljava/util/LinkedHashMap;

.field public y:J

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LW/F;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, LW/F;->e:F

    iput v1, v0, LW/F;->f:F

    iput v1, v0, LW/F;->g:F

    sget-wide v2, LW/x;->a:J

    iput-wide v2, v0, LW/F;->k:J

    iput-wide v2, v0, LW/F;->l:J

    const/high16 v2, 0x41000000    # 8.0f

    iput v2, v0, LW/F;->p:F

    sget-wide v2, LW/K;->a:J

    iput-wide v2, v0, LW/F;->q:J

    sget-object v2, LW/D;->a:LX1/e;

    iput-object v2, v0, LW/F;->r:LW/H;

    const/4 v2, 0x0

    iput v2, v0, LW/F;->t:I

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v2, v0, LW/F;->u:J

    new-instance v2, LG0/c;

    invoke-direct {v2, v1, v1}, LG0/c;-><init>(FF)V

    iput-object v2, v0, LW/F;->v:LG0/b;

    sget-object v1, LG0/f;->d:LG0/f;

    iput-object v1, v0, LW/F;->w:LG0/f;

    sput-object v0, Ln0/Y;->G:LW/F;

    new-instance v0, Ln0/q;

    invoke-direct {v0}, Ln0/q;-><init>()V

    sput-object v0, Ln0/Y;->H:Ln0/q;

    invoke-static {}, LW/D;->j()[F

    new-instance v0, Ln0/V;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln0/V;-><init>(I)V

    sput-object v0, Ln0/Y;->I:Ln0/V;

    new-instance v0, Ln0/V;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ln0/V;-><init>(I)V

    sput-object v0, Ln0/Y;->J:Ln0/V;

    return-void
.end method

.method public constructor <init>(Ln0/z;)V
    .locals 2

    invoke-direct {p0}, Ln0/L;-><init>()V

    iput-object p1, p0, Ln0/Y;->n:Ln0/z;

    iget-object v0, p1, Ln0/z;->s:LG0/b;

    iput-object v0, p0, Ln0/Y;->t:LG0/b;

    iget-object p1, p1, Ln0/z;->t:LG0/f;

    iput-object p1, p0, Ln0/Y;->u:LG0/f;

    const p1, 0x3f4ccccd    # 0.8f

    iput p1, p0, Ln0/Y;->v:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ln0/Y;->y:J

    new-instance p1, LA/i;

    const/4 v0, 0x7

    invoke-direct {p1, v0, p0}, LA/i;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ln0/Y;->C:LA/i;

    new-instance p1, LA0/c;

    const/16 v0, 0xd

    invoke-direct {p1, v0, p0}, LA0/c;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ln0/Y;->D:LA0/c;

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 5

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    iget-object v0, v0, Ln0/z;->y:Ln0/I;

    iget-object v1, v0, Ln0/I;->a:Ln0/z;

    iget-object v1, v1, Ln0/z;->y:Ln0/I;

    iget v1, v1, Ln0/I;->b:I

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    if-ne v1, v3, :cond_2

    :cond_0
    iget-object v2, v0, Ln0/I;->q:Ln0/G;

    iget-boolean v2, v2, Ln0/G;->y:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0, v4}, Ln0/I;->e(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v4}, Ln0/I;->d(Z)V

    :cond_2
    :goto_0
    if-ne v1, v3, :cond_4

    iget-object v1, v0, Ln0/I;->r:Ln0/F;

    if-eqz v1, :cond_3

    iget-boolean v1, v1, Ln0/F;->v:Z

    if-ne v1, v4, :cond_3

    invoke-virtual {v0, v4}, Ln0/I;->g(Z)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v4}, Ln0/I;->f(Z)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final B0()V
    .locals 14

    const/16 v0, 0x80

    invoke-static {v0}, Ln0/Z;->g(I)Z

    move-result v1

    invoke-virtual {p0, v1}, Ln0/Y;->s0(Z)LP/k;

    move-result-object v1

    if-eqz v1, :cond_e

    iget-object v1, v1, LP/k;->d:LP/k;

    iget v1, v1, LP/k;->g:I

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    sget-object v1, LN/o;->a:LB0/a;

    invoke-virtual {v1}, LB0/a;->i()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LN/h;->f()Lo2/c;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    instance-of v4, v1, LN/D;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    move-object v4, v1

    check-cast v4, LN/D;

    iget-wide v6, v4, LN/D;->t:J

    invoke-static {}, LD/d;->u()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-nez v6, :cond_1

    iput-object v2, v4, LN/D;->r:Lo2/c;

    goto :goto_1

    :cond_1
    instance-of v4, v1, LN/E;

    if-eqz v4, :cond_2

    move-object v4, v1

    check-cast v4, LN/E;

    iget-wide v6, v4, LN/E;->h:J

    invoke-static {}, LD/d;->u()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-nez v6, :cond_2

    iput-object v2, v4, LN/E;->g:Lo2/c;

    :goto_1
    move-object v4, v1

    goto :goto_2

    :cond_2
    invoke-static {v1, v2, v5}, LN/o;->h(LN/h;Lo2/c;Z)LN/h;

    move-result-object v4

    invoke-virtual {v4}, LN/h;->j()LN/h;

    :goto_2
    :try_start_0
    invoke-static {v0}, Ln0/Z;->g(I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v7

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_3
    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v7

    iget-object v7, v7, LP/k;->h:LP/k;

    if-nez v7, :cond_4

    goto/16 :goto_9

    :cond_4
    :goto_3
    invoke-virtual {p0, v6}, Ln0/Y;->s0(Z)LP/k;

    move-result-object v6

    :goto_4
    if-eqz v6, :cond_d

    iget v8, v6, LP/k;->g:I

    and-int/2addr v8, v0

    if-eqz v8, :cond_d

    iget v8, v6, LP/k;->f:I

    and-int/2addr v8, v0

    if-eqz v8, :cond_c

    move-object v9, v2

    move-object v8, v6

    :goto_5
    if-eqz v8, :cond_c

    instance-of v10, v8, Ln0/r;

    if-eqz v10, :cond_5

    check-cast v8, Ln0/r;

    iget-wide v10, p0, Ll0/o;->f:J

    invoke-interface {v8, v10, v11}, Ln0/r;->o(J)V

    goto :goto_8

    :cond_5
    iget v10, v8, LP/k;->f:I

    and-int/2addr v10, v0

    if-eqz v10, :cond_b

    instance-of v10, v8, Ln0/i;

    if-eqz v10, :cond_b

    move-object v10, v8

    check-cast v10, Ln0/i;

    iget-object v10, v10, Ln0/i;->r:LP/k;

    move v11, v5

    :goto_6
    const/4 v12, 0x1

    if-eqz v10, :cond_a

    iget v13, v10, LP/k;->f:I

    and-int/2addr v13, v0

    if-eqz v13, :cond_9

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v12, :cond_6

    move-object v8, v10

    goto :goto_7

    :cond_6
    if-nez v9, :cond_7

    new-instance v9, LF/d;

    const/16 v12, 0x10

    new-array v12, v12, [LP/k;

    invoke-direct {v9, v12}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v8, :cond_8

    invoke-virtual {v9, v8}, LF/d;->b(Ljava/lang/Object;)V

    move-object v8, v2

    :cond_8
    invoke-virtual {v9, v10}, LF/d;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_7
    iget-object v10, v10, LP/k;->i:LP/k;

    goto :goto_6

    :cond_a
    if-ne v11, v12, :cond_b

    goto :goto_5

    :cond_b
    :goto_8
    invoke-static {v9}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v8

    goto :goto_5

    :cond_c
    if-eq v6, v7, :cond_d

    iget-object v6, v6, LP/k;->i:LP/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_d
    :goto_9
    invoke-static {v1, v4, v3}, LN/t;->d(LN/h;LN/h;Lo2/c;)V

    goto :goto_b

    :goto_a
    invoke-static {v1, v4, v3}, LN/t;->d(LN/h;LN/h;Lo2/c;)V

    throw v0

    :cond_e
    :goto_b
    return-void
.end method

.method public final C0()V
    .locals 10

    const/16 v0, 0x80

    invoke-static {v0}, Ln0/Z;->g(I)Z

    move-result v1

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v2

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v2, LP/k;->h:LP/k;

    if-nez v2, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Ln0/Y;->s0(Z)LP/k;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_a

    iget v3, v1, LP/k;->g:I

    and-int/2addr v3, v0

    if-eqz v3, :cond_a

    iget v3, v1, LP/k;->f:I

    and-int/2addr v3, v0

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v1

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_9

    instance-of v6, v4, Ln0/r;

    if-eqz v6, :cond_2

    check-cast v4, Ln0/r;

    invoke-interface {v4, p0}, Ln0/r;->K(Ln0/Y;)V

    goto :goto_5

    :cond_2
    iget v6, v4, LP/k;->f:I

    and-int/2addr v6, v0

    if-eqz v6, :cond_8

    instance-of v6, v4, Ln0/i;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, Ln0/i;

    iget-object v6, v6, Ln0/i;->r:LP/k;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_7

    iget v9, v6, LP/k;->f:I

    and-int/2addr v9, v0

    if-eqz v9, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_3

    move-object v4, v6

    goto :goto_4

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LF/d;

    const/16 v8, 0x10

    new-array v8, v8, [LP/k;

    invoke-direct {v5, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LF/d;->b(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, LF/d;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    iget-object v6, v6, LP/k;->i:LP/k;

    goto :goto_3

    :cond_7
    if-ne v7, v8, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v5}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v4

    goto :goto_2

    :cond_9
    if-eq v1, v2, :cond_a

    iget-object v1, v1, LP/k;->i:LP/k;

    goto :goto_1

    :cond_a
    :goto_6
    return-void
.end method

.method public abstract D0(LW/o;LZ/d;)V
.end method

.method public final E0(JFLo2/c;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p4, v0}, Ln0/Y;->J0(Lo2/c;Z)V

    iget-wide v0, p0, Ln0/Y;->y:J

    invoke-static {v0, v1, p1, p2}, La/a;->v(JJ)Z

    move-result p4

    if-nez p4, :cond_2

    iput-wide p1, p0, Ln0/Y;->y:J

    iget-object p4, p0, Ln0/Y;->n:Ln0/z;

    iget-object v0, p4, Ln0/z;->y:Ln0/I;

    iget-object v0, v0, Ln0/I;->q:Ln0/G;

    invoke-virtual {v0}, Ln0/G;->Q()V

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ln0/d0;->c(J)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ln0/Y;->p:Ln0/Y;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ln0/Y;->w0()V

    :cond_1
    :goto_0
    invoke-static {p0}, Ln0/L;->a0(Ln0/Y;)V

    iget-object p1, p4, Ln0/z;->l:Lo0/u;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p4}, Lo0/u;->w(Ln0/z;)V

    :cond_2
    iput p3, p0, Ln0/Y;->z:F

    iget-boolean p1, p0, Ln0/L;->j:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Ln0/Y;->X()LM1/j;

    move-result-object p1

    new-instance p2, Ln0/i0;

    invoke-direct {p2, p1, p0}, Ln0/i0;-><init>(LM1/j;Ln0/L;)V

    invoke-virtual {p0, p2}, Ln0/L;->N(Ln0/i0;)V

    :cond_3
    return-void
.end method

.method public final F0(LV/b;ZZ)V
    .locals 10

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    const-wide v1, 0xffffffffL

    const/16 v3, 0x20

    if-eqz v0, :cond_3

    iget-boolean v4, p0, Ln0/Y;->r:Z

    if-eqz v4, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Ln0/Y;->p0()J

    move-result-wide p2

    invoke-static {p2, p3}, LV/f;->d(J)F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    invoke-static {p2, p3}, LV/f;->b(J)F

    move-result p2

    div-float/2addr p2, v5

    neg-float p3, v4

    neg-float v5, p2

    iget-wide v6, p0, Ll0/o;->f:J

    shr-long v8, v6, v3

    long-to-int v8, v8

    int-to-float v8, v8

    add-float/2addr v8, v4

    and-long/2addr v6, v1

    long-to-int v4, v6

    int-to-float v4, v4

    add-float/2addr v4, p2

    invoke-virtual {p1, p3, v5, v8, v4}, LV/b;->a(FFFF)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-wide p2, p0, Ll0/o;->f:J

    shr-long v4, p2, v3

    long-to-int v4, v4

    int-to-float v4, v4

    and-long/2addr p2, v1

    long-to-int p2, p2

    int-to-float p2, p2

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p3, v4, p2}, LV/b;->a(FFFF)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, LV/b;->b()Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    const/4 p2, 0x0

    invoke-interface {v0, p1, p2}, Ln0/d0;->f(LV/b;Z)V

    :cond_3
    iget-wide p2, p0, Ln0/Y;->y:J

    shr-long v3, p2, v3

    long-to-int v0, v3

    iget v3, p1, LV/b;->a:F

    int-to-float v0, v0

    add-float/2addr v3, v0

    iput v3, p1, LV/b;->a:F

    iget v3, p1, LV/b;->c:F

    add-float/2addr v3, v0

    iput v3, p1, LV/b;->c:F

    and-long/2addr p2, v1

    long-to-int p2, p2

    iget p3, p1, LV/b;->b:F

    int-to-float p2, p2

    add-float/2addr p3, p2

    iput p3, p1, LV/b;->b:F

    iget p3, p1, LV/b;->d:F

    add-float/2addr p3, p2

    iput p3, p1, LV/b;->d:F

    return-void
.end method

.method public final G0(LM1/j;)V
    .locals 12

    iget-object v0, p0, Ln0/Y;->w:LM1/j;

    if-eq p1, v0, :cond_13

    iput-object p1, p0, Ln0/Y;->w:LM1/j;

    iget-object v1, p0, Ln0/Y;->n:Ln0/z;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LM1/j;->e()I

    move-result v2

    invoke-virtual {v0}, LM1/j;->e()I

    move-result v3

    if-ne v2, v3, :cond_0

    invoke-virtual {p1}, LM1/j;->c()I

    move-result v2

    invoke-virtual {v0}, LM1/j;->c()I

    move-result v0

    if-eq v2, v0, :cond_f

    :cond_0
    invoke-virtual {p1}, LM1/j;->e()I

    move-result v0

    invoke-virtual {p1}, LM1/j;->c()I

    move-result v2

    iget-object v3, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz v3, :cond_1

    invoke-static {v0, v2}, Lr2/a;->d(II)J

    move-result-wide v4

    invoke-interface {v3, v4, v5}, Ln0/d0;->e(J)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ln0/z;->v()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Ln0/Y;->p:Ln0/Y;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ln0/Y;->w0()V

    :cond_2
    :goto_0
    invoke-static {v0, v2}, Lr2/a;->d(II)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ll0/o;->I(J)V

    iget-object v0, p0, Ln0/Y;->s:Lo2/c;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v2}, Ln0/Y;->K0(Z)V

    :cond_3
    const/4 v0, 0x4

    invoke-static {v0}, Ln0/Z;->g(I)Z

    move-result v3

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v4

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    iget-object v4, v4, LP/k;->h:LP/k;

    if-nez v4, :cond_5

    goto/16 :goto_7

    :cond_5
    :goto_1
    invoke-virtual {p0, v3}, Ln0/Y;->s0(Z)LP/k;

    move-result-object v3

    :goto_2
    if-eqz v3, :cond_e

    iget v5, v3, LP/k;->g:I

    and-int/2addr v5, v0

    if-eqz v5, :cond_e

    iget v5, v3, LP/k;->f:I

    and-int/2addr v5, v0

    if-eqz v5, :cond_d

    const/4 v5, 0x0

    move-object v6, v3

    move-object v7, v5

    :goto_3
    if-eqz v6, :cond_d

    instance-of v8, v6, Ln0/k;

    if-eqz v8, :cond_6

    check-cast v6, Ln0/k;

    invoke-interface {v6}, Ln0/k;->M()V

    goto :goto_6

    :cond_6
    iget v8, v6, LP/k;->f:I

    and-int/2addr v8, v0

    if-eqz v8, :cond_c

    instance-of v8, v6, Ln0/i;

    if-eqz v8, :cond_c

    move-object v8, v6

    check-cast v8, Ln0/i;

    iget-object v8, v8, Ln0/i;->r:LP/k;

    move v9, v2

    :goto_4
    const/4 v10, 0x1

    if-eqz v8, :cond_b

    iget v11, v8, LP/k;->f:I

    and-int/2addr v11, v0

    if-eqz v11, :cond_a

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v10, :cond_7

    move-object v6, v8

    goto :goto_5

    :cond_7
    if-nez v7, :cond_8

    new-instance v7, LF/d;

    const/16 v10, 0x10

    new-array v10, v10, [LP/k;

    invoke-direct {v7, v10}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_8
    if-eqz v6, :cond_9

    invoke-virtual {v7, v6}, LF/d;->b(Ljava/lang/Object;)V

    move-object v6, v5

    :cond_9
    invoke-virtual {v7, v8}, LF/d;->b(Ljava/lang/Object;)V

    :cond_a
    :goto_5
    iget-object v8, v8, LP/k;->i:LP/k;

    goto :goto_4

    :cond_b
    if-ne v9, v10, :cond_c

    goto :goto_3

    :cond_c
    :goto_6
    invoke-static {v7}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v6

    goto :goto_3

    :cond_d
    if-eq v3, v4, :cond_e

    iget-object v3, v3, LP/k;->i:LP/k;

    goto :goto_2

    :cond_e
    :goto_7
    iget-object v0, v1, Ln0/z;->l:Lo0/u;

    if-eqz v0, :cond_f

    invoke-virtual {v0, v1}, Lo0/u;->w(Ln0/z;)V

    :cond_f
    iget-object v0, p0, Ln0/Y;->x:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_10

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    :cond_10
    invoke-virtual {p1}, LM1/j;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    :cond_11
    invoke-virtual {p1}, LM1/j;->b()Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Ln0/Y;->x:Ljava/util/LinkedHashMap;

    invoke-static {v0, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, v1, Ln0/z;->y:Ln0/I;

    iget-object v0, v0, Ln0/I;->q:Ln0/G;

    iget-object v0, v0, Ln0/G;->v:Ln0/A;

    invoke-virtual {v0}, Ln0/A;->f()V

    iget-object v0, p0, Ln0/Y;->x:Ljava/util/LinkedHashMap;

    if-nez v0, :cond_12

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ln0/Y;->x:Ljava/util/LinkedHashMap;

    :cond_12
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-virtual {p1}, LM1/j;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_13
    return-void
.end method

.method public final H0(LP/k;Ln0/V;JLn0/n;ZZF)V
    .locals 16

    move-object/from16 v11, p1

    move-object/from16 v12, p5

    move/from16 v13, p7

    move/from16 v14, p8

    if-nez v11, :cond_0

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-wide/from16 v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Ln0/Y;->v0(Ln0/V;JLn0/n;ZZ)V

    goto/16 :goto_4

    :cond_0
    move-object/from16 v3, p2

    iget v0, v3, Ln0/V;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_3

    :pswitch_0
    const/4 v0, 0x0

    move-object v2, v0

    move-object v1, v11

    :goto_0
    const/4 v4, 0x0

    if-eqz v1, :cond_8

    instance-of v5, v1, Ln0/j0;

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    check-cast v1, Ln0/j0;

    invoke-interface {v1}, Ln0/j0;->N()Z

    move-result v1

    if-eqz v1, :cond_7

    move v0, v6

    goto :goto_3

    :cond_1
    iget v5, v1, LP/k;->f:I

    const/16 v7, 0x10

    and-int/2addr v5, v7

    if-eqz v5, :cond_7

    instance-of v5, v1, Ln0/i;

    if-eqz v5, :cond_7

    move-object v5, v1

    check-cast v5, Ln0/i;

    iget-object v5, v5, Ln0/i;->r:LP/k;

    :goto_1
    if-eqz v5, :cond_6

    iget v8, v5, LP/k;->f:I

    and-int/2addr v8, v7

    if-eqz v8, :cond_5

    add-int/lit8 v4, v4, 0x1

    if-ne v4, v6, :cond_2

    move-object v1, v5

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, LF/d;

    new-array v8, v7, [LP/k;

    invoke-direct {v2, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v2, v1}, LF/d;->b(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_4
    invoke-virtual {v2, v5}, LF/d;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    iget-object v5, v5, LP/k;->i:LP/k;

    goto :goto_1

    :cond_6
    if-ne v4, v6, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {v2}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v1

    goto :goto_0

    :cond_8
    move v0, v4

    :goto_3
    if-eqz v0, :cond_b

    new-instance v15, Ln0/X;

    const/4 v10, 0x1

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Ln0/X;-><init>(Ln0/Y;LP/k;Ln0/V;JLn0/n;ZZFI)V

    iget v0, v12, Ln0/n;->f:I

    invoke-static/range {p5 .. p5}, Ld2/l;->T(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_9

    invoke-virtual {v12, v11, v14, v13, v15}, Ln0/n;->b(LP/k;FZLo2/a;)V

    iget v0, v12, Ln0/n;->f:I

    add-int/lit8 v0, v0, 0x1

    invoke-static/range {p5 .. p5}, Ld2/l;->T(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_c

    invoke-virtual/range {p5 .. p5}, Ln0/n;->c()V

    goto :goto_4

    :cond_9
    invoke-virtual/range {p5 .. p5}, Ln0/n;->a()J

    move-result-wide v0

    iget v2, v12, Ln0/n;->f:I

    invoke-static/range {p5 .. p5}, Ld2/l;->T(Ljava/util/List;)I

    move-result v3

    iput v3, v12, Ln0/n;->f:I

    invoke-virtual {v12, v11, v14, v13, v15}, Ln0/n;->b(LP/k;FZLo2/a;)V

    iget v3, v12, Ln0/n;->f:I

    add-int/lit8 v3, v3, 0x1

    invoke-static/range {p5 .. p5}, Ld2/l;->T(Ljava/util/List;)I

    move-result v4

    if-ge v3, v4, :cond_a

    invoke-virtual/range {p5 .. p5}, Ln0/n;->a()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ln0/C;->g(JJ)I

    move-result v0

    if-lez v0, :cond_a

    iget v0, v12, Ln0/n;->f:I

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v2, 0x1

    iget-object v3, v12, Ln0/n;->d:[Ljava/lang/Object;

    iget v4, v12, Ln0/n;->g:I

    invoke-static {v3, v3, v1, v0, v4}, Ld2/j;->Y([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v3, v12, Ln0/n;->e:[J

    iget v4, v12, Ln0/n;->g:I

    sub-int/2addr v4, v0

    invoke-static {v3, v0, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, v12, Ln0/n;->g:I

    add-int/2addr v0, v2

    iget v1, v12, Ln0/n;->f:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    iput v0, v12, Ln0/n;->f:I

    :cond_a
    invoke-virtual/range {p5 .. p5}, Ln0/n;->c()V

    iput v2, v12, Ln0/n;->f:I

    goto :goto_4

    :cond_b
    invoke-virtual/range {p2 .. p2}, Ln0/V;->a()I

    move-result v0

    invoke-static {v11, v0}, Ln0/C;->d(Ln0/h;I)LP/k;

    move-result-object v1

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Ln0/Y;->H0(LP/k;Ln0/V;JLn0/n;ZZF)V

    :cond_c
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final I0(JZ)J
    .locals 4

    iget-object p3, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    invoke-interface {p3, p1, p2, v0}, Ln0/d0;->b(JZ)J

    move-result-wide p1

    :cond_0
    iget-wide v0, p0, Ln0/Y;->y:J

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result p3

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-float v2, v2

    add-float/2addr p3, v2

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p2, v0

    int-to-float p2, p2

    add-float/2addr p1, p2

    invoke-static {p3, p1}, Lr2/a;->f(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public final J0(Lo2/c;Z)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Ln0/Y;->n:Ln0/z;

    if-nez p2, :cond_1

    iget-object p2, p0, Ln0/Y;->s:Lo2/c;

    if-ne p2, p1, :cond_1

    iget-object p2, p0, Ln0/Y;->t:LG0/b;

    iget-object v3, v2, Ln0/z;->s:LG0/b;

    invoke-static {p2, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Ln0/Y;->u:LG0/f;

    iget-object v3, v2, Ln0/z;->t:LG0/f;

    if-eq p2, v3, :cond_0

    goto :goto_0

    :cond_0
    move p2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p2, v1

    :goto_1
    iget-object v3, v2, Ln0/z;->s:LG0/b;

    iput-object v3, p0, Ln0/Y;->t:LG0/b;

    iget-object v3, v2, Ln0/z;->t:LG0/f;

    iput-object v3, p0, Ln0/Y;->u:LG0/f;

    invoke-virtual {v2}, Ln0/z;->u()Z

    move-result v3

    const/4 v4, 0x0

    iget-object v11, p0, Ln0/Y;->D:LA0/c;

    if-eqz v3, :cond_d

    if-eqz p1, :cond_d

    iput-object p1, p0, Ln0/Y;->s:Lo2/c;

    iget-object p1, p0, Ln0/Y;->F:Ln0/d0;

    if-nez p1, :cond_c

    invoke-static {v2}, Ln0/C;->s(Ln0/z;)Ln0/e0;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lo0/u;

    iget-object v9, p0, Ln0/Y;->C:LA/i;

    :cond_2
    iget-object p1, v8, Lo0/u;->q0:LB2/i;

    iget-object p2, p1, LB2/i;->f:Ljava/lang/Object;

    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {p2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object p2

    iget-object p1, p1, LB2/i;->e:Ljava/lang/Object;

    check-cast p1, LF/d;

    if-eqz p2, :cond_3

    invoke-virtual {p1, p2}, LF/d;->l(Ljava/lang/Object;)Z

    :cond_3
    if-nez p2, :cond_2

    :cond_4
    invoke-virtual {p1}, LF/d;->k()Z

    move-result p2

    if-eqz p2, :cond_5

    iget p2, p1, LF/d;->f:I

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/Reference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    :goto_2
    check-cast p2, Ln0/d0;

    if-eqz p2, :cond_6

    invoke-interface {p2, v9, v11}, Ln0/d0;->i(LA/i;LA0/c;)V

    goto/16 :goto_4

    :cond_6
    invoke-virtual {v8}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result p1

    if-eqz p1, :cond_7

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-eq p1, p2, :cond_7

    new-instance p2, Lo0/n0;

    invoke-virtual {v8}, Lo0/u;->getGraphicsContext()LW/w;

    move-result-object p1

    invoke-interface {p1}, LW/w;->b()LZ/d;

    move-result-object v6

    invoke-virtual {v8}, Lo0/u;->getGraphicsContext()LW/w;

    move-result-object v7

    move-object v5, p2

    move-object v10, v11

    invoke-direct/range {v5 .. v10}, Lo0/n0;-><init>(LZ/d;LW/w;Lo0/u;LA/i;LA0/c;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v8}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-boolean p1, v8, Lo0/u;->S:Z

    if-eqz p1, :cond_8

    :try_start_0
    new-instance p2, Lo0/w0;

    invoke-direct {p2, v8, v9, v11}, Lo0/w0;-><init>(Lo0/u;LA/i;LA0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    const/4 p1, 0x0

    iput-boolean p1, v8, Lo0/u;->S:Z

    :cond_8
    iget-object p1, v8, Lo0/u;->G:Lo0/k0;

    if-nez p1, :cond_b

    sget-boolean p1, Lo0/H0;->v:Z

    if-nez p1, :cond_9

    new-instance p1, Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Lo0/K;->q(Landroid/view/View;)V

    :cond_9
    sget-boolean p1, Lo0/H0;->w:Z

    if-eqz p1, :cond_a

    new-instance p1, Lo0/k0;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lo0/k0;-><init>(Landroid/content/Context;)V

    goto :goto_3

    :cond_a
    new-instance p1, Lo0/I0;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lo0/k0;-><init>(Landroid/content/Context;)V

    :goto_3
    iput-object p1, v8, Lo0/u;->G:Lo0/k0;

    const/4 p2, -0x1

    invoke-virtual {v8, p1, p2}, Lo0/u;->addView(Landroid/view/View;I)V

    :cond_b
    new-instance p2, Lo0/H0;

    iget-object p1, v8, Lo0/u;->G:Lo0/k0;

    invoke-static {p1}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-direct {p2, v8, p1, v9, v11}, Lo0/H0;-><init>(Lo0/u;Lo0/k0;LA/i;LA0/c;)V

    :goto_4
    iget-wide v3, p0, Ll0/o;->f:J

    invoke-interface {p2, v3, v4}, Ln0/d0;->e(J)V

    iget-wide v3, p0, Ln0/Y;->y:J

    invoke-interface {p2, v3, v4}, Ln0/d0;->c(J)V

    iput-object p2, p0, Ln0/Y;->F:Ln0/d0;

    invoke-virtual {p0, v1}, Ln0/Y;->K0(Z)V

    iput-boolean v1, v2, Ln0/z;->A:Z

    invoke-virtual {v11}, LA0/c;->c()Ljava/lang/Object;

    goto :goto_5

    :cond_c
    if-eqz p2, :cond_f

    invoke-virtual {p0, v1}, Ln0/Y;->K0(Z)V

    goto :goto_5

    :cond_d
    iput-object v4, p0, Ln0/Y;->s:Lo2/c;

    iget-object p1, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz p1, :cond_e

    invoke-interface {p1}, Ln0/d0;->a()V

    iput-boolean v1, v2, Ln0/z;->A:Z

    invoke-virtual {v11}, LA0/c;->c()Ljava/lang/Object;

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object p1

    iget-boolean p1, p1, LP/k;->p:Z

    if-eqz p1, :cond_e

    iget-object p1, v2, Ln0/z;->l:Lo0/u;

    if-eqz p1, :cond_e

    invoke-virtual {p1, v2}, Lo0/u;->w(Ln0/z;)V

    :cond_e
    iput-object v4, p0, Ln0/Y;->F:Ln0/d0;

    iput-boolean v0, p0, Ln0/Y;->E:Z

    :cond_f
    :goto_5
    return-void
.end method

.method public final K0(Z)V
    .locals 10

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    iget-object v2, p0, Ln0/Y;->s:Lo2/c;

    if-eqz v2, :cond_12

    sget-object v3, Ln0/Y;->G:LW/F;

    iget v4, v3, LW/F;->e:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v4, v4, v5

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget v4, v3, LW/F;->d:I

    or-int/lit8 v4, v4, 0x1

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->e:F

    :goto_0
    iget v4, v3, LW/F;->f:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    iget v4, v3, LW/F;->d:I

    or-int/lit8 v4, v4, 0x2

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->f:F

    :goto_1
    iget v4, v3, LW/F;->g:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    iget v4, v3, LW/F;->d:I

    or-int/lit8 v4, v4, 0x4

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->g:F

    :goto_2
    iget v4, v3, LW/F;->h:F

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    iget v4, v3, LW/F;->d:I

    or-int/lit8 v4, v4, 0x8

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->h:F

    :goto_3
    iget v4, v3, LW/F;->i:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_4

    goto :goto_4

    :cond_4
    iget v4, v3, LW/F;->d:I

    or-int/lit8 v4, v4, 0x10

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->i:F

    :goto_4
    iget v4, v3, LW/F;->j:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_5

    goto :goto_5

    :cond_5
    iget v4, v3, LW/F;->d:I

    or-int/lit8 v4, v4, 0x20

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->j:F

    :goto_5
    sget-wide v6, LW/x;->a:J

    iget-wide v8, v3, LW/F;->k:J

    invoke-static {v8, v9, v6, v7}, LW/r;->c(JJ)Z

    move-result v4

    if-nez v4, :cond_6

    iget v4, v3, LW/F;->d:I

    or-int/lit8 v4, v4, 0x40

    iput v4, v3, LW/F;->d:I

    iput-wide v6, v3, LW/F;->k:J

    :cond_6
    iget-wide v8, v3, LW/F;->l:J

    invoke-static {v8, v9, v6, v7}, LW/r;->c(JJ)Z

    move-result v4

    if-nez v4, :cond_7

    iget v4, v3, LW/F;->d:I

    or-int/lit16 v4, v4, 0x80

    iput v4, v3, LW/F;->d:I

    iput-wide v6, v3, LW/F;->l:J

    :cond_7
    iget v4, v3, LW/F;->m:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_8

    goto :goto_6

    :cond_8
    iget v4, v3, LW/F;->d:I

    or-int/lit16 v4, v4, 0x100

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->m:F

    :goto_6
    iget v4, v3, LW/F;->n:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_9

    goto :goto_7

    :cond_9
    iget v4, v3, LW/F;->d:I

    or-int/lit16 v4, v4, 0x200

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->n:F

    :goto_7
    iget v4, v3, LW/F;->o:F

    cmpg-float v4, v4, v5

    if-nez v4, :cond_a

    goto :goto_8

    :cond_a
    iget v4, v3, LW/F;->d:I

    or-int/lit16 v4, v4, 0x400

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->o:F

    :goto_8
    iget v4, v3, LW/F;->p:F

    const/high16 v5, 0x41000000    # 8.0f

    cmpg-float v4, v4, v5

    if-nez v4, :cond_b

    goto :goto_9

    :cond_b
    iget v4, v3, LW/F;->d:I

    or-int/lit16 v4, v4, 0x800

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->p:F

    :goto_9
    sget-wide v4, LW/K;->a:J

    iget-wide v6, v3, LW/F;->q:J

    cmp-long v6, v6, v4

    if-nez v6, :cond_c

    goto :goto_a

    :cond_c
    iget v6, v3, LW/F;->d:I

    or-int/lit16 v6, v6, 0x1000

    iput v6, v3, LW/F;->d:I

    iput-wide v4, v3, LW/F;->q:J

    :goto_a
    sget-object v4, LW/D;->a:LX1/e;

    iget-object v5, v3, LW/F;->r:LW/H;

    invoke-static {v5, v4}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    iget v5, v3, LW/F;->d:I

    or-int/lit16 v5, v5, 0x2000

    iput v5, v3, LW/F;->d:I

    iput-object v4, v3, LW/F;->r:LW/H;

    :cond_d
    iget-boolean v4, v3, LW/F;->s:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_e

    iget v4, v3, LW/F;->d:I

    or-int/lit16 v4, v4, 0x4000

    iput v4, v3, LW/F;->d:I

    iput-boolean v5, v3, LW/F;->s:Z

    :cond_e
    invoke-static {v1, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    iget v4, v3, LW/F;->d:I

    const/high16 v6, 0x20000

    or-int/2addr v4, v6

    iput v4, v3, LW/F;->d:I

    :cond_f
    iget v4, v3, LW/F;->t:I

    invoke-static {v4, v5}, LW/D;->m(II)Z

    move-result v4

    if-nez v4, :cond_10

    iget v4, v3, LW/F;->d:I

    const v6, 0x8000

    or-int/2addr v4, v6

    iput v4, v3, LW/F;->d:I

    iput v5, v3, LW/F;->t:I

    :cond_10
    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v6, v3, LW/F;->u:J

    iput-object v1, v3, LW/F;->x:LW/B;

    iput v5, v3, LW/F;->d:I

    iget-object v1, p0, Ln0/Y;->n:Ln0/z;

    iget-object v4, v1, Ln0/z;->s:LG0/b;

    iput-object v4, v3, LW/F;->v:LG0/b;

    iget-object v4, v1, Ln0/z;->t:LG0/f;

    iput-object v4, v3, LW/F;->w:LG0/f;

    iget-wide v4, p0, Ll0/o;->f:J

    invoke-static {v4, v5}, Lr2/a;->c0(J)J

    move-result-wide v4

    iput-wide v4, v3, LW/F;->u:J

    invoke-static {v1}, Ln0/C;->s(Ln0/z;)Ln0/e0;

    move-result-object v4

    check-cast v4, Lo0/u;

    invoke-virtual {v4}, Lo0/u;->getSnapshotObserver()Ln0/g0;

    move-result-object v4

    sget-object v5, Ln0/J;->h:Ln0/J;

    new-instance v6, LA0/c;

    const/16 v7, 0xe

    invoke-direct {v6, v7, v2}, LA0/c;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, p0, v5, v6}, Ln0/g0;->a(Ln0/f0;Lo2/c;Lo2/a;)V

    iget-object v2, p0, Ln0/Y;->B:Ln0/q;

    if-nez v2, :cond_11

    new-instance v2, Ln0/q;

    invoke-direct {v2}, Ln0/q;-><init>()V

    iput-object v2, p0, Ln0/Y;->B:Ln0/q;

    :cond_11
    iget v4, v3, LW/F;->e:F

    iput v4, v2, Ln0/q;->a:F

    iget v4, v3, LW/F;->f:F

    iput v4, v2, Ln0/q;->b:F

    iget v4, v3, LW/F;->h:F

    iput v4, v2, Ln0/q;->c:F

    iget v4, v3, LW/F;->i:F

    iput v4, v2, Ln0/q;->d:F

    iget v4, v3, LW/F;->m:F

    iput v4, v2, Ln0/q;->e:F

    iget v4, v3, LW/F;->n:F

    iput v4, v2, Ln0/q;->f:F

    iget v4, v3, LW/F;->o:F

    iput v4, v2, Ln0/q;->g:F

    iget v4, v3, LW/F;->p:F

    iput v4, v2, Ln0/q;->h:F

    iget-wide v4, v3, LW/F;->q:J

    iput-wide v4, v2, Ln0/q;->i:J

    invoke-interface {v0, v3}, Ln0/d0;->j(LW/F;)V

    iget-boolean v0, v3, LW/F;->s:Z

    iput-boolean v0, p0, Ln0/Y;->r:Z

    iget v0, v3, LW/F;->g:F

    iput v0, p0, Ln0/Y;->v:F

    if-eqz p1, :cond_14

    iget-object p1, v1, Ln0/z;->l:Lo0/u;

    if-eqz p1, :cond_14

    invoke-virtual {p1, v1}, Lo0/u;->w(Ln0/z;)V

    goto :goto_b

    :cond_12
    const-string p1, "updateLayerParameters requires a non-null layerBlock"

    invoke-static {p1}, LZ0/d;->T(Ljava/lang/String;)V

    throw v1

    :cond_13
    iget-object p1, p0, Ln0/Y;->s:Lo2/c;

    if-nez p1, :cond_15

    :cond_14
    :goto_b
    return-void

    :cond_15
    const-string p1, "null layer with a non-null layerBlock"

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1
.end method

.method public final L0(J)Z
    .locals 4

    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    and-long v2, p1, v0

    xor-long/2addr v0, v2

    const-wide v2, 0x100000001L

    sub-long v2, v0, v2

    not-long v0, v0

    and-long/2addr v0, v2

    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz v0, :cond_0

    iget-boolean v2, p0, Ln0/Y;->r:Z

    if-eqz v2, :cond_0

    invoke-interface {v0, p1, p2}, Ln0/d0;->g(J)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final R()Ln0/L;
    .locals 1

    iget-object v0, p0, Ln0/Y;->o:Ln0/Y;

    return-object v0
.end method

.method public final U()Ll0/g;
    .locals 0

    return-object p0
.end method

.method public final V()Z
    .locals 1

    iget-object v0, p0, Ln0/Y;->w:LM1/j;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final W()Ln0/z;
    .locals 1

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    return-object v0
.end method

.method public final X()LM1/j;
    .locals 2

    iget-object v0, p0, Ln0/Y;->w:LM1/j;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Y()Ln0/L;
    .locals 1

    iget-object v0, p0, Ln0/Y;->p:Ln0/Y;

    return-object v0
.end method

.method public final Z()J
    .locals 2

    iget-wide v0, p0, Ln0/Y;->y:J

    return-wide v0
.end method

.method public final d0()V
    .locals 4

    iget-wide v0, p0, Ln0/Y;->y:J

    iget v2, p0, Ln0/Y;->z:F

    iget-object v3, p0, Ln0/Y;->s:Lo2/c;

    invoke-virtual {p0, v0, v1, v2, v3}, Ll0/o;->G(JFLo2/c;)V

    return-void
.end method

.method public final e0(Ln0/Y;LV/b;Z)V
    .locals 6

    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln0/Y;->p:Ln0/Y;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Ln0/Y;->e0(Ln0/Y;LV/b;Z)V

    :cond_1
    iget-wide v0, p0, Ln0/Y;->y:J

    const/16 p1, 0x20

    shr-long v2, v0, p1

    long-to-int v2, v2

    iget v3, p2, LV/b;->a:F

    int-to-float v2, v2

    sub-float/2addr v3, v2

    iput v3, p2, LV/b;->a:F

    iget v3, p2, LV/b;->c:F

    sub-float/2addr v3, v2

    iput v3, p2, LV/b;->c:F

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    iget v1, p2, LV/b;->b:F

    int-to-float v0, v0

    sub-float/2addr v1, v0

    iput v1, p2, LV/b;->b:F

    iget v1, p2, LV/b;->d:F

    sub-float/2addr v1, v0

    iput v1, p2, LV/b;->d:F

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    invoke-interface {v0, p2, v1}, Ln0/d0;->f(LV/b;Z)V

    iget-boolean v0, p0, Ln0/Y;->r:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_2

    iget-wide v0, p0, Ll0/o;->f:J

    shr-long v4, v0, p1

    long-to-int p1, v4

    int-to-float p1, p1

    and-long/2addr v0, v2

    long-to-int p3, v0

    int-to-float p3, p3

    const/4 v0, 0x0

    invoke-virtual {p2, v0, v0, p1, p3}, LV/b;->a(FFFF)V

    :cond_2
    return-void
.end method

.method public final f()F
    .locals 1

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    iget-object v0, v0, Ln0/z;->s:LG0/b;

    invoke-interface {v0}, LG0/b;->f()F

    move-result v0

    return v0
.end method

.method public final f0(Ln0/Y;J)J
    .locals 3

    if-ne p1, p0, :cond_0

    return-wide p2

    :cond_0
    iget-object v0, p0, Ln0/Y;->p:Ln0/Y;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-static {p1, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Ln0/Y;->f0(Ln0/Y;J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v1}, Ln0/Y;->n0(JZ)J

    move-result-wide p1

    return-wide p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3, v1}, Ln0/Y;->n0(JZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final g0(J)J
    .locals 5

    invoke-static {p1, p2}, LV/f;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ll0/o;->D()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {p1, p2}, LV/f;->b(J)F

    move-result p1

    iget-wide v1, p0, Ll0/o;->f:J

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int p2, v1

    int-to-float p2, p2

    sub-float/2addr p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr v0, p2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    div-float/2addr p1, p2

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v0, p1}, La/a;->d(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public final getLayoutDirection()LG0/f;
    .locals 1

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    iget-object v0, v0, Ln0/z;->t:LG0/f;

    return-object v0
.end method

.method public final h(Ll0/g;Z)LV/d;
    .locals 7

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v0

    iget-boolean v0, v0, LP/k;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ll0/g;->l()Z

    move-result v0

    if-eqz v0, :cond_6

    instance-of v0, p1, Ll0/i;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Ll0/i;

    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, v1, Ll0/i;->d:Ln0/M;

    iget-object v0, v0, Ln0/M;->n:Ln0/Y;

    if-nez v0, :cond_2

    :cond_1
    move-object v0, p1

    check-cast v0, Ln0/Y;

    :cond_2
    invoke-virtual {v0}, Ln0/Y;->A0()V

    invoke-virtual {p0, v0}, Ln0/Y;->m0(Ln0/Y;)Ln0/Y;

    move-result-object v1

    iget-object v2, p0, Ln0/Y;->A:LV/b;

    const/4 v3, 0x0

    if-nez v2, :cond_3

    new-instance v2, LV/b;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput v3, v2, LV/b;->a:F

    iput v3, v2, LV/b;->b:F

    iput v3, v2, LV/b;->c:F

    iput v3, v2, LV/b;->d:F

    iput-object v2, p0, Ln0/Y;->A:LV/b;

    :cond_3
    iput v3, v2, LV/b;->a:F

    iput v3, v2, LV/b;->b:F

    invoke-interface {p1}, Ll0/g;->t()J

    move-result-wide v3

    const/16 v5, 0x20

    shr-long/2addr v3, v5

    long-to-int v3, v3

    int-to-float v3, v3

    iput v3, v2, LV/b;->c:F

    invoke-interface {p1}, Ll0/g;->t()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int p1, v3

    int-to-float p1, p1

    iput p1, v2, LV/b;->d:F

    :goto_0
    if-eq v0, v1, :cond_5

    const/4 p1, 0x0

    invoke-virtual {v0, v2, p2, p1}, Ln0/Y;->F0(LV/b;ZZ)V

    invoke-virtual {v2}, LV/b;->b()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, LV/d;->e:LV/d;

    return-object p1

    :cond_4
    iget-object v0, v0, Ln0/Y;->p:Ln0/Y;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p0, v1, v2, p2}, Ln0/Y;->e0(Ln0/Y;LV/b;Z)V

    new-instance p1, LV/d;

    iget p2, v2, LV/b;->a:F

    iget v0, v2, LV/b;->b:F

    iget v1, v2, LV/b;->c:F

    iget v2, v2, LV/b;->d:F

    invoke-direct {p1, p2, v0, v1, v2}, LV/d;-><init>(FFFF)V

    return-object p1

    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "LayoutCoordinates "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not attached!"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1

    :cond_7
    const-string p1, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v1
.end method

.method public final h0(JJ)F
    .locals 7

    invoke-virtual {p0}, Ll0/o;->D()I

    move-result v0

    int-to-float v0, v0

    invoke-static {p3, p4}, LV/f;->d(J)F

    move-result v1

    cmpl-float v0, v0, v1

    const-wide v1, 0xffffffffL

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ltz v0, :cond_0

    iget-wide v4, p0, Ll0/o;->f:J

    and-long/2addr v4, v1

    long-to-int v0, v4

    int-to-float v0, v0

    invoke-static {p3, p4}, LV/f;->b(J)F

    move-result v4

    cmpl-float v0, v0, v4

    if-ltz v0, :cond_0

    return v3

    :cond_0
    invoke-virtual {p0, p3, p4}, Ln0/Y;->g0(J)J

    move-result-wide p3

    invoke-static {p3, p4}, LV/f;->d(J)F

    move-result v0

    invoke-static {p3, p4}, LV/f;->b(J)F

    move-result p3

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result p4

    const/4 v4, 0x0

    cmpg-float v5, p4, v4

    if-gez v5, :cond_1

    neg-float p4, p4

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ll0/o;->D()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr p4, v5

    :goto_0
    invoke-static {v4, p4}, Ljava/lang/Math;->max(FF)F

    move-result p4

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    cmpg-float p2, p1, v4

    if-gez p2, :cond_2

    neg-float p1, p1

    goto :goto_1

    :cond_2
    iget-wide v5, p0, Ll0/o;->f:J

    and-long/2addr v5, v1

    long-to-int p2, v5

    int-to-float p2, p2

    sub-float/2addr p1, p2

    :goto_1
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p4, p1}, Lr2/a;->f(FF)J

    move-result-wide p1

    cmpl-float p4, v0, v4

    if-gtz p4, :cond_3

    cmpl-float p4, p3, v4

    if-lez p4, :cond_4

    :cond_3
    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result p4

    cmpg-float p4, p4, v0

    if-gtz p4, :cond_4

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p4

    cmpg-float p3, p4, p3

    if-gtz p3, :cond_4

    const/16 p3, 0x20

    shr-long p3, p1, p3

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    mul-float/2addr p3, p3

    mul-float/2addr p1, p1

    add-float v3, p1, p3

    :cond_4
    return v3
.end method

.method public final i0(LW/o;LZ/d;)V
    .locals 5

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ln0/d0;->h(LW/o;LZ/d;)V

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Ln0/Y;->y:J

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-float v2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-interface {p1, v2, v0}, LW/o;->o(FF)V

    invoke-virtual {p0, p1, p2}, Ln0/Y;->k0(LW/o;LZ/d;)V

    neg-float p2, v2

    neg-float v0, v0

    invoke-interface {p1, p2, v0}, LW/o;->o(FF)V

    :goto_0
    return-void
.end method

.method public final j(J)J
    .locals 1

    invoke-virtual {p0, p1, p2}, Ln0/Y;->z0(J)J

    move-result-wide p1

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    invoke-static {v0}, Ln0/C;->s(Ln0/z;)Ln0/e0;

    move-result-object v0

    check-cast v0, Lo0/u;

    invoke-virtual {v0}, Lo0/u;->A()V

    iget-object v0, v0, Lo0/u;->N:[F

    invoke-static {v0, p1, p2}, LW/D;->t([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final j0(LW/o;LW/g;)V
    .locals 10

    iget-wide v0, p0, Ll0/o;->f:J

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    sub-float v7, v2, v3

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    long-to-int v0, v0

    int-to-float v0, v0

    sub-float v8, v0, v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v5, 0x3f000000    # 0.5f

    const/high16 v6, 0x3f000000    # 0.5f

    move-object v4, p1

    move-object v9, p2

    invoke-interface/range {v4 .. v9}, LW/o;->p(FFFFLW/g;)V

    return-void
.end method

.method public final k0(LW/o;LZ/d;)V
    .locals 14

    move-object v7, p0

    const/4 v8, 0x4

    invoke-virtual {p0, v8}, Ln0/Y;->r0(I)LP/k;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p2}, Ln0/Y;->D0(LW/o;LZ/d;)V

    goto/16 :goto_4

    :cond_0
    iget-object v1, v7, Ln0/Y;->n:Ln0/z;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Ln0/C;->s(Ln0/z;)Ln0/e0;

    move-result-object v1

    check-cast v1, Lo0/u;

    invoke-virtual {v1}, Lo0/u;->getSharedDrawScope()Ln0/B;

    move-result-object v9

    iget-wide v1, v7, Ll0/o;->f:J

    invoke-static {v1, v2}, Lr2/a;->c0(J)J

    move-result-wide v10

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x0

    move-object v13, v12

    :goto_0
    if-eqz v0, :cond_8

    instance-of v1, v0, Ln0/k;

    if-eqz v1, :cond_1

    move-object v5, v0

    check-cast v5, Ln0/k;

    move-object v0, v9

    move-object v1, p1

    move-wide v2, v10

    move-object v4, p0

    move-object/from16 v6, p2

    invoke-virtual/range {v0 .. v6}, Ln0/B;->c(LW/o;JLn0/Y;Ln0/k;LZ/d;)V

    goto :goto_3

    :cond_1
    iget v1, v0, LP/k;->f:I

    and-int/2addr v1, v8

    if-eqz v1, :cond_7

    instance-of v1, v0, Ln0/i;

    if-eqz v1, :cond_7

    move-object v1, v0

    check-cast v1, Ln0/i;

    iget-object v1, v1, Ln0/i;->r:LP/k;

    const/4 v2, 0x0

    :goto_1
    const/4 v3, 0x1

    if-eqz v1, :cond_6

    iget v4, v1, LP/k;->f:I

    and-int/2addr v4, v8

    if-eqz v4, :cond_5

    add-int/lit8 v2, v2, 0x1

    if-ne v2, v3, :cond_2

    move-object v0, v1

    goto :goto_2

    :cond_2
    if-nez v13, :cond_3

    new-instance v13, LF/d;

    const/16 v3, 0x10

    new-array v3, v3, [LP/k;

    invoke-direct {v13, v3}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v13, v0}, LF/d;->b(Ljava/lang/Object;)V

    move-object v0, v12

    :cond_4
    invoke-virtual {v13, v1}, LF/d;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    iget-object v1, v1, LP/k;->i:LP/k;

    goto :goto_1

    :cond_6
    if-ne v2, v3, :cond_7

    goto :goto_0

    :cond_7
    :goto_3
    invoke-static {v13}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v0

    goto :goto_0

    :cond_8
    :goto_4
    return-void
.end method

.method public final l()Z
    .locals 1

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v0

    iget-boolean v0, v0, LP/k;->p:Z

    return v0
.end method

.method public abstract l0()V
.end method

.method public final m0(Ln0/Y;)Ln0/Y;
    .locals 5

    iget-object v0, p1, Ln0/Y;->n:Ln0/z;

    iget-object v1, p0, Ln0/Y;->n:Ln0/z;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Ln0/Y;->q0()LP/k;

    move-result-object v0

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v1

    iget-object v1, v1, LP/k;->d:LP/k;

    iget-boolean v2, v1, LP/k;->p:Z

    if-eqz v2, :cond_2

    iget-object v1, v1, LP/k;->h:LP/k;

    :goto_0
    if-eqz v1, :cond_1

    iget v2, v1, LP/k;->f:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    if-ne v1, v0, :cond_0

    return-object p1

    :cond_0
    iget-object v1, v1, LP/k;->h:LP/k;

    goto :goto_0

    :cond_1
    return-object p0

    :cond_2
    const-string p1, "visitLocalAncestors called on an unattached node"

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_3
    :goto_1
    iget v2, v0, Ln0/z;->m:I

    iget v3, v1, Ln0/z;->m:I

    if-le v2, v3, :cond_4

    invoke-virtual {v0}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_2
    iget v3, v2, Ln0/z;->m:I

    iget v4, v0, Ln0/z;->m:I

    if-le v3, v4, :cond_5

    invoke-virtual {v2}, Ln0/z;->k()Ln0/z;

    move-result-object v2

    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    :goto_3
    if-eq v0, v2, :cond_7

    invoke-virtual {v0}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    invoke-virtual {v2}, Ln0/z;->k()Ln0/z;

    move-result-object v2

    if-eqz v0, :cond_6

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "layouts are not part of the same hierarchy"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    if-ne v2, v1, :cond_8

    move-object p1, p0

    goto :goto_4

    :cond_8
    iget-object v1, p1, Ln0/Y;->n:Ln0/z;

    if-ne v0, v1, :cond_9

    goto :goto_4

    :cond_9
    iget-object p1, v0, Ln0/z;->x:LD/s;

    iget-object p1, p1, LD/s;->c:Ljava/lang/Object;

    check-cast p1, Ln0/p;

    :goto_4
    return-object p1
.end method

.method public final n()F
    .locals 1

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    iget-object v0, v0, Ln0/z;->s:LG0/b;

    invoke-interface {v0}, LG0/b;->n()F

    move-result v0

    return v0
.end method

.method public final n0(JZ)J
    .locals 4

    iget-wide v0, p0, Ln0/Y;->y:J

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result p3

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-float v2, v2

    sub-float/2addr p3, v2

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p2, v0

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-static {p3, p1}, Lr2/a;->f(FF)J

    move-result-wide p1

    iget-object p3, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    invoke-interface {p3, p1, p2, v0}, Ln0/d0;->b(JZ)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public final o()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    iget-object v1, v0, Ln0/z;->x:LD/s;

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, LD/s;->f(I)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    iget-object v0, v0, Ln0/z;->x:LD/s;

    iget-object v0, v0, LD/s;->e:Ljava/lang/Object;

    check-cast v0, Ln0/m0;

    move-object v1, v3

    :goto_0
    if-eqz v0, :cond_8

    iget v4, v0, LP/k;->f:I

    and-int/2addr v4, v2

    if-eqz v4, :cond_7

    move-object v4, v0

    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_7

    instance-of v6, v4, Ln0/h0;

    if-eqz v6, :cond_0

    check-cast v4, Ln0/h0;

    invoke-interface {v4}, Ln0/h0;->I()Ljava/lang/Object;

    move-result-object v1

    goto :goto_4

    :cond_0
    iget v6, v4, LP/k;->f:I

    and-int/2addr v6, v2

    if-eqz v6, :cond_6

    instance-of v6, v4, Ln0/i;

    if-eqz v6, :cond_6

    move-object v6, v4

    check-cast v6, Ln0/i;

    iget-object v6, v6, Ln0/i;->r:LP/k;

    const/4 v7, 0x0

    :goto_2
    const/4 v8, 0x1

    if-eqz v6, :cond_5

    iget v9, v6, LP/k;->f:I

    and-int/2addr v9, v2

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v4, v6

    goto :goto_3

    :cond_1
    if-nez v5, :cond_2

    new-instance v5, LF/d;

    const/16 v8, 0x10

    new-array v8, v8, [LP/k;

    invoke-direct {v5, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v5, v4}, LF/d;->b(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_3
    invoke-virtual {v5, v6}, LF/d;->b(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v6, v6, LP/k;->i:LP/k;

    goto :goto_2

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v5}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v4

    goto :goto_1

    :cond_7
    iget-object v0, v0, LP/k;->h:LP/k;

    goto :goto_0

    :cond_8
    return-object v1

    :cond_9
    return-object v3
.end method

.method public abstract o0()Ln0/M;
.end method

.method public final p()Ll0/g;
    .locals 1

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v0

    iget-boolean v0, v0, LP/k;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ln0/Y;->A0()V

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    iget-object v0, v0, Ln0/z;->x:LD/s;

    iget-object v0, v0, LD/s;->d:Ljava/lang/Object;

    check-cast v0, Ln0/Y;

    iget-object v0, v0, Ln0/Y;->p:Ln0/Y;

    return-object v0

    :cond_0
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final p0()J
    .locals 3

    iget-object v0, p0, Ln0/Y;->t:LG0/b;

    iget-object v1, p0, Ln0/Y;->n:Ln0/z;

    iget-object v1, v1, Ln0/z;->u:Lo0/F0;

    invoke-interface {v1}, Lo0/F0;->a()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LG0/b;->q(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract q0()LP/k;
.end method

.method public final r0(I)LP/k;
    .locals 3

    invoke-static {p1}, Ln0/Z;->g(I)Z

    move-result v0

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v1, LP/k;->h:LP/k;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Ln0/Y;->s0(Z)LP/k;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    iget v2, v0, LP/k;->g:I

    and-int/2addr v2, p1

    if-eqz v2, :cond_3

    iget v2, v0, LP/k;->f:I

    and-int/2addr v2, p1

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    if-eq v0, v1, :cond_3

    iget-object v0, v0, LP/k;->i:LP/k;

    goto :goto_1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final s0(Z)LP/k;
    .locals 2

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    iget-object v0, v0, Ln0/z;->x:LD/s;

    iget-object v1, v0, LD/s;->d:Ljava/lang/Object;

    check-cast v1, Ln0/Y;

    if-ne v1, p0, :cond_0

    iget-object p1, v0, LD/s;->f:Ljava/lang/Object;

    check-cast p1, LP/k;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Ln0/Y;->p:Ln0/Y;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ln0/Y;->q0()LP/k;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p1, LP/k;->i:LP/k;

    goto :goto_0

    :cond_1
    move-object p1, v0

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ln0/Y;->p:Ln0/Y;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ln0/Y;->q0()LP/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final t()J
    .locals 2

    iget-wide v0, p0, Ll0/o;->f:J

    return-wide v0
.end method

.method public final t0(LP/k;Ln0/V;JLn0/n;ZZ)V
    .locals 12

    move-object v9, p1

    move-object/from16 v10, p5

    if-nez v9, :cond_0

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Ln0/Y;->v0(Ln0/V;JLn0/n;ZZ)V

    goto/16 :goto_5

    :cond_0
    new-instance v11, Ln0/W;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Ln0/W;-><init>(Ln0/Y;LP/k;Ln0/V;JLn0/n;ZZ)V

    const/high16 v0, -0x40800000    # -1.0f

    move/from16 v1, p7

    invoke-virtual {v10, p1, v0, v1, v11}, Ln0/n;->b(LP/k;FZLo2/a;)V

    iget-object v0, v9, LP/k;->k:Ln0/Y;

    if-eqz v0, :cond_c

    const/16 v1, 0x10

    invoke-static {v1}, Ln0/Z;->g(I)Z

    move-result v2

    invoke-virtual {v0, v2}, Ln0/Y;->s0(Z)LP/k;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-boolean v3, v0, LP/k;->p:Z

    if-eqz v3, :cond_b

    iget-object v0, v0, LP/k;->d:LP/k;

    iget-boolean v3, v0, LP/k;->p:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_a

    iget v3, v0, LP/k;->g:I

    and-int/2addr v3, v1

    if-eqz v3, :cond_b

    :goto_0
    if-eqz v0, :cond_b

    iget v3, v0, LP/k;->f:I

    and-int/2addr v3, v1

    if-eqz v3, :cond_9

    move-object v3, v0

    move-object v5, v4

    :goto_1
    if-eqz v3, :cond_9

    instance-of v6, v3, Ln0/j0;

    if-eqz v6, :cond_2

    check-cast v3, Ln0/j0;

    invoke-interface {v3}, Ln0/j0;->l()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_2
    iget v6, v3, LP/k;->f:I

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    instance-of v6, v3, Ln0/i;

    if-eqz v6, :cond_8

    move-object v6, v3

    check-cast v6, Ln0/i;

    iget-object v6, v6, Ln0/i;->r:LP/k;

    move v7, v2

    :goto_2
    const/4 v8, 0x1

    if-eqz v6, :cond_7

    iget v9, v6, LP/k;->f:I

    and-int/2addr v9, v1

    if-eqz v9, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_3

    move-object v3, v6

    goto :goto_3

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LF/d;

    new-array v8, v1, [LP/k;

    invoke-direct {v5, v8}, LF/d;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v5, v3}, LF/d;->b(Ljava/lang/Object;)V

    move-object v3, v4

    :cond_5
    invoke-virtual {v5, v6}, LF/d;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    iget-object v6, v6, LP/k;->i:LP/k;

    goto :goto_2

    :cond_7
    if-ne v7, v8, :cond_8

    goto :goto_1

    :cond_8
    invoke-static {v5}, Ln0/C;->e(LF/d;)LP/k;

    move-result-object v3

    goto :goto_1

    :cond_9
    iget-object v0, v0, LP/k;->i:LP/k;

    goto :goto_0

    :cond_a
    const-string v0, "visitLocalDescendants called on an unattached node"

    invoke-static {v0}, LZ0/d;->S(Ljava/lang/String;)V

    throw v4

    :cond_b
    :goto_4
    iput-boolean v2, v10, Ln0/n;->h:Z

    :cond_c
    :goto_5
    return-void
.end method

.method public final u0(Ln0/V;JLn0/n;ZZ)V
    .locals 17

    move-object/from16 v11, p0

    move-wide/from16 v4, p2

    move-object/from16 v12, p4

    move/from16 v13, p6

    invoke-virtual/range {p1 .. p1}, Ln0/V;->a()I

    move-result v0

    invoke-virtual {v11, v0}, Ln0/Y;->r0(I)LP/k;

    move-result-object v14

    invoke-virtual {v11, v4, v5}, Ln0/Y;->L0(J)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p5, :cond_9

    invoke-virtual/range {p0 .. p0}, Ln0/Y;->p0()J

    move-result-wide v0

    invoke-virtual {v11, v4, v5, v0, v1}, Ln0/Y;->h0(JJ)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_9

    iget v0, v12, Ln0/n;->f:I

    invoke-static/range {p4 .. p4}, Ld2/l;->T(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v13, v0}, Ln0/C;->a(FZ)J

    move-result-wide v0

    invoke-virtual/range {p4 .. p4}, Ln0/n;->a()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ln0/C;->g(JJ)I

    move-result v0

    if-lez v0, :cond_9

    :goto_0
    const/4 v15, 0x0

    if-nez v14, :cond_1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move v6, v15

    invoke-virtual/range {v0 .. v6}, Ln0/Y;->v0(Ln0/V;JLn0/n;ZZ)V

    goto/16 :goto_4

    :cond_1
    new-instance v10, Ln0/X;

    const/16 v16, 0x0

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v14

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move-object/from16 v6, p4

    move/from16 v7, p5

    move v8, v15

    move v9, v13

    move-object v11, v10

    move/from16 v10, v16

    invoke-direct/range {v0 .. v10}, Ln0/X;-><init>(Ln0/Y;LP/k;Ln0/V;JLn0/n;ZZFI)V

    invoke-virtual {v12, v14, v13, v15, v11}, Ln0/n;->b(LP/k;FZLo2/a;)V

    goto/16 :goto_4

    :cond_2
    if-nez v14, :cond_3

    invoke-virtual/range {p0 .. p6}, Ln0/Y;->v0(Ln0/V;JLn0/n;ZZ)V

    goto/16 :goto_4

    :cond_3
    invoke-static/range {p2 .. p3}, LV/c;->b(J)F

    move-result v0

    invoke-static/range {p2 .. p3}, LV/c;->c(J)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v3, v0, v2

    if-ltz v3, :cond_4

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_4

    invoke-virtual/range {p0 .. p0}, Ll0/o;->D()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_4

    move-object/from16 v11, p0

    iget-wide v2, v11, Ll0/o;->f:J

    const-wide v6, 0xffffffffL

    and-long/2addr v2, v6

    long-to-int v0, v2

    int-to-float v0, v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_5

    move-object/from16 v0, p0

    move-object v1, v14

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-virtual/range {v0 .. v7}, Ln0/Y;->t0(LP/k;Ln0/V;JLn0/n;ZZ)V

    goto/16 :goto_4

    :cond_4
    move-object/from16 v11, p0

    :cond_5
    if-nez p5, :cond_6

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    :goto_1
    move v15, v0

    goto :goto_2

    :cond_6
    invoke-virtual/range {p0 .. p0}, Ln0/Y;->p0()J

    move-result-wide v0

    invoke-virtual {v11, v4, v5, v0, v1}, Ln0/Y;->h0(JJ)F

    move-result v0

    goto :goto_1

    :goto_2
    invoke-static {v15}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_8

    iget v0, v12, Ln0/n;->f:I

    invoke-static/range {p4 .. p4}, Ld2/l;->T(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {v15, v13}, Ln0/C;->a(FZ)J

    move-result-wide v0

    invoke-virtual/range {p4 .. p4}, Ln0/n;->a()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ln0/C;->g(JJ)I

    move-result v0

    if-lez v0, :cond_8

    :goto_3
    new-instance v10, Ln0/X;

    const/16 v16, 0x0

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v14

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move-object/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move v9, v15

    move-object v11, v10

    move/from16 v10, v16

    invoke-direct/range {v0 .. v10}, Ln0/X;-><init>(Ln0/Y;LP/k;Ln0/V;JLn0/n;ZZFI)V

    invoke-virtual {v12, v14, v15, v13, v11}, Ln0/n;->b(LP/k;FZLo2/a;)V

    goto :goto_4

    :cond_8
    move-object/from16 v0, p0

    move-object v1, v14

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move v8, v15

    invoke-virtual/range {v0 .. v8}, Ln0/Y;->H0(LP/k;Ln0/V;JLn0/n;ZZF)V

    :cond_9
    :goto_4
    return-void
.end method

.method public v0(Ln0/V;JLn0/n;ZZ)V
    .locals 7

    iget-object v0, p0, Ln0/Y;->o:Ln0/Y;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Ln0/Y;->n0(JZ)J

    move-result-wide v2

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Ln0/Y;->u0(Ln0/V;JLn0/n;ZZ)V

    :cond_0
    return-void
.end method

.method public final w()Z
    .locals 1

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ln0/Y;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ln0/Y;->n:Ln0/z;

    invoke-virtual {v0}, Ln0/z;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w0()V
    .locals 1

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln0/d0;->invalidate()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln0/Y;->p:Ln0/Y;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/Y;->w0()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final x0()Z
    .locals 2

    iget-object v0, p0, Ln0/Y;->F:Ln0/d0;

    if-eqz v0, :cond_0

    iget v0, p0, Ln0/Y;->v:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Ln0/Y;->p:Ln0/Y;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/Y;->x0()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final y0(Ll0/g;J)J
    .locals 2

    instance-of v0, p1, Ll0/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ll0/i;

    iget-object v0, v0, Ll0/i;->d:Ln0/M;

    iget-object v0, v0, Ln0/M;->n:Ln0/Y;

    invoke-virtual {v0}, Ln0/Y;->A0()V

    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    xor-long/2addr p2, v0

    check-cast p1, Ll0/i;

    invoke-virtual {p1, p0, p2, p3}, Ll0/i;->a(Ll0/g;J)J

    move-result-wide p1

    xor-long/2addr p1, v0

    return-wide p1

    :cond_0
    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ll0/i;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Ll0/i;->d:Ln0/M;

    iget-object v0, v0, Ln0/M;->n:Ln0/Y;

    if-nez v0, :cond_3

    :cond_2
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    invoke-static {p1, v0}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ln0/Y;

    :cond_3
    invoke-virtual {v0}, Ln0/Y;->A0()V

    invoke-virtual {p0, v0}, Ln0/Y;->m0(Ln0/Y;)Ln0/Y;

    move-result-object p1

    :goto_1
    if-eq v0, p1, :cond_4

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p3, v1}, Ln0/Y;->I0(JZ)J

    move-result-wide p2

    iget-object v0, v0, Ln0/Y;->p:Ln0/Y;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1, p2, p3}, Ln0/Y;->f0(Ln0/Y;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final z0(J)J
    .locals 2

    invoke-virtual {p0}, Ln0/Y;->q0()LP/k;

    move-result-object v0

    iget-boolean v0, v0, LP/k;->p:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ln0/Y;->A0()V

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Ln0/Y;->I0(JZ)J

    move-result-wide p1

    iget-object v0, v0, Ln0/Y;->p:Ln0/Y;

    goto :goto_0

    :cond_0
    return-wide p1

    :cond_1
    const-string p1, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
