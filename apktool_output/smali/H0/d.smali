.class public final Lh0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh0/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh0/d;->a:Lh0/d;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;I)J
    .locals 1

    invoke-static {p1, p2}, Ld1/a0;->b(Landroid/view/MotionEvent;I)F

    move-result v0

    invoke-static {p1, p2}, Ld1/a0;->r(Landroid/view/MotionEvent;I)F

    move-result p1

    invoke-static {v0, p1}, Lr2/a;->f(FF)J

    move-result-wide p1

    return-wide p1
.end method
