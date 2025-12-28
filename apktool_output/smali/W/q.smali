.class public final LW/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LW/q;->a:LW/q;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Z)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-static {p1}, LW/a;->h(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LW/a;->q(Landroid/graphics/Canvas;)V

    :goto_0
    return-void
.end method
