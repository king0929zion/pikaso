.class public final LX1/d;
.super La/a;
.source "SourceFile"


# virtual methods
.method public final G(LX1/u;FF)V
    .locals 6

    mul-float v0, p3, p2

    const/high16 v1, 0x43340000    # 180.0f

    const/high16 v2, 0x42b40000    # 90.0f

    invoke-virtual {p1, v0, v1, v2}, LX1/u;->d(FFF)V

    float-to-double v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    float-to-double v2, p3

    mul-double/2addr v0, v2

    float-to-double p2, p2

    mul-double/2addr v0, p2

    double-to-float v0, v0

    const/4 v1, 0x0

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v4, v2

    mul-double/2addr v4, p2

    double-to-float p2, v4

    invoke-virtual {p1, v0, p2}, LX1/u;->c(FF)V

    return-void
.end method
