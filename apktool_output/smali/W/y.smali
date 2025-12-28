.class public final LW/y;
.super LW/B;
.source "SourceFile"


# instance fields
.field public final a:LW/i;


# direct methods
.method public constructor <init>(LW/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW/y;->a:LW/i;

    return-void
.end method


# virtual methods
.method public final a()LV/d;
    .locals 5

    iget-object v0, p0, LW/y;->a:LW/i;

    iget-object v1, v0, LW/i;->b:Landroid/graphics/RectF;

    if-nez v1, :cond_0

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, v0, LW/i;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v1, v0, LW/i;->b:Landroid/graphics/RectF;

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object v0, v0, LW/i;->a:Landroid/graphics/Path;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    new-instance v0, LV/d;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v3, v1, Landroid/graphics/RectF;->top:F

    iget v4, v1, Landroid/graphics/RectF;->right:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v2, v3, v4, v1}, LV/d;-><init>(FFFF)V

    return-object v0
.end method
