.class public final LZ/q;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final n:LZ/p;


# instance fields
.field public final d:La0/a;

.field public final e:LW/p;

.field public final f:LY/b;

.field public g:Z

.field public h:Landroid/graphics/Outline;

.field public i:Z

.field public j:LG0/b;

.field public k:LG0/f;

.field public l:Lp2/h;

.field public m:LZ/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZ/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZ/p;-><init>(I)V

    sput-object v0, LZ/q;->n:LZ/p;

    return-void
.end method

.method public constructor <init>(La0/a;LW/p;LY/b;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, LZ/q;->d:La0/a;

    iput-object p2, p0, LZ/q;->e:LW/p;

    iput-object p3, p0, LZ/q;->f:LY/b;

    sget-object p1, LZ/q;->n:LZ/p;

    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LZ/q;->i:Z

    sget-object p1, LY/c;->a:LG0/c;

    iput-object p1, p0, LZ/q;->j:LG0/b;

    sget-object p1, LG0/f;->d:LG0/f;

    iput-object p1, p0, LZ/q;->k:LG0/f;

    sget-object p1, LZ/f;->a:LZ/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, LZ/c;->g:LZ/c;

    iput-object p1, p0, LZ/q;->l:Lp2/h;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 16

    move-object/from16 v1, p0

    iget-object v0, v1, LZ/q;->e:LW/p;

    iget-object v2, v0, LW/p;->a:LW/c;

    iget-object v3, v2, LW/c;->a:Landroid/graphics/Canvas;

    move-object/from16 v4, p1

    iput-object v4, v2, LW/c;->a:Landroid/graphics/Canvas;

    iget-object v4, v1, LZ/q;->j:LG0/b;

    iget-object v5, v1, LZ/q;->k:LG0/f;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    invoke-static {v6, v7}, La/a;->d(FF)J

    move-result-wide v6

    iget-object v8, v1, LZ/q;->m:LZ/d;

    iget-object v9, v1, LZ/q;->l:Lp2/h;

    iget-object v10, v1, LZ/q;->f:LY/b;

    iget-object v11, v10, LY/b;->e:LB0/a;

    invoke-virtual {v11}, LB0/a;->l()LG0/b;

    move-result-object v11

    iget-object v12, v10, LY/b;->e:LB0/a;

    invoke-virtual {v12}, LB0/a;->p()LG0/f;

    move-result-object v13

    invoke-virtual {v12}, LB0/a;->j()LW/o;

    move-result-object v14

    move-object/from16 p1, v14

    invoke-virtual {v12}, LB0/a;->r()J

    move-result-wide v14

    iget-object v1, v12, LB0/a;->c:Ljava/lang/Object;

    check-cast v1, LZ/d;

    invoke-virtual {v12, v4}, LB0/a;->G(LG0/b;)V

    invoke-virtual {v12, v5}, LB0/a;->I(LG0/f;)V

    invoke-virtual {v12, v2}, LB0/a;->F(LW/o;)V

    invoke-virtual {v12, v6, v7}, LB0/a;->J(J)V

    iput-object v8, v12, LB0/a;->c:Ljava/lang/Object;

    invoke-virtual {v2}, LW/c;->d()V

    :try_start_0
    invoke-interface {v9, v10}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, LW/c;->a()V

    invoke-virtual {v12, v11}, LB0/a;->G(LG0/b;)V

    invoke-virtual {v12, v13}, LB0/a;->I(LG0/f;)V

    move-object/from16 v4, p1

    invoke-virtual {v12, v4}, LB0/a;->F(LW/o;)V

    invoke-virtual {v12, v14, v15}, LB0/a;->J(J)V

    iput-object v1, v12, LB0/a;->c:Ljava/lang/Object;

    iget-object v0, v0, LW/p;->a:LW/c;

    iput-object v3, v0, LW/c;->a:Landroid/graphics/Canvas;

    const/4 v0, 0x0

    move-object/from16 v3, p0

    iput-boolean v0, v3, LZ/q;->g:Z

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object v5, v0

    invoke-virtual {v2}, LW/c;->a()V

    invoke-virtual {v12, v11}, LB0/a;->G(LG0/b;)V

    invoke-virtual {v12, v13}, LB0/a;->I(LG0/f;)V

    invoke-virtual {v12, v4}, LB0/a;->F(LW/o;)V

    invoke-virtual {v12, v14, v15}, LB0/a;->J(J)V

    iput-object v1, v12, LB0/a;->c:Ljava/lang/Object;

    throw v5
.end method

.method public final forceLayout()V
    .locals 0

    return-void
.end method

.method public final getCanUseCompositingLayer$ui_graphics_release()Z
    .locals 1

    iget-boolean v0, p0, LZ/q;->i:Z

    return v0
.end method

.method public final getCanvasHolder()LW/p;
    .locals 1

    iget-object v0, p0, LZ/q;->e:LW/p;

    return-object v0
.end method

.method public final getOwnerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LZ/q;->d:La0/a;

    return-object v0
.end method

.method public final hasOverlappingRendering()Z
    .locals 1

    iget-boolean v0, p0, LZ/q;->i:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-boolean v0, p0, LZ/q;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LZ/q;->g:Z

    invoke-super {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final setCanUseCompositingLayer$ui_graphics_release(Z)V
    .locals 1

    iget-boolean v0, p0, LZ/q;->i:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, LZ/q;->i:Z

    invoke-virtual {p0}, LZ/q;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setInvalidated(Z)V
    .locals 0

    iput-boolean p1, p0, LZ/q;->g:Z

    return-void
.end method
