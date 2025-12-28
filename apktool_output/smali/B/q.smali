.class public final Lb/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb/q;->a:Lb/q;

    return-void
.end method


# virtual methods
.method public final a(Lo2/c;Lo2/c;Lo2/a;Lo2/a;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo2/c;",
            "Lo2/c;",
            "Lo2/a;",
            "Lo2/a;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    const-string v0, "onBackStarted"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackProgressed"

    invoke-static {p2, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackInvoked"

    invoke-static {p3, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackCancelled"

    invoke-static {p4, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb/p;

    invoke-direct {v0, p1, p2, p3, p4}, Lb/p;-><init>(Lo2/c;Lo2/c;Lo2/a;Lo2/a;)V

    return-object v0
.end method
