.class public final LW/n;
.super LW/D;
.source "SourceFile"


# instance fields
.field public e:Landroid/graphics/Shader;

.field public f:J

.field public final synthetic g:Landroid/graphics/Shader;


# direct methods
.method public constructor <init>(Landroid/graphics/Shader;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW/n;->g:Landroid/graphics/Shader;

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, p0, LW/n;->f:J

    return-void
.end method


# virtual methods
.method public final h(FJLW/g;)V
    .locals 3

    iget-object v0, p0, LW/n;->e:Landroid/graphics/Shader;

    if-eqz v0, :cond_0

    iget-wide v1, p0, LW/n;->f:J

    invoke-static {v1, v2, p2, p3}, LV/f;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-static {p2, p3}, LV/f;->e(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, LW/n;->e:Landroid/graphics/Shader;

    const-wide p2, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide p2, p0, LW/n;->f:J

    goto :goto_0

    :cond_1
    iget-object v0, p0, LW/n;->g:Landroid/graphics/Shader;

    iput-object v0, p0, LW/n;->e:Landroid/graphics/Shader;

    iput-wide p2, p0, LW/n;->f:J

    :cond_2
    :goto_0
    iget-object p2, p4, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result p2

    invoke-static {p2}, LW/D;->b(I)J

    move-result-wide p2

    sget-wide v1, LW/r;->b:J

    invoke-static {p2, p3, v1, v2}, LW/r;->c(JJ)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p4, v1, v2}, LW/g;->c(J)V

    :cond_3
    iget-object p2, p4, LW/g;->c:Landroid/graphics/Shader;

    invoke-static {p2, v0}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    iput-object v0, p4, LW/g;->c:Landroid/graphics/Shader;

    iget-object p2, p4, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_4
    iget-object p2, p4, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p2}, Landroid/graphics/Paint;->getAlpha()I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x437f0000    # 255.0f

    div-float/2addr p2, p3

    cmpg-float p2, p2, p1

    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p4, p1}, LW/g;->a(F)V

    :goto_1
    return-void
.end method
