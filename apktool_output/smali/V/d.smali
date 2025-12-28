.class public final LV/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:LV/d;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LV/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, LV/d;-><init>(FFFF)V

    sput-object v0, LV/d;->e:LV/d;

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LV/d;->a:F

    iput p2, p0, LV/d;->b:F

    iput p3, p0, LV/d;->c:F

    iput p4, p0, LV/d;->d:F

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    invoke-virtual {p0}, LV/d;->c()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v2, p0, LV/d;->a:F

    add-float/2addr v0, v2

    invoke-virtual {p0}, LV/d;->b()F

    move-result v2

    div-float/2addr v2, v1

    iget v1, p0, LV/d;->b:F

    add-float/2addr v2, v1

    invoke-static {v0, v2}, Lr2/a;->f(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()F
    .locals 2

    iget v0, p0, LV/d;->d:F

    iget v1, p0, LV/d;->b:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public final c()F
    .locals 2

    iget v0, p0, LV/d;->c:F

    iget v1, p0, LV/d;->a:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public final d(FF)LV/d;
    .locals 4

    new-instance v0, LV/d;

    iget v1, p0, LV/d;->a:F

    add-float/2addr v1, p1

    iget v2, p0, LV/d;->b:F

    add-float/2addr v2, p2

    iget v3, p0, LV/d;->c:F

    add-float/2addr v3, p1

    iget p1, p0, LV/d;->d:F

    add-float/2addr p1, p2

    invoke-direct {v0, v1, v2, v3, p1}, LV/d;-><init>(FFFF)V

    return-object v0
.end method

.method public final e(J)LV/d;
    .locals 5

    new-instance v0, LV/d;

    iget v1, p0, LV/d;->a:F

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result v2

    add-float/2addr v2, v1

    iget v1, p0, LV/d;->b:F

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result v3

    add-float/2addr v3, v1

    iget v1, p0, LV/d;->c:F

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result v4

    add-float/2addr v4, v1

    iget v1, p0, LV/d;->d:F

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    add-float/2addr p1, v1

    invoke-direct {v0, v2, v3, v4, p1}, LV/d;-><init>(FFFF)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LV/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LV/d;

    iget v1, p1, LV/d;->a:F

    iget v3, p0, LV/d;->a:F

    invoke-static {v3, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LV/d;->b:F

    iget v3, p1, LV/d;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, LV/d;->c:F

    iget v3, p1, LV/d;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, LV/d;->d:F

    iget p1, p1, LV/d;->d:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, LV/d;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, LV/d;->b:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget v2, p0, LV/d;->c:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget v1, p0, LV/d;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Rect.fromLTRB("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, LV/d;->a:F

    invoke-static {v1}, La/a;->j0(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LV/d;->b:F

    invoke-static {v2}, La/a;->j0(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LV/d;->c:F

    invoke-static {v2}, La/a;->j0(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LV/d;->d:F

    invoke-static {v1}, La/a;->j0(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
