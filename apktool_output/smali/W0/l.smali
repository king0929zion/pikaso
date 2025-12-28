.class public final Lw0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:Landroid/text/TextPaint;

.field public final c:I

.field public d:F

.field public e:F

.field public f:Landroid/text/BoringLayout$Metrics;

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/l;->a:Ljava/lang/CharSequence;

    iput-object p2, p0, Lw0/l;->b:Landroid/text/TextPaint;

    iput p3, p0, Lw0/l;->c:I

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lw0/l;->d:F

    iput p1, p0, Lw0/l;->e:F

    return-void
.end method


# virtual methods
.method public final a()Landroid/text/BoringLayout$Metrics;
    .locals 5

    iget-boolean v0, p0, Lw0/l;->g:Z

    if-nez v0, :cond_1

    iget v0, p0, Lw0/l;->c:I

    invoke-static {v0}, Lw0/x;->a(I)Landroid/text/TextDirectionHeuristic;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    iget-object v3, p0, Lw0/l;->a:Ljava/lang/CharSequence;

    iget-object v4, p0, Lw0/l;->b:Landroid/text/TextPaint;

    if-lt v1, v2, :cond_0

    invoke-static {v3, v4, v0}, Lw0/a;->b(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v3, v4, v0}, Lw0/b;->b(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;)Landroid/text/BoringLayout$Metrics;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lw0/l;->f:Landroid/text/BoringLayout$Metrics;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw0/l;->g:Z

    :cond_1
    iget-object v0, p0, Lw0/l;->f:Landroid/text/BoringLayout$Metrics;

    return-object v0
.end method

.method public final b()F
    .locals 7

    iget v0, p0, Lw0/l;->d:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lw0/l;->d:F

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lw0/l;->a()Landroid/text/BoringLayout$Metrics;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, v0, Landroid/text/BoringLayout$Metrics;->width:I

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    int-to-float v0, v0

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    iget-object v3, p0, Lw0/l;->b:Landroid/text/TextPaint;

    iget-object v4, p0, Lw0/l;->a:Ljava/lang/CharSequence;

    if-gez v2, :cond_2

    const/4 v0, 0x0

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {v4, v0, v2, v3}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    move-result v0

    float-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v0, v5

    :cond_2
    cmpg-float v2, v0, v1

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    instance-of v2, v4, Landroid/text/Spanned;

    if-eqz v2, :cond_4

    check-cast v4, Landroid/text/Spanned;

    const-class v2, Lx0/f;

    invoke-static {v4, v2}, Lw0/r;->b(Landroid/text/Spanned;Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_5

    const-class v2, Lx0/e;

    invoke-static {v4, v2}, Lw0/r;->b(Landroid/text/Spanned;Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_5

    :cond_4
    invoke-virtual {v3}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v2

    cmpg-float v1, v2, v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    :goto_1
    iput v0, p0, Lw0/l;->d:F

    :goto_2
    return v0
.end method
