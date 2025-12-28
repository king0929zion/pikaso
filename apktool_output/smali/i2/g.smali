.class public abstract Li2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li2/f;

.field public static b:Li2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li2/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Li2/f;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, Li2/g;->a:Li2/f;

    return-void
.end method
