.class public final LC0/e;
.super Landroid/text/TextPaint;
.source "SourceFile"


# instance fields
.field public a:LW/g;

.field public b:LF0/g;

.field public c:I

.field public d:LW/G;

.field public e:LW/D;

.field public f:LD/D;

.field public g:LV/f;

.field public h:LY/c;


# virtual methods
.method public final a()LW/g;
    .locals 1

    iget-object v0, p0, LC0/e;->a:LW/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LW/g;

    invoke-direct {v0, p0}, LW/g;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, LC0/e;->a:LW/g;

    return-object v0
.end method

.method public final b(I)V
    .locals 1

    iget v0, p0, LC0/e;->c:I

    invoke-static {p1, v0}, LW/D;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LC0/e;->a()LW/g;

    move-result-object v0

    invoke-virtual {v0, p1}, LW/g;->b(I)V

    iput p1, p0, LC0/e;->c:I

    return-void
.end method

.method public final c(LW/D;JF)V
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iput-object v0, p0, LC0/e;->f:LD/D;

    iput-object v0, p0, LC0/e;->e:LW/D;

    iput-object v0, p0, LC0/e;->g:LV/f;

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    goto :goto_1

    :cond_0
    instance-of v1, p1, LW/J;

    if-eqz v1, :cond_1

    check-cast p1, LW/J;

    iget-wide p1, p1, LW/J;->e:J

    invoke-static {p1, p2, p4}, Lr2/a;->P(JF)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LC0/e;->d(J)V

    goto :goto_1

    :cond_1
    instance-of v1, p1, LW/n;

    if-eqz v1, :cond_7

    iget-object v1, p0, LC0/e;->e:LW/D;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, LC0/e;->g:LV/f;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    iget-wide v3, v1, LV/f;->a:J

    invoke-static {v3, v4, p2, p3}, LV/f;->a(JJ)Z

    move-result v1

    :goto_0
    if-nez v1, :cond_5

    :cond_3
    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v1, p2, v3

    if-eqz v1, :cond_4

    const/4 v2, 0x1

    :cond_4
    if-eqz v2, :cond_5

    iput-object p1, p0, LC0/e;->e:LW/D;

    new-instance v1, LV/f;

    invoke-direct {v1, p2, p3}, LV/f;-><init>(J)V

    iput-object v1, p0, LC0/e;->g:LV/f;

    new-instance v1, LA0/c;

    invoke-direct {v1, p1, p2, p3}, LA0/c;-><init>(LW/D;J)V

    sget-object p1, LD/I0;->a:LB0/a;

    new-instance p1, LD/D;

    invoke-direct {p1, v1}, LD/D;-><init>(Lo2/a;)V

    iput-object p1, p0, LC0/e;->f:LD/D;

    :cond_5
    invoke-virtual {p0}, LC0/e;->a()LW/g;

    move-result-object p1

    iget-object p2, p0, LC0/e;->f:LD/D;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, LD/D;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/graphics/Shader;

    :cond_6
    iput-object v0, p1, LW/g;->c:Landroid/graphics/Shader;

    iget-object p1, p1, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-static {p0, p4}, LC0/j;->b(Landroid/text/TextPaint;F)V

    :cond_7
    :goto_1
    return-void
.end method

.method public final d(J)V
    .locals 2

    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, LW/D;->C(J)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x0

    iput-object p1, p0, LC0/e;->f:LD/D;

    iput-object p1, p0, LC0/e;->e:LW/D;

    iput-object p1, p0, LC0/e;->g:LV/f;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_0
    return-void
.end method

.method public final e(LY/c;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LC0/e;->h:LY/c;

    invoke-static {v0, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, LC0/e;->h:LY/c;

    sget-object v0, LY/f;->b:LY/f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, LY/g;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LC0/e;->a()LW/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LW/g;->g(I)V

    invoke-virtual {p0}, LC0/e;->a()LW/g;

    move-result-object v0

    check-cast p1, LY/g;

    iget-object v0, v0, LW/g;->a:Landroid/graphics/Paint;

    iget v1, p1, LY/g;->b:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, LC0/e;->a()LW/g;

    move-result-object v0

    iget-object v0, v0, LW/g;->a:Landroid/graphics/Paint;

    iget v1, p1, LY/g;->c:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    invoke-virtual {p0}, LC0/e;->a()LW/g;

    move-result-object v0

    iget v1, p1, LY/g;->e:I

    invoke-virtual {v0, v1}, LW/g;->f(I)V

    invoke-virtual {p0}, LC0/e;->a()LW/g;

    move-result-object v0

    iget p1, p1, LY/g;->d:I

    invoke-virtual {v0, p1}, LW/g;->e(I)V

    invoke-virtual {p0}, LC0/e;->a()LW/g;

    move-result-object p1

    iget-object p1, p1, LW/g;->a:Landroid/graphics/Paint;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_2
    :goto_0
    return-void
.end method

.method public final f(LW/G;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LC0/e;->d:LW/G;

    invoke-static {v0, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, LC0/e;->d:LW/G;

    sget-object v0, LW/G;->d:LW/G;

    invoke-virtual {p1, v0}, LW/G;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LC0/e;->d:LW/G;

    iget v0, p1, LW/G;->c:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-nez v1, :cond_2

    const/4 v0, 0x1

    :cond_2
    iget-wide v1, p1, LW/G;->b:J

    invoke-static {v1, v2}, LV/c;->b(J)F

    move-result p1

    iget-object v1, p0, LC0/e;->d:LW/G;

    iget-wide v1, v1, LW/G;->b:J

    invoke-static {v1, v2}, LV/c;->c(J)F

    move-result v1

    iget-object v2, p0, LC0/e;->d:LW/G;

    iget-wide v2, v2, LW/G;->a:J

    invoke-static {v2, v3}, LW/D;->C(J)I

    move-result v2

    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final g(LF0/g;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LC0/e;->b:LF0/g;

    invoke-static {v0, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, LC0/e;->b:LF0/g;

    iget p1, p1, LF0/g;->a:I

    or-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    iget-object p1, p0, LC0/e;->b:LF0/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p1, LF0/g;->a:I

    or-int/lit8 v0, p1, 0x2

    if-ne v0, p1, :cond_2

    move v1, v2

    :cond_2
    invoke-virtual {p0, v1}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    :cond_3
    return-void
.end method
