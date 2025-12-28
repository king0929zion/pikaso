.class public final Lw0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw0/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw0/g;->a:Lw0/g;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;FFFF)Z
    .locals 0

    invoke-static {p1, p2, p3, p4, p5}, LG1/i;->t(Landroid/graphics/Canvas;FFFF)Z

    move-result p1

    return p1
.end method

.method public final b(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z
    .locals 0

    invoke-static {p1, p2}, Lw0/f;->a(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z

    move-result p1

    return p1
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z
    .locals 0

    invoke-static {p1, p2}, Lw0/f;->b(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z

    move-result p1

    return p1
.end method
