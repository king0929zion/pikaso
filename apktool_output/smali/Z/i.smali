.class public final LZ/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/f;


# instance fields
.field public final b:LW/p;

.field public final c:LY/b;

.field public final d:Landroid/graphics/RenderNode;

.field public e:J

.field public f:Landroid/graphics/Matrix;

.field public g:Z

.field public h:F

.field public final i:I

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:J

.field public p:J

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:I


# direct methods
.method public constructor <init>()V
    .locals 4

    new-instance v0, LW/p;

    invoke-direct {v0}, LW/p;-><init>()V

    new-instance v1, LY/b;

    invoke-direct {v1}, LY/b;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LZ/i;->b:LW/p;

    iput-object v1, p0, LZ/i;->c:LY/b;

    invoke-static {}, LZ/h;->b()Landroid/graphics/RenderNode;

    move-result-object v0

    iput-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, LZ/i;->e:J

    invoke-static {v0}, LZ/h;->z(Landroid/graphics/RenderNode;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, LZ/i;->N(Landroid/graphics/RenderNode;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LZ/i;->h:F

    const/4 v2, 0x3

    iput v2, p0, LZ/i;->i:I

    iput v0, p0, LZ/i;->j:F

    iput v0, p0, LZ/i;->k:F

    sget-wide v2, LW/r;->b:J

    iput-wide v2, p0, LZ/i;->o:J

    iput-wide v2, p0, LZ/i;->p:J

    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p0, LZ/i;->t:F

    iput v1, p0, LZ/i;->x:I

    return-void
.end method

.method public static N(Landroid/graphics/RenderNode;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, LZ/b;->o(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, LZ/h;->m(Landroid/graphics/RenderNode;)V

    invoke-static {p0}, LZ/h;->p(Landroid/graphics/RenderNode;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    invoke-static {p1, v0}, LZ/b;->o(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, LZ/h;->s(Landroid/graphics/RenderNode;)V

    invoke-static {p0}, LZ/h;->v(Landroid/graphics/RenderNode;)V

    goto :goto_0

    :cond_1
    invoke-static {p0}, LZ/h;->s(Landroid/graphics/RenderNode;)V

    invoke-static {p0}, LZ/h;->p(Landroid/graphics/RenderNode;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 1

    iput-wide p1, p0, LZ/i;->o:J

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, LW/D;->C(J)I

    move-result p1

    invoke-static {v0, p1}, LZ/h;->i(Landroid/graphics/RenderNode;I)V

    return-void
.end method

.method public final B()F
    .locals 1

    iget v0, p0, LZ/i;->n:F

    return v0
.end method

.method public final C()F
    .locals 1

    iget v0, p0, LZ/i;->k:F

    return v0
.end method

.method public final D()F
    .locals 1

    iget v0, p0, LZ/i;->t:F

    return v0
.end method

.method public final E()F
    .locals 1

    iget v0, p0, LZ/i;->s:F

    return v0
.end method

.method public final F()I
    .locals 1

    iget v0, p0, LZ/i;->i:I

    return v0
.end method

.method public final G(J)V
    .locals 2

    invoke-static {p1, p2}, Lr2/a;->M(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p1}, LZ/h;->x(Landroid/graphics/RenderNode;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result v1

    invoke-static {v0, v1}, LZ/h;->q(Landroid/graphics/RenderNode;F)V

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    invoke-static {v0, p1}, LZ/h;->t(Landroid/graphics/RenderNode;F)V

    :goto_0
    return-void
.end method

.method public final H()J
    .locals 2

    iget-wide v0, p0, LZ/i;->o:J

    return-wide v0
.end method

.method public final I()F
    .locals 1

    iget v0, p0, LZ/i;->l:F

    return v0
.end method

.method public final J(Z)V
    .locals 0

    iput-boolean p1, p0, LZ/i;->u:Z

    invoke-virtual {p0}, LZ/i;->M()V

    return-void
.end method

.method public final K()I
    .locals 1

    iget v0, p0, LZ/i;->x:I

    return v0
.end method

.method public final L()F
    .locals 1

    iget v0, p0, LZ/i;->q:F

    return v0
.end method

.method public final M()V
    .locals 4

    iget-boolean v0, p0, LZ/i;->u:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v3, p0, LZ/i;->g:Z

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-boolean v0, p0, LZ/i;->g:Z

    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v0, p0, LZ/i;->v:Z

    if-eq v3, v0, :cond_2

    iput-boolean v3, p0, LZ/i;->v:Z

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, v3}, LW/a;->m(Landroid/graphics/RenderNode;Z)V

    :cond_2
    iget-boolean v0, p0, LZ/i;->w:Z

    if-eq v1, v0, :cond_3

    iput-boolean v1, p0, LZ/i;->w:Z

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, v1}, LW/a;->s(Landroid/graphics/RenderNode;Z)V

    :cond_3
    return-void
.end method

.method public final a()F
    .locals 1

    iget v0, p0, LZ/i;->h:F

    return v0
.end method

.method public final b(F)V
    .locals 1

    iput p1, p0, LZ/i;->r:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LZ/h;->C(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final c(F)V
    .locals 1

    iput p1, p0, LZ/i;->l:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LZ/h;->A(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final d(F)V
    .locals 1

    iput p1, p0, LZ/i;->h:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LW/a;->w(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LZ/i;->u:Z

    return v0
.end method

.method public final f(F)V
    .locals 1

    iput p1, p0, LZ/i;->k:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LW/a;->j(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final g()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, LZ/o;->a:LZ/o;

    iget-object v1, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LZ/o;->a(Landroid/graphics/RenderNode;LW/E;)V

    :cond_0
    return-void
.end method

.method public final h(F)V
    .locals 1

    iput p1, p0, LZ/i;->s:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LZ/h;->D(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final i(F)V
    .locals 1

    iput p1, p0, LZ/i;->m:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LW/a;->r(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final j(F)V
    .locals 1

    iput p1, p0, LZ/i;->t:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LZ/h;->w(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0}, LW/a;->n(Landroid/graphics/RenderNode;)Z

    move-result v0

    return v0
.end method

.method public final l(Landroid/graphics/Outline;)V
    .locals 1

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LZ/h;->k(Landroid/graphics/RenderNode;Landroid/graphics/Outline;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LZ/i;->g:Z

    invoke-virtual {p0}, LZ/i;->M()V

    return-void
.end method

.method public final m(F)V
    .locals 1

    iput p1, p0, LZ/i;->j:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LZ/h;->h(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final n(F)V
    .locals 1

    iput p1, p0, LZ/i;->q:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LZ/h;->n(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0}, LZ/h;->g(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public final p(I)V
    .locals 2

    iput p1, p0, LZ/i;->x:I

    const/4 v0, 0x1

    invoke-static {p1, v0}, LZ/b;->o(II)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x3

    iget v1, p0, LZ/i;->i:I

    invoke-static {v1, p1}, LW/D;->l(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    iget v0, p0, LZ/i;->x:I

    invoke-static {p1, v0}, LZ/i;->N(Landroid/graphics/RenderNode;I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p1, v0}, LZ/i;->N(Landroid/graphics/RenderNode;I)V

    :goto_0
    return-void
.end method

.method public final q(J)V
    .locals 1

    iput-wide p1, p0, LZ/i;->p:J

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p1, p2}, LW/D;->C(J)I

    move-result p1

    invoke-static {v0, p1}, LW/a;->k(Landroid/graphics/RenderNode;I)V

    return-void
.end method

.method public final r()F
    .locals 1

    iget v0, p0, LZ/i;->j:F

    return v0
.end method

.method public final s()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, LZ/i;->f:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LZ/i;->f:Landroid/graphics/Matrix;

    :cond_0
    iget-object v1, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v1, v0}, LW/a;->l(Landroid/graphics/RenderNode;Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public final t(F)V
    .locals 1

    iput p1, p0, LZ/i;->n:F

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v0, p1}, LZ/h;->y(Landroid/graphics/RenderNode;F)V

    return-void
.end method

.method public final u()F
    .locals 1

    iget v0, p0, LZ/i;->m:F

    return v0
.end method

.method public final v(IIJ)V
    .locals 4

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    const/16 v1, 0x20

    shr-long v1, p3, v1

    long-to-int v1, v1

    add-int/2addr v1, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v2, p3

    long-to-int v2, v2

    add-int/2addr v2, p2

    invoke-static {v0, p1, p2, v1, v2}, LZ/h;->j(Landroid/graphics/RenderNode;IIII)V

    invoke-static {p3, p4}, Lr2/a;->c0(J)J

    move-result-wide p1

    iput-wide p1, p0, LZ/i;->e:J

    return-void
.end method

.method public final w()F
    .locals 1

    iget v0, p0, LZ/i;->r:F

    return v0
.end method

.method public final x(LW/o;)V
    .locals 1

    invoke-static {p1}, LW/d;->a(LW/o;)Landroid/graphics/Canvas;

    move-result-object p1

    iget-object v0, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p1, v0}, LZ/h;->f(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public final y(LG0/b;LG0/f;LZ/d;Lo2/c;)V
    .locals 5

    iget-object v0, p0, LZ/i;->c:LY/b;

    iget-object v1, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {v1}, LZ/h;->a(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, LZ/i;->b:LW/p;

    iget-object v3, v2, LW/p;->a:LW/c;

    iget-object v4, v3, LW/c;->a:Landroid/graphics/Canvas;

    iput-object v1, v3, LW/c;->a:Landroid/graphics/Canvas;

    iget-object v1, v0, LY/b;->e:LB0/a;

    invoke-virtual {v1, p1}, LB0/a;->G(LG0/b;)V

    invoke-virtual {v1, p2}, LB0/a;->I(LG0/f;)V

    iput-object p3, v1, LB0/a;->c:Ljava/lang/Object;

    iget-wide p1, p0, LZ/i;->e:J

    invoke-virtual {v1, p1, p2}, LB0/a;->J(J)V

    invoke-virtual {v1, v3}, LB0/a;->F(LW/o;)V

    invoke-interface {p4, v0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v2, LW/p;->a:LW/c;

    iput-object v4, p1, LW/c;->a:Landroid/graphics/Canvas;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p1}, LZ/h;->B(Landroid/graphics/RenderNode;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LZ/i;->d:Landroid/graphics/RenderNode;

    invoke-static {p2}, LZ/h;->B(Landroid/graphics/RenderNode;)V

    throw p1
.end method

.method public final z()J
    .locals 2

    iget-wide v0, p0, LZ/i;->p:J

    return-wide v0
.end method
