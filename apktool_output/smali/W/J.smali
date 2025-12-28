.class public final LW/J;
.super LW/D;
.source "SourceFile"


# instance fields
.field public final e:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LW/J;->e:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LW/J;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LW/J;

    iget-wide v3, p1, LW/J;->e:J

    iget-wide v5, p0, LW/J;->e:J

    invoke-static {v5, v6, v3, v4}, LW/r;->c(JJ)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final h(FJLW/g;)V
    .locals 2

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p4, p2}, LW/g;->a(F)V

    cmpg-float p2, p1, p2

    iget-wide v0, p0, LW/J;->e:J

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, LW/r;->d(J)F

    move-result p2

    mul-float/2addr p2, p1

    invoke-static {v0, v1, p2}, LW/r;->b(JF)J

    move-result-wide v0

    :goto_0
    invoke-virtual {p4, v0, v1}, LW/g;->c(J)V

    iget-object p1, p4, LW/g;->c:Landroid/graphics/Shader;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p4, LW/g;->c:Landroid/graphics/Shader;

    iget-object p2, p4, LW/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_1
    return-void
.end method

.method public final hashCode()I
    .locals 2

    sget v0, LW/r;->g:I

    iget-wide v0, p0, LW/J;->e:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SolidColor(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, LW/J;->e:J

    invoke-static {v1, v2}, LW/r;->i(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
