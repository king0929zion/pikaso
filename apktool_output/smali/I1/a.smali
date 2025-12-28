.class public abstract LI1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/animation/LinearInterpolator;

.field public static final b:Lt1/a;

.field public static final c:Lt1/a;

.field public static final d:Lt1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, LI1/a;->a:Landroid/view/animation/LinearInterpolator;

    new-instance v0, Lt1/a;

    sget-object v1, Lt1/a;->d:[F

    invoke-direct {v0, v1}, Lt1/b;-><init>([F)V

    sput-object v0, LI1/a;->b:Lt1/a;

    new-instance v0, Lt1/a;

    invoke-direct {v0}, Lt1/a;-><init>()V

    sput-object v0, LI1/a;->c:Lt1/a;

    new-instance v0, Lt1/a;

    sget-object v1, Lt1/a;->e:[F

    invoke-direct {v0, v1}, Lt1/b;-><init>([F)V

    sput-object v0, LI1/a;->d:Lt1/a;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-void
.end method

.method public static a(FFF)F
    .locals 0

    sub-float/2addr p1, p0

    mul-float/2addr p1, p2

    add-float/2addr p1, p0

    return p1
.end method

.method public static b(FFFFF)F
    .locals 1

    cmpg-float v0, p4, p2

    if-gtz v0, :cond_0

    return p0

    :cond_0
    cmpl-float v0, p4, p3

    if-ltz v0, :cond_1

    return p1

    :cond_1
    sub-float/2addr p4, p2

    sub-float/2addr p3, p2

    div-float/2addr p4, p3

    invoke-static {p0, p1, p4}, LI1/a;->a(FFF)F

    move-result p0

    return p0
.end method

.method public static c(FII)I
    .locals 0

    sub-int/2addr p2, p1

    int-to-float p2, p2

    mul-float/2addr p0, p2

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    add-int/2addr p0, p1

    return p0
.end method
